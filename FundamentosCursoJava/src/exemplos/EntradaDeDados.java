package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// com strings
		
		System.out.println("digite algo: ");
		
		Scanner sc = new Scanner(System.in);
		
		String x = sc.nextLine();
		
		System.out.println("você digitou: " + x);
		
		// com números inteiros
		
		System.out.println("digite um número: ");
		
		int y = sc.nextInt();
		
		System.out.printf("você digitou o número: %d %n", y);
		
		// com números quebrados
		
		System.out.println("digite um número real: ");
		
		double z = sc.nextDouble();
		
		System.out.printf("você digitou o número real %.2f %n", z);
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
