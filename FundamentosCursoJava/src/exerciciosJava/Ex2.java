package exerciciosJava;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
	
	
	/*
	 * Uma operadora de telefonia cobra R$ 50.00 por um plano
	 * b�sico que d� direito a 100 minutos de telefone. Cada minuto
	 * que exceder a franquia de 100 minutos custa R$2.00. Fa�a um programa
	 * para ler a quantidade de minutos que uma pessoa consumiu, da� mostrar o valor a ser pago.
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor dos minutos utilizados: ");
		
		double contaFixa = 50.00;
		int minutosUtilizados = sc.nextInt();
		
		if (minutosUtilizados > 100) {
			contaFixa = contaFixa + (minutosUtilizados - 100) * 2;
			// ou contaFixa += (minutosUtilizados - 100) * 2;
		}
		
		else {
			System.out.println("erro");
		}
		
		System.out.println("O valor de sua conta �: " + contaFixa);
		
		
		
		sc.close();
		
		
	}
}
