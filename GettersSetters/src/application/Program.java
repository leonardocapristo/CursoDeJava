package application;

import data.Caneta;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caneta c1 = new Caneta();
		
		
		/*
		 * s� funciona abrir direto o atributo desde que ele esteja p�blico
		 */
		
		c1.setModelo("bic");
		//c1.modelo = "teste";
		
		c1.setPonta(0.5);
		//c1.ponta = 0.05;
		
		
		/*
		 * oque muda � oque os atributos s�o chamados pelos metodos get e set ao inves do atributo direto
		 */
		
		
		System.out.println("tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
		
		// System.out.println(tenho uma caneta " + c1.modelo + " de ponta " + c1.ponta);

	}

}
