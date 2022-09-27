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
		
		System.out.println("voc� digitou: " + x);
		
		// com n�meros inteiros
		
		System.out.println("digite um n�mero: ");
		
		int y = sc.nextInt();
		
		System.out.printf("voc� digitou o n�mero: %d %n", y);
		
		// com n�meros quebrados
		
		System.out.println("digite um n�mero real: ");
		
		double z = sc.nextDouble();
		
		System.out.printf("voc� digitou o n�mero real %.2f %n", z);
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
