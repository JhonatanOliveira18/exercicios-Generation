package aula06.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		//Scanner
		Scanner e = new Scanner(System.in);
		
		//Variáveis
		float n1,n2,resultado;
		int codigo;
		
		// Entrada de dados
		System.out.println("=========== CALCULADORA ============\n"
								  + "Código      |      Operação      | "
						          + "\n[1]         | Soma               |"
						          + "\n[2]         | Subtração          |"
						          + "\n[3]         | Multiplicação      |"
						          + "\n[4]         | Divisão            |"
						          );
		System.out.println("\nDigite o 1º número: ");
		n1 = e.nextFloat();

		System.out.println("\nDigite o 2º número: ");
		n2 = e.nextFloat();
				
		System.out.println("\nOperação: ");
		codigo = e.nextInt();
		
		//Fechando Scanner
		e.close();
		
		// Estrutura Condicional SWITCH-CASE
				switch (codigo) {
				case 1:
					resultado = n1 + n2;
					System.out.println(n1 + " + " + n2 + " = " +resultado);
					break;
				case 2:
					resultado = n1 - n2;
					System.out.println(n1 + " - " + n2 + " = " +resultado);
					break;
				case 3:
					resultado = n1 * n2;
					System.out.println(n1 + " x " + n2 + " = " +resultado);
					break;
				case 4:
					resultado = n1 / n2;
					System.out.println(n1 + " / " + n2 + " = " +resultado);
					break;
				default:
					System.out.println("Opção Inválida");
				}

	}

}
