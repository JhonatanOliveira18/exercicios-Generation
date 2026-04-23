package aula06.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		// Scanner
		Scanner e = new Scanner(System.in);
		
		// Mensagem inicial
		System.out.println("======= PROGRAMA DE VERIFICAÇÃO DE DOADORES DE SANGUE ========");
		
		// Declarando variáveis
		String nomeDoador;
		int idadeDoador;
		boolean primeiraDoacao;
		
		// Entrada de dados
		System.out.println("Digite o nome do doador: ");
		nomeDoador = e.nextLine();
		
		System.out.println("Digite a idade do doador: ");
		idadeDoador = e.nextInt();
		
		System.out.println("Primeira doação de sangue? ");
		primeiraDoacao = e.nextBoolean();
		
		// Fechando Scanner
		e.close();
		
		// Estrutura condicional
		if(idadeDoador < 18 || idadeDoador > 69) {
			System.out.println(nomeDoador + " não está apto para doar sangue.");
		}
		else if(idadeDoador >= 60 && primeiraDoacao) {
			System.out.println(nomeDoador + " não está apto para doar sangue.");
		}
		else {
			System.out.println(nomeDoador + " está apto para doar sangue.");
		}
		
		
		
		
		
		
		
		
		// para doar sangue é necessário ter entre 18 e 69 anos
		// pessoas com idade entre 60 e 69 so podem doar se não for sua primeira doação

	}

}
