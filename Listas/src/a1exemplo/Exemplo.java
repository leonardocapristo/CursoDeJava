package a1exemplo;

import java.util.ArrayList;
import java.util.List;

public class Exemplo {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		// adicionando na lista
		
		lista.add("maria");
		lista.add("leo");
		lista.add("bruno");
		
		
		
		//adicionando com endere�o
		
		lista.add(2, "sthefany");
		
		

		
		
		
		//remover da lista
		
		lista.remove("maria");
		lista.remove(1); // removendo por psi�ao
		
		
		
		//vendo tamanho da lista
		
		System.out.println(lista.size());
		
		
		/*
		 * for each s� pra ler
		 */
		
		for (String x : lista) {
			System.out.println(x);
		}
	}
}
