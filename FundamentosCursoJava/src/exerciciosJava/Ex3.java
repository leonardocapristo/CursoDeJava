package exerciciosJava;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {

		/*
		 * Escreva um programa que repita a leitura de uma senha at� que ela seja
		 * v�lida. Para cada leitura de senha incorreta informada, escrever a mensagem
		 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
		 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
		 * correta � o valor 2002.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("por favor digite sua senha: ");
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("acesso negado, tente novamente: ");
			senha = sc.nextInt();
		
		}
		
		System.out.println("acesso liberado !");
		
		
		sc.close();
		
		
	}
}
