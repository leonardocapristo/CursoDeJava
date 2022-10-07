package application;

public class Caneta {

	public String modelo;
	public double ponta;
	
	
	public Caneta() {
		
	}
	public Caneta(String modelo, double ponta) {
		this.modelo = modelo;
		this.ponta = ponta;
	}
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Caneta modelo = " + modelo + ", ponta=" + ponta;
	}
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPonta() {
		return ponta;
	}
	public void setPonta(double ponta) {
		this.ponta = ponta;
	}
	
	

}
