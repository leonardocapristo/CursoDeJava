package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order pedido = new Order(1080, new Date(), OrderStatus.PAGAMENTO_PENDENTE);
		
		System.out.println(pedido);
	}
}
