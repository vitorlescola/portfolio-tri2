package aula03;

import java.text.DecimalFormat;

public class Teste {
	public static void main(String[] args) {
		FolhaDePagamento folhafulano=new FolhaDePagamento(5, 220);
		Imposto imposto = new Imposto(); //new imposto é um objeto do tipo imposto 
		DecimalFormat formatador=new DecimalFormat("0.00"); //formatação do console
		
		double salarioBruto=folhafulano.calcularSalairoBruto();
		double ir=imposto.calcularIR(salarioBruto);
		double inss=imposto.calcularINSS(salarioBruto);
		double sindicato=imposto.calcularSindical(salarioBruto);
		double fgts=imposto.calcularFGTS(salarioBruto);
		double salarioLiquido=folhafulano.calcularFolha(salarioBruto, ir, inss, sindicato, fgts);
		
		System.out.println("Salário Bruto: \t\t"+ formatador.format(salarioBruto)); // \t manda para frente no console
		System.out.println("(-) IR (%5): \t\t"+ formatador.format(ir));  //formatador.format() faz a formatação do console, se não for usar coloca apenas "ir"
		System.out.println("(-) INSS (10%): \t"+ formatador.format(inss));
		System.out.println("Total de descontos: \t"+ formatador.format((ir+inss+sindicato)));
		System.out.println("Salario Liquido: \t\t"+ formatador.format(salarioLiquido));
		System.out.println("\nFGTS (11%): "+ formatador.format(fgts)); // \n pula linha no console
		}
}

/*double salarioBruto=1000;

double resultado=imposto.calcularFGTS(salarioBruto);  //criando uma var chamada "resultado", /chamando o metodo calcularFGTS do imposto

System.out.println(resultado);*/

/*	Imposto imposto=new Imposto(); //criando uma variavel chamado "imposto" do tipo "Imposto", baseado na classe Imposto /= instansiando o objeto
		FolhaDePagamento folhadepagamento=new FolhaDePagamento(5, 220); //metodo construtor obriga a paçar dois parametros
		FolhaDePagamento folhafulano=new FolhaDePagamento(50, 160);
		
		double salarioBruto=folhadepagamento.calcularSalairoBruto();
		double salarioBrutoFulano=folhafulano.calcularSalairoBruto();
		
		double resultado=imposto.calcularIR(salarioBruto);
		double resultado2=imposto.calcularIR(salarioBrutoFulano);
		
		System.out.println(resultado);
		System.out.println(resultado2);*/