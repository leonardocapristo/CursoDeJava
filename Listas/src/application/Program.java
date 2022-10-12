package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered ?");
		int n  = sc.nextInt();
		
		
		List<Employee> lista = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			
			System.out.println("Employee #" + i + " : ");
			System.out.println("ID :");
			Integer id = sc.nextInt();
			
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Double: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary); 
			
			lista.add(emp);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
