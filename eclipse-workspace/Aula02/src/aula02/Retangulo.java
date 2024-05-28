package aula02;

public class Retangulo {
	public static void main(String[] args) {
		float base=4;
		float altura=6;
		float area;
		
		boolean a=true;
		
		//calcular a area do retangulo
		area=base*altura;
		
		//imprimir as variaveis printing the variables
		System.out.println("A base é: "+base);
		System.out.println("A altura é: "+altura);
		System.out.println("A área do retangulo é: "+area);
		
		System.out.println(!a);  //!a é igual o "not" do booleano //xor retorna verdadeiro se vv ou ff
	}
}