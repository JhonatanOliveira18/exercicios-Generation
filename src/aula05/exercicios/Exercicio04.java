package aula05.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		// Instanciando objeto da Classe Scanner
		Scanner e = new Scanner(System.in);

		// Mensagem Inicial
		System.out.println("======== PROGRAMA DE CÁLCULO DA DIFERENÇA DOS PRODUTOS ========");

		// Declaração das variáveis
		float n1, n2, n3, n4, diferenca;

		// Entrada de dados
		System.out.print("Insira o primeiro valor: ");
		n1 = e.nextFloat();

		System.out.print("Insira o segundo valor: ");
		n2 = e.nextFloat();

		System.out.print("Insira o terceiro valor: ");
		n3 = e.nextFloat();

		System.out.print("Insira o quarto valor: ");
		n4 = e.nextFloat();

		// Fechando Scanner
		e.close();
		
		// Calculo da diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4
		diferenca = (n1 * n2) - (n3 * n4);
		
		// Saída de dados
		System.out.print("\nDiferença: " + diferenca);

	}

}
