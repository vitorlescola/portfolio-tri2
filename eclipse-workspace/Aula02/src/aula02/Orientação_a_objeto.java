package aula02;

import java.util.Scanner;

public class Orientação_a_objeto {
	private double valorHora;
    private int horasTrabalhadas;

    public Orientação_a_objeto(double valorHora, int horasTrabalhadas) {
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularSalarioBruto() {
        return valorHora * horasTrabalhadas;
    }

    public double calcularINSS() {
        return calcularSalarioBruto() * 0.10;
    }

    public double calcularFGTS() {
        return calcularSalarioBruto() * 0.11;
    }

    public double calcularIR() {
        double salarioBruto = calcularSalarioBruto();
        if (salarioBruto <= 900) {
            return 0;
        } else if (salarioBruto <= 1500) {
            return salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            return salarioBruto * 0.10;
        } else {
            return salarioBruto * 0.20;
        }
    }

    public double calcularSalarioLiquido() {
        return calcularSalarioBruto() - calcularIR() - calcularINSS();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        Orientação_a_objeto funcionario = new Orientação_a_objeto(valorHora, horasTrabalhadas);

        System.out.printf("Salário Bruto: %.2f\n", funcionario.calcularSalarioBruto());
        System.out.printf("(-) IR: %.2f\n", funcionario.calcularIR());
        System.out.printf("(-) INSS: %.2f\n", funcionario.calcularINSS());
        System.out.printf("FGTS: %.2f\n", funcionario.calcularFGTS());
        System.out.printf("Total de descontos: %.2f\n", funcionario.calcularIR() + funcionario.calcularINSS());
        System.out.printf("Salário Liquido: %.2f\n", funcionario.calcularSalarioLiquido());

        scanner.close();
    }
}