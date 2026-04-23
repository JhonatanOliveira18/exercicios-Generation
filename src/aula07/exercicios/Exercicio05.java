package aula07.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		//Scanner
		Scanner e = new Scanner(System.in);
		
		//Variáveis
		int n1, somaNum = 0;
		
		do{
			System.out.print("Digite um número: ");
			n1 = e.nextInt();
			
			if(n1 > 0) {
				somaNum += n1;
			}
			
			
		}while(n1 != 0);

		e.close();
		
		System.out.println("A soma dos números positivos é: " + somaNum);
	}

}
