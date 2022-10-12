package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * métodos de atribuir objetos com construtores
		 *
		 */
		
		//01 - usando getters e setters 
		
		
		Caneta c1 = new Caneta();  // isso é um construtor padrão
		
		c1.setModelo("bic");
		c1.setPonta(0.5);
		
		System.out.println(c1);
		

		
		//02 - passando direto no construtor
		
		Caneta c2 = new Caneta("faber castel", 0.7); // isso é um construtor personalizado
		
		System.out.println(c2);
		
		
		//03 - alocando em variáveis e passando no construtor depois
		
		String testeModelo = "Cisco";
		double testePonta = 0.9;
		
		Caneta c3 = new Caneta(testeModelo, testePonta);
		
		System.out.println(c3);
		
		
		
		
		
		
		sc.close();
	}
}
