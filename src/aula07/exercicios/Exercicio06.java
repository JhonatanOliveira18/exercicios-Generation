package aula07.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// Scanner
		Scanner e = new Scanner(System.in);

		// Variáveis
		int n1, somaNum = 0, totalNum = 0;

		do {
			System.out.print("Digite um número: ");
			n1 = e.nextInt();

			if (n1 % 3 == 0 && n1 != 0) {
				somaNum += n1;
				totalNum ++;
			}	 
			
		} while (n1 != 0);

		e.close();

		float media =  (float) somaNum / totalNum;
		
		System.out.println("A média de todos os números múltiplos de 3 é: " + media);

	}

}
