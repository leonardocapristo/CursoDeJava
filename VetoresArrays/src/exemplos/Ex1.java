package exemplos;


import java.util.Locale;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		/*
		 * média das aluturas
		 */
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double vect[] = new double[n];

		for (int posicao = 0; posicao < n; posicao++) {

			vect[posicao] = sc.nextDouble();
		}

		double soma = 0;

		for (int i = 0; i < n; i++) {
			soma += vect[i];

		}
		
		double media = soma / n;
		
		System.out.println(media);

		sc.close();

	}
}
