package aula07.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		// Scanner
		Scanner e = new Scanner(System.in);
		
		// Variáveis
		int n1, n2;
		
		// Entrada de dados
		System.out.println("Digite o primeiro número do intervalo: ");
		n1 = e.nextInt();
		
		System.out.println("\nDigite o último número do intervalo.  "
				+ "\nObs: caso insira um número menor, o programa será encerrado.");
		n2 = e.nextInt();
		
		// Fechando Scanner
		e.close();
		
		// Estrutura condicional para verificar se o usuário digitou o número da maneira correta.
		if(n2 < n1) {
			System.out.println("Você é teimoso ein...\nPrograma encerrado: Intervalo inválido."); //Mensagem amigavel
			return;
		}
		
		// Mensagem para iniciar a apresentação do resultado
		System.out.println("No Intervalo entre " + n1 + " e " + n2 +":");
		
		//Estrutura de repetição que verifica os valores múltiplos de 5 e 3
		for(int i = n1; i <= n2; i++ ) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i +" é múltiplo de 3 e 5");
			}
		}
		
		//Mensagem final
		System.out.println("Fim do programa.");
	}
}

//Notas para entendimento do programa

//Ler dois numeros
//Segundo numero maior que o primeiro
//se o numero 1 for maior que o segundo numero eibir mensagem e sair do programa
//No intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5.
//Numeros multiplos de 3 e 5, ao serem dividos precisam ter resto zero *utilizar %*
//Para definir o intervalo é necessário iniciar a contagem a partir do primeiro numero informado (n1) e ir até o último n2 indo um por um
