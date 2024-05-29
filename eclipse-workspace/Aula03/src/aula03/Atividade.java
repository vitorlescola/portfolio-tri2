package aula03;

import java.util.Scanner;

public class Atividade {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array para armazenar os votos de cada sistema operacional
        int[] votos = new int[6]; // Índices 0 a 5 representam os sistemas Windows Server, Unix, Linux, Netware, Mac OS e Outro, respectivamente
        
        // Variável para armazenar o total de votos
        int totalVotos = 0;
        
        // Ler os votos até que 0 seja informado
        int voto;
        do {
            System.out.println("Informe o voto (0 para encerrar): ");
            voto = scanner.nextInt();
            
            // Verificar se o voto é válido (entre 0 e 6)
            if (voto >= 0 && voto <= 5) {
                votos[voto]++; // Incrementar o voto no array
                totalVotos++; // Incrementar o total de votos
            } else if (voto != 0) {
                System.out.println("Voto inválido! Por favor, informe um número entre 0 e 5.");
            }
        } while (voto != 0);
        
        // Imprimir cabeçalho da saída
        System.out.println("Sistema Operacional     Votos   %");
        System.out.println("-------------------     -----   ---");
        
        // Array com os nomes dos sistemas operacionais
        String[] sistemas = {"Windows Server", "Unix", "Linux", "Netware", "Mac OS", "Outro"};
        
        // Imprimir os resultados de cada sistema operacional
        double percentual;
        for (int i = 0; i < 6; i++) {
            percentual = (double) votos[i] / totalVotos * 100;
            System.out.printf("%-23s %-7d %.0f%%\n", sistemas[i], votos[i], percentual);
        }
        
        // Imprimir total de votos
        System.out.println("-------------------     -----   -----");
        System.out.printf("Total                   %-7d\n\n", totalVotos);
        
        // Encontrar o sistema operacional mais votado
        int maxVotos = votos[0];
        int indiceMax = 0;
        for (int i = 1; i < 6; i++) {
            if (votos[i] > maxVotos) {
                maxVotos = votos[i];
                indiceMax = i;
            }
        }
        
        // Imprimir o vencedor da enquete
        System.out.println("O Sistema Operacional mais votado foi o " + sistemas[indiceMax] + ", com " + maxVotos + " votos,");
        System.out.printf("correspondendo a %.0f%% dos votos.\n", ((double) maxVotos / totalVotos * 100));
        
        // Fechar o scanner
        scanner.close();
    }
}
