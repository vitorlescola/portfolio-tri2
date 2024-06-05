package Ava1;

public class Main {
	
	public static void main(String[] args) {
		Turma turma=new Turma();
		Aluno aluno=new Aluno();
		Professor professor=new Professor();
		
		System.out.println("Sala:");
		turma.estaAberta();
		
		System.out.println("\nProfessor:");
		professor.definirNome(null);
		professor.definirTitulação(null);
		
		System.out.println("\nAlunos:");
		aluno.definirNome(null);
		aluno.definirMatricula(0);
	}
}