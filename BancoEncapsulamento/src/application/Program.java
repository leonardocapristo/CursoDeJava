package application;

import java.util.Locale;
import java.util.Scanner;

import customers.Account;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.println("Enter your account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.println("Enter account holder:");
		sc.nextLine();
		String accountHolder = sc.nextLine();
		
		
		System.out.println("Is there na initial deposit (y/n)?");
		char response = sc.nextLine().charAt(0);
		
		if(response == 'y') {
			System.out.println("Enter inital deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(accountNumber, accountHolder, initialDeposit);
			
		}else {
			account = new Account(accountNumber, accountHolder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.whithdraw(withdrawValue);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
	
	
}
