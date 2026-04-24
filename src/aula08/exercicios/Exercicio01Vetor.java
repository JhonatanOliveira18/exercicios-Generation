package aula08.exercicios;

import java.util.Scanner;

public class Exercicio01Vetor {

	public static void main(String[] args) {
				
		Scanner e = new Scanner(System.in);
		
		int n;
		
		int vetor[] = {2,5,1,3,4,9,7,8,10,6};

		System.out.println("Digite o número que você deseja encontrar:");
		n = e.nextInt();
		
		for(int i = 0; i < 10; i++) {
			if(vetor[i] == n) {
				System.out.println("O número " + n + " está na posição: " + i);
			}
		}
		
		e.close();
		
	}

}
