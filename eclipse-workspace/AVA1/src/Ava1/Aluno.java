package Ava1;

public class Aluno {
	String nome;
	int matricula;
	
    public void definirNome(String nome) {
		this.nome=nome;
		nome="Marquinhos";
		System.out.println(nome);
	}
	
	public void obterNome() {
		System.out.println(nome);
	}
	
	public void definirMatricula(int matricula) {
		this.matricula=matricula;
		matricula=69;
		System.out.println(matricula);
	}
	
	public void obterMatricula() {
		System.out.println(matricula);
	}
}