package aula06.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		/*
	 	Obs: O programa não possui tratamento rigorosos para caso de inserção de dados que fogem do
		que está sendo solicitado, visando ser mais objetivo e rápido na construção já que se trata de uma atividade simples
		*/
		
		// Scanner
		Scanner e = new Scanner(System.in);
		
		// Declarando variáveis
		String p1, p2, p3;
		
		// Mensagem inicial
		System.out.println("\t===== PROGRAMA DE VERIFICAÇÃO DE ANIMAL ====="
				+ "\nPrimeiro pense em um animal, em seguida responda as perguntas abaixo: ");

		// Entrada de dados
		System.out.println("\n 1. O seu animal é Vertebrado ou Invertebrado?");
		p1 = e.nextLine();
		
		// Estrutura Condicional
		if(p1.equalsIgnoreCase("Vertebrado")) {
			
			System.out.println("\nOK, a primeira caracteristica do seu animal é Vertebrado. "
					+ "\nCom base nisso, vamos prosseguir para próxima pergunta:"
					+ "\n2. O seu animal é uma Ave ou um Mamífero?");
			p2 = e.nextLine();
			
			if(p2.equalsIgnoreCase("Mamífero")) {
				System.out.println("\nHmm... Vertebrado e Mamífero. Entendi. Por último, me responda: "
						+ "\n3. Este animal é Oníviro ou Herbívoro?");
				p3 = e.nextLine();
				
				
				if(p3.equalsIgnoreCase("Herbívoro")) {
					System.out.println("\nO seu animal aparentemente é uma... VACA!");
				}else {
					System.out.println("\nO seu animal aparentemente é um... HOMEM!");
				}
				
			}else if(p2.equalsIgnoreCase("Ave")) {
				System.out.println("\nHmm... Tem ossos e é uma Ave. Entendi. Por último, me responda: "
						+ "\nEste animal é Oníviro ou Carnívoro?");
				p3 = e.nextLine();
				
				
				if(p3.equalsIgnoreCase("Onívoro")) {
					System.out.println("\nO seu animal aparentemente é um... POMBO!");
				}else {
					System.out.println("O seu animal aparentemente é uma... ÁGUIA!");
				}
			}
			
		}
		else if(p1.equalsIgnoreCase("Invertebrado")) {
			System.out.println("\nOK, a primeira caracteristica do seu animal é Invertebrado. "
					+ "\nCom base nisso vamos prosseguir para próxima pergunta:"
					+ "\n2. O seu animal é um Inseto ou um Anelídeo?");
			p2 = e.nextLine();
			
			if(p2.equalsIgnoreCase("Inseto")) {
				System.out.println("\nHmm... Inseto. Entendi. Por último, me responda: "
						+ "\n3. Este animal é Hematófago ou Herbívoro?");
				p3 = e.nextLine();
				
			
				if(p3.equalsIgnoreCase("Herbívoro")) {
					System.out.println("\nO seu animal aparentemente é uma... LAGARTA!");
				}else {
					System.out.println("\nO seu animal aparentemente é uma... PULGA!");
				}
				
			}else if(p2.equalsIgnoreCase("Anelídeo")) {
				System.out.println("\nHmm... Anelídeo. Entendi. Por último, me responda: "
						+ "\nEste animal é Hematófago ou Onívoro?");
				p3 = e.nextLine();
				
				
				if(p3.equalsIgnoreCase("Onívoro")) {
					System.out.println("\nO seu animal aparentemente é uma... MINHOCA!");
				}else {
					System.out.println("\nO seu animal aparentemente é uma... SANGUESSUGA!");
				}
			}
		}
		
		else {
			System.out.println("Opção inválida");
		}
		//Fechando Scanner
		e.close();
	}

}
