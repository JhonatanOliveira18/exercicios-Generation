package aula09.exercicios;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01Fila {

	public static void main(String[] args) {
		
		// =================================================
		
		Scanner e = new Scanner(System.in);
		
		int opcao;
		String escolha = "s";
		String nome;
		
		Queue<String> fila = new LinkedList<String>();
		
		// ==================================================
		
		do {
			System.out.println("======================================");
			System.out.println("\nESCOLHA UMA DAS OPÇÕES ABAIXO:");
			System.out.println("\n[1] Adicionar um novo cliente na fila."
							 + "\n[2] Listar todos os clientes."
							 + "\n[3] Retirar cliente da fila."
							 + "\n[4] Excluir todos os clientes da fila."
							 + "\n[0] Sair"
							 + "\n========================");
			opcao = e.nextInt();
			e.nextLine();
			// ==========================================================
			
			switch(opcao){
				case 1:
					System.out.println("\nOPÇÃO: ADICIONAR CLIENTE");
					System.out.print("\nNome do cliente: ");
					nome = e.nextLine();
					fila.add(nome);
					System.out.println("\nCliente Adicionado!");
					System.out.println("======================================");
					break;
				case 2:	
					System.out.println("\nOPÇÃO: LISTAR CLIENTES");
					Iterator<String> iterator = fila.iterator();
					System.out.println("Clientes na fila: ");
					while(iterator.hasNext()) {
						System.out.println(iterator.next());
					}
					System.out.println("======================================");
					break;
				case 3: 
					System.out.println("\nOPÇÃO: CHAMAR (RETIRAR) CLIENTE DA FILA");
					if(!fila.isEmpty()) {
						System.out.println("\nChamando o cliente: " + fila.poll());
						System.out.println("Fila atual: " + fila);
					}else {
						System.out.println("A fila está vazia.");
					}
					System.out.println("======================================");
					break;
				case 4:
					System.out.println("\nOPÇÃO: LIMPAR FILA");
					System.out.print("\nDeseja realmente remover todos os clientes da fila?"
									 + "\n[S] SIM\n[N] NÃO\nRESPOSTA:");
					String remocao = e.nextLine();
					
					if(remocao.equalsIgnoreCase("s")) {
						if(!fila.isEmpty()) {
						fila.clear();
						}else {
						System.out.println("\nERRO: Não foi possivel limpar a fila.\nA fila já está vazia.");
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
