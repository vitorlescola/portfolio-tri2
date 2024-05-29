package aula03;

public class LaçosDeRepetição {

	/*public static void main(String[] args) {
		int i=0;
		
		while (i<=5) {
			System.out.println(i);
			i++;   //+=numero (aumenta x), -=numero(diminui x) exe +=10 aumenta 10 
		}
	}*/
	/*public static void main(String[] args) {
		int i=0;
		
		do { //faça enquanto, sempre faz pelo menos uma vez
			System.out.println(i);
			i++;
		}
		while (i>5);
	}*/
	/*public static void main(String[] args) {
		for(int i=0; i<5; i++) {  //for (inicio; criterio de parada; incremento)
			System.out.println(i);
		}
	}*/
	/*public static void main(String[] args) {
		for(int i=0; i<5; i++) {  
			System.out.println("\neu sou o i");
			for (int j=0;j<3;j++) {
				System.out.println("eu sou o j");
			}
		}
	}*/
	/*public static void main(String[] args) {
		String [] alunos= {"Fulano","Fulana","Fulaninho","Fulão"};
		
		for (int i=0;i< alunos.length; i++) {
			System.out.println(alunos[i]);
		}
	}*/
	/*public static void main(String[] args) {
		String [] alunos= {"Fulano","Fulana","Fulaninho","Fulão"};
		
		int i=0;
		
		while(i<alunos.length) {
			System.out.println(alunos[i]);
			i++;
		}
	}*/
	public static void main(String[] args) {
		String [] alunos= {"Fulano","Fulana","Fulaninho","Fulão"};
		
		for(String i : alunos) {
			System.out.println(i);
		}
	}
}