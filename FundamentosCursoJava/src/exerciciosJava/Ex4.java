package exerciciosJava;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		/*
		 * Um Posto de combust�veis deseja determinar qual de seus produtos tem a
		 * prefer�ncia de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo c�digo (at� que seja v�lido). O programa
		 * ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combust�vel
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		System.out.println("digite o n�mero do produto:");
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			
			if (tipo == 1) {
				alcool += 1;
				System.out.println("digite o n�mero do produto:");
				
			}
			
			else if (tipo == 2) {
				gasolina += 1;
				System.out.println("digite o n�mero do produto:");
				
			}
			
			else if (tipo == 3) {
				diesel += 1;
				System.out.println("digite o n�mero do produto");
				
			}
			
			else {
				System.out.println("c�digo inv�lido digite novamente: ");

			}
				
			tipo = sc.nextInt();

		}
		
		
		
		System.out.printf("O resultado da pesquisa foi:%nGasolina: %d%nAcool: %d%nDiesel: %d%n", alcool,gasolina, diesel);
		
		
		sc.close();
		
	}
}
