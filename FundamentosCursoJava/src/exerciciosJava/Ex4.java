package exerciciosJava;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		/*
		 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
		 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
		 * será encerrado quando o código informado for o número 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combustível
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		System.out.println("digite o número do produto:");
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			
			if (tipo == 1) {
				alcool += 1;
				System.out.println("digite o número do produto:");
				
			}
			
			else if (tipo == 2) {
				gasolina += 1;
				System.out.println("digite o número do produto:");
				
			}
			
			else if (tipo == 3) {
				diesel += 1;
				System.out.println("digite o número do produto");
				
			}
			
			else {
				System.out.println("código inválido digite novamente: ");

			}
				
			tipo = sc.nextInt();

		}
		
		
		
		System.out.printf("O resultado da pesquisa foi:%nGasolina: %d%nAcool: %d%nDiesel: %d%n", alcool,gasolina, diesel);
		
		
		sc.close();
		
	}
}
