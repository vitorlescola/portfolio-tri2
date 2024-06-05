package Ava1;


public class Professor {
		
	String nome;
	String titulação;
	
	public void definirNome(String nome) {
		this.nome=nome;
		nome="Fulano";
		System.out.println(nome);
	}
	
	public void obterNome() {
		System.out.println(nome);
	}
	
	public void definirTitulação(String titulo) {
		titulação="historia";
		System.out.println(titulação);
	}
	
	public void obterTitulação() {
		System.out.println(titulação);
	}
}