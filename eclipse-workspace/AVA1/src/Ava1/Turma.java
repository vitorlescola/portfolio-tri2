package Ava1;

public class Turma {
	String codigo;
	String sala;
	double horario;
	
	public void estaAberta() {
		int aberto=1;
		if (aberto!=0) {
			System.out.println("A turma esta aberta");
		}else {
			System.out.println("A turma não esta aberta");
		}
	}
	
	public void definirProfessor(String professor){
		Professor prof=new Professor();
		
		prof.definirNome(professor);
	}
	
	public void incluirAluno(String aluno) {
		Aluno alu=new Aluno();
		
		alu.definirNome(aluno);
	}
	
}