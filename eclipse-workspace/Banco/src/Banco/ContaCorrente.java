package Banco;

public class ContaCorrente extends ContaBancaria{ //extends é herança
	private double limite=0;
	private double taxaJuros=0;
	
	public double calcularLimite(Boolean feio, boolean pobre, boolean crocs) {
		if (feio==true || pobre==true || crocs==true) {
			return limite=500;
		}else{
			return limite=5000;
		}
		
	}
	
	public void calcularJuros(Boolean limite, double valor) {
		if (limite==true) {
			taxaJuros = taxaJuros*0.10;
		}
	}

}