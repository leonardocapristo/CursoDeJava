package application;

import java.util.Locale;
import java.util.Scanner;

import employees.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Employee f1 = new Employee();
		
		f1.name = "João silva";
		f1.grossSalary = 6000;
		f1.tax = 1000;
		
		double netSalary = f1.netSalary();
		
		System.out.printf("employee: %s, salary: %.2f %n", f1.name, netSalary);
		
		System.out.println("which percentage to increase salary ?");
		double percentage = sc.nextDouble();
		
		double newSalary = f1.increaseSalary(percentage);
		
		System.out.printf("the new salary is: %.2f", newSalary);
		
		
		
		
		
		
		sc.close();
	}
	
	
	
	
	
	
}
