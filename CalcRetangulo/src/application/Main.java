package application;

import java.util.Locale;
import java.util.Scanner;

import calcRectangle.Rectangle;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Rectangle r = new Rectangle();
		
		System.out.println("enter the width of the rectangle: ");
		r.widht = sc.nextDouble();
		
		System.out.println("enter the height of the rectangle: ");
		r.height = sc.nextDouble();
		
		double area = r.area(r.widht, r.height);
		System.out.println("area: "+area);
		
		double perimeter = r.perimeter(r.widht, r.height);
		System.out.println("perimeter: " + perimeter);
		
		double diagonal = r.diagonal(r.widht, r.height);
		System.out.println("diagonal: " + diagonal);
		
		System.out.println("fim");
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
