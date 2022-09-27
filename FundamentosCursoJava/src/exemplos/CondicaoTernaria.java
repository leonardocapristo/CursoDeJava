package exemplos;

public class CondicaoTernaria {
	public static void main(String[] args) {

		double preco = 34.5;
		double desconto;
		if (preco < 20.0) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.05;
		}
		
		System.out.println(desconto);

		
		
		/*
		 * CONDI��O TERN�RIA
		 */
		
		//          ( condi��o ) ? valor_se_verdadeiro : valor_se_falso
		
		double preco2 = 34.5;
		double desconto2 = (preco2 < 20.0) ? preco2 * 0.1 : preco2 * 0.05;
		System.out.println(desconto2);
		
		
		
		
		
		
		
	}
}
