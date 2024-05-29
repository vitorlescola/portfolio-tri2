package aula03;

public class Scanner {
	public static void main(String[] args) {
	    java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("Insira um numero: ");
	    int num1=input.nextInt();
		
		System.out.println(num1);
	}
}