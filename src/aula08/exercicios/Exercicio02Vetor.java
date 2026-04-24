package aula08.exercicios;

import java.util.Scanner;

public class Exercicio02Vetor {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		int somaValoresVetor = 0;
		float media;
		
		int vetor[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Digite o valor do índice: " + i + " do vetor: ");
			vetor[i] = e.nextInt();
			
			somaValoresVetor += vetor[i];
		}
		
		System.out.println("\nElementos nos índices ímpares:");
        for(int i = 1; i < 10; i += 2) {
            System.out.print(vetor[i] + " ");
        }
		
        System.out.println("\n\nElementos pares:");
        for(int i = 0; i < 10; i++) {
            if(vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }
        
		media = (float) somaValoresVetor / 10;
		
		System.out.println("\n\nSoma: " + somaValoresVetor);
		System.out.println("\nMédia: " + media);
		
		e.close();

	}

}
