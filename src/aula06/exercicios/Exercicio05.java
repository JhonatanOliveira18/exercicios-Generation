package aula06.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		//Scanner
		Scanner e = new Scanner(System.in);
		
		//Declarando variáveis
		int codigoProduto, quantidade, valorTotal;
		
		//Entrada de dados
		System.out.println("=========== MENU ============\n"
				          
				          + "\n[1] | CACHORRO QUENTE | R$ 10.00"
				          + "\n[2] | X-SALADA        | R$ 15.00"
				          + "\n[3] | X-BACON         | R$ 18.00"
				          + "\n[4] | BAURU           | R$ 12.00"
				          + "\n[5] | REFRIGERANTE    | R$ 8.00"
				          + "\n[6] | SUCO DE LARANJA | R$ 13.00"
				          + "\nDigite o código do produto desejado:");
		codigoProduto = e.nextInt();
		
		System.out.println("Escolha a quantidade: ");
		quantidade = e.nextInt();
		
		//Fechando Scanner
		e.close();
		
		// Estrutura Condicional SWITCH-CASE
		switch(codigoProduto) {
			case 1:
				valorTotal = quantidade * 10;
				System.out.println("Produto: Cachorro Quente"
						+ "\nValor total: R$" + valorTotal+",00");
			break;
			case 2:
				valorTotal = quantidade * 15;
				System.out.println("Produto: X-Salada"
						+ "\nValor total: R$" + valorTotal+",00");
			break;
			case 3:
				valorTotal = quantidade * 18;
				System.out.println("Produto: X-Bacon"
						+ "\nValor total: R$" + valorTotal+",00");
			break;
			case 4:
				valorTotal = quantidade * 12;
				System.out.println("Produto: Bauru"
						+ "\nValor total: R$" + valorTotal+",00");
			break;
			case 5:
				valorTotal = quantidade * 8;
				System.out.println("Produto: Refrigerante"
						+ "\nValor total: R$" + valorTotal+",00");
			break;
			case 6:
				valorTotal = quantidade * 13;
				System.out.println("Produto: Suco de Laranja"
						+ "\nValor total: R$" + valorTotal+",00");
			break;
			default:
				System.out.println("Opção Inválida");
		}
	}

}
