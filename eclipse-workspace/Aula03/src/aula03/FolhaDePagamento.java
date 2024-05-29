package aula03;

public class FolhaDePagamento {
	double valorHora;
	double horasTrabalhadas;
	
	public FolhaDePagamento(double valorHora, double horasTrabalhadas) { //metodo construtor, sempre tem o mesmo nome da classe, 
		this.valorHora=valorHora;  //esse valorHora(classe) é igual a valorHora(construtor)
		this.horasTrabalhadas=horasTrabalhadas;
	}
	
	public double calcularSalairoBruto() { //() vazio = não recebe parametro
		return this.valorHora*this.horasTrabalhadas;
	}
	public double calcularFolha (double salarioBruto, double ir, double inss, double sindicato, double fgts) {
		double descontos=ir+inss+sindicato;
		return salarioBruto+fgts-descontos;
	}
}