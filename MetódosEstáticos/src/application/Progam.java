package application;

import java.util.Scanner;

import util.Calculator;

public class Progam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		//chamei o método pela classe Calculator passando o método circumference assim : Calculator.circumference
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		System.out.println("fim do programa");
		sc.close();
	}

}
