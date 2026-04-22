package aula06.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		// Scanner 
		Scanner e = new Scanner(System.in);
		
		// Mensagem inicial
		System.out.println("====== PROGRAMA DE VERIFICAÇÃO DE NÚMEROS ======");
		
		// Declarando variáveis
		int n1;
		
		// Entrada de dados
		System.out.println("Digite um número: ");
		n1 = e.nextInt();
		
		// Fechando Scanner
		e.close();
		
		// Estrutura condicional
		
		if(n1 > 0 && n1 % 2 == 0) {
			System.out.println("O número " + n1 + " é par e positivo!");
		}
		else if(n1 > 0 && n1 % 2 != 0) {
			System.out.println("O número " + n1 + " é ímpar e positivo!");
		}
		else if(n1 % 2 != 0) {
			System.out.println("O número " + n1 + " é ímpar e negativo!");
		}
		else {
			System.out.println("O número " + n1 + " é par e negativo!");
		}
		

	}

}
