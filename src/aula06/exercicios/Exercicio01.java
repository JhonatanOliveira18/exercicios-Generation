package aula06.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		//Scanner
		Scanner e = new Scanner(System.in);
		
		//Mensagem inicial
		System.out.println("======== INICIO DO PROGRAMA ========");
		
		// Declarando variáveis
		int n1,n2,n3,soma;
		
		// Entrada de dados
		System.out.println("Digite o número A: ");
		n1 = e.nextInt();
		
		System.out.println("Digite o número B: ");
		n2 = e.nextInt();
		
		System.out.println("Digite o número C: ");
		n3 = e.nextInt();
		
		// Fechando Scanner
		e.close();
		
		// Calculando a soma dos valores
		soma = n1 + n2;
		
		// Estrutura condicional
		
		if(soma > n3) {
			System.out.println("A soma de A + B é Maior do que C.");
		}
		else if (soma < n3){
			System.out.println("A soma de A + B é Menor do que C.");
		}
		else {
			System.out.println("A soma de A + B é Igual a C.");
		}
		

	}

}
