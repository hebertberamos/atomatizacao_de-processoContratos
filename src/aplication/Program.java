package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter contract Date: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double valueContract = sc.nextDouble();
		
		Contract contract = new Contract(number, date, valueContract);
		
		System.out.print("Enter number of installments: ");
		int n = sc.nextInt();
		
		
		ContractService cs = new ContractService(new PaypalService());
		cs.processContract(contract, n);
		
		System.out.println("Installments: ");
		for(Installment it : contract.getInstalllments()){
			System.out.println(it);
		}
		
		
		sc.close();
	}

}
