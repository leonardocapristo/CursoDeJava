package application;

import java.util.Locale;
import java.util.Scanner;

import calc.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		double dollarQuantity = sc.nextDouble();
		
		double result = CurrencyConverter.dollarConverter(dollarPrice, dollarQuantity);
		
		System.out.println(result);
		
		
		sc.close();
	}
	
	
	
	
	
	
	
	
	
	
	
}
