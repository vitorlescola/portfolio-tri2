package aula03;

public class Imposto {  //classe que só vai calcular imposto(e o FGTS kk)
	
	final double AliquotaIR []= {0, 0.05, 0.10, 0.20}; //criando vetor
	final double AliquotaINSS=0.1; //final indica que é uma constante
	final double AliquotaSindical=0.03; //constante começa com letra MAIUSCOLA
	final double AliquotaFGTS=0.11;
	
	public double calcularIR(double salarioBruto) { //public=pode ser visto em qualquer lugar /double=retorna um valor, sendo double(se n devolver valor=void) /calcularIR=nome do metodo /double salarioBruto=reçebe de parametro  
		if (salarioBruto >= 2500) {
			return salarioBruto*AliquotaIR[3];
		}else if (salarioBruto >= 1500) {
			return salarioBruto*AliquotaIR[2];
		}else if (salarioBruto >= 900) {
			return (salarioBruto*AliquotaIR[1]);
		}else {
			return salarioBruto;
		}
	}
	public double calcularINSS(double salarioBruto) {
		return salarioBruto*AliquotaINSS;
	}
	public double calcularSindical(double salarioBruto) {
		return salarioBruto*AliquotaSindical;
	}
	public double calcularFGTS(double salarioBruto) {
		return salarioBruto*AliquotaFGTS;
	}
}