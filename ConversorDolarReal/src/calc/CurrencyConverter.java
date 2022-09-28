package calc;

public class CurrencyConverter {
	
	public double dollarPrice;
	
	
	public static double dollarConverter(double dollarPrice,double dollarQuantity) {
		return dollarPrice * dollarQuantity + (dollarPrice * 0.06) ;
	}

	
	
	
	
}
