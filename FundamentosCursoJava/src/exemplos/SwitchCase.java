package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da
		 * semana (sendo 1=domingo, 2=segunda, e assim por diante). Escrever na tela o
		 * dia da semana correspondente, conforme exemplos.
		 */
		
		System.out.println("Digite o número do dia da semana: ");

		int x = sc.nextInt();
		String dia;
		switch (x) {
		
		case 1:
			dia = "domingo";
			break;

		case 2:
			dia = "segunda";
			break;

		case 3:
			dia = "terca";
			break;

		case 4:
			dia = "quarta";
			break;

		case 5:
			dia = "quinta";
			break;

		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;

		default:
			dia = "valor invalido";
			break;

		}
		
		System.out.println("Dia da semana: " + dia);
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
