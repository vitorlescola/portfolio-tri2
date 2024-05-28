package aula02;

import java.util.Scanner;  //importando o scanner

public class Atividade {
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in); //criando um scanner chamado "scanner"

	        System.out.print("Digite o valor da hora trabalhada: ");  
	        double valorHora = scanner.nextDouble();  //obtendo os dados, criando um double chamado "valorHora"

	        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
	        int horasTrabalhadas = scanner.nextInt(); //obtendo os dados, criando um int chamado "valorHora"

	        double salarioBruto = valorHora * horasTrabalhadas; //calculo, double salarioBruto=valorHora vezes horasTrabalhadas

	        double inss = salarioBruto * 0.10; //calcula os descontos do INSS, sendo 10% do salario bruto
	        double fgts = salarioBruto * 0.11; //calcula os descontos do FGTS, sendo 11% do salario bruto

	        double ir; //calculo do imposto de renda
	        if (salarioBruto <= 900) { //se o salario bruto for menor que 900 o IR é igual a 0%
	            ir = 0;
	        } else if (salarioBruto <= 1500) { //se o salario bruto for menor igual que 1500 o IR é igual a 5%
	            ir = salarioBruto * 0.05;
	        } else if (salarioBruto <= 2500) { //se o salario bruto for menor igual que 2500 o IR é igual a 10%
	            ir = salarioBruto * 0.10;
	        } else {                           //se o salario bruto for maior que 2500 o IR é igual a 20%
	            ir = salarioBruto * 0.20;
	        }

	        double totalDescontos = ir + inss;  //calculando o total dos descontos, somando o IR e o INSS
	        double salarioLiquido = salarioBruto - totalDescontos;  //calculando o salario liquido, desconto os descontos do salario bruto

	        System.out.printf("Salário Bruto: %.2f\n", salarioBruto); //%.2f indica que deve ser exibido com duas casas decimais
	        System.out.printf("(-) IR: %.2f\n", ir);
	        System.out.printf("(-) INSS: %.2f\n", inss);
	        System.out.printf("FGTS: %.2f\n", fgts);
	        System.out.printf("Total de descontos: %.2f\n", totalDescontos);
	        System.out.printf("Salário Liquido: %.2f\n", salarioLiquido);

	        scanner.close(); //fechando o scanner
	}
}