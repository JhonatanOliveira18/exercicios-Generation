package aula09.exercicios;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;


import java.util.Scanner;

public class Exercicio02Pilha {

	public static void main(String[] args) {
		
		// =================================================
		
				Scanner e = new Scanner(System.in);
				
				int opcao;
				String escolha = "s";
				String livro;
				
				Deque<String> pilha = new ArrayDeque<String>();
				
				// ==================================================
				
				do {
					System.out.println("======================================");
					System.out.println("\nESCOLHA UMA DAS OPÇÕES ABAIXO:");
					System.out.println("\n[1] Adicionar um novo livro na pilha."
									 + "\n[2] Listar todos os livros."
									 + "\n[3] Retirar livro."
									 + "\n[4] Esvaziar a pilha de livros."
									 + "\n[0] Sair"
									 + "\n========================");
					opcao = e.nextInt();
					e.nextLine();
					// ==========================================================
					
					switch(opcao){
						case 1:
							System.out.println("\nOPÇÃO: ADICIONAR LIVRO");
							System.out.print("\nNome do livro: ");
							livro = e.nextLine();
							pilha.push(livro);
							System.out.println("\nLivro Adicionado!");
							System.out.println("======================================");
							break;
						case 2:	
							System.out.println("\nOPÇÃO: LISTAR LIVROS");
							Iterator<String> iterator = pilha.descendingIterator(); //Pesquisado fora da documentação como utilizar o iterator em pilhas
							System.out.println("Livros na pilha: ");
							while(iterator.hasNext()) {
								System.out.println(iterator.next());
							}
							System.out.println("======================================");
							break;
						case 3: 
							System.out.println("\nOPÇÃO: RETIRAR LIVRO DA PILHA");
							if(!pilha.isEmpty()) {
								System.out.println("\nRetirando o livro: " + pilha.pop());
								System.out.println("Pilha atual: " + pilha);
							}else {
								System.out.println("A pilha está vazia.");
							}
							System.out.println("======================================");
							break;
						case 4:
							System.out.println("\nOPÇÃO: LIMPAR PILHA");
							System.out.print("\nDeseja realmente remover todos os livros da pilha?"
											 + "\n[S] SIM\n[N] NÃO\nRESPOSTA:");
							String remocao = e.nextLine();
							
							if(remocao.equalsIgnoreCase("s")) {
								if(!pilha.isEmpty()) {
								pilha.clear();
								}else {
								System.out.println("\nERRO: Não foi possivel remover os livros da pilha.\nA pilha já está vazia.");
								}
							}
							System.out.println("======================================");
							break;
						case 0:
							System.out.println("\nSaindo.........");
							e.close();
							return;
						default:
							System.out.println("\nOpção inválida.");
							
					// ==========================================================	
							
					}
					
					System.out.print("\nDeseja voltar ao menu de operações?\n[S] SIM\n[N] NÃO\nRESPOSTA: ");
					escolha = e.nextLine();
					
				}while(!escolha.equalsIgnoreCase("n"));
				
				//=====================================================
				e.close();
				System.out.println("\nFIM DO PROGRAMA.");

	}

}
