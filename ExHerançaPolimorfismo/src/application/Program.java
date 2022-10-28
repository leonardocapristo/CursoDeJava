package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import produtos.ImportedProduct;
import produtos.Product;
import produtos.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> lista = new ArrayList<>();

		System.out.println("Enter the number of products: ");
		Integer numberProducts = sc.nextInt();
	
		for (int i = 1; i <= numberProducts; i++) {
			System.out.println("Common, used or imported (c/u/i)? ");
			
			char tipo = sc.next().charAt(0);
			

			System.out.println("Name:");
			sc.nextLine();
			String nome = sc.nextLine();
			

			System.out.println("Price");
			double preco = sc.nextDouble();

			if (tipo == 'c') {
				lista.add(new Product(nome, preco));

			} else if (tipo == 'u') {
				System.out.println("Write date : ");
				sc.nextLine();
				String data = sc.nextLine();
				lista.add(new UsedProduct(nome, preco, data));

			} else {
				System.out.println("Write customs fee");
				Double customsFee = sc.nextDouble();
				lista.add(new ImportedProduct(nome, preco, customsFee));

			}

		}

		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product prod : lista) {
			System.out.println(prod.priceTag());
		}

		sc.close();
	}
}
