package Exercicio;

public class Main {
	public static void main(String[] args) {
		Modelos modelos=new Modelos();
		Consumo consumo=new Consumo();
		
		System.out.println("Comparativo de consumo de combustivel\n");
		modelos.modelos();
		consumo.km();
	}
}