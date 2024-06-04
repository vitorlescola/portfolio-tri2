package Banco;

public class ContaPoupança extends ContaBancaria{
	private float valorTR=0;
	
	public double calcularRendimento(double valor) {
		double selic=10.50;
		if (selic>8.5) {
			return  valor/0.5%+valorTR;
		}else {
			return  selic/70%+valorTR;
		}
	}
	
	public void valorTR(double valorTR) {
		valorTR=0.048;
	}
}