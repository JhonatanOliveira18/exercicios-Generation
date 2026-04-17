package aula05.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		// Instanciando um objeto da Classe Scanner
		Scanner e = new Scanner(System.in);
		
		// Declaração das variáveis
		float nota1, nota2, nota3, nota4, media;
		
		//Mensagem inicial
		System.out.println("========= PROGRAMA DE CÁLCULO DE MÉDIAS ==========");
		
		// Entrada de dados
		System.out.println("Insira a primeira nota: ");
		nota1 = e.nextFloat();
		
		System.out.println("Insira a segunda nota: ");
		nota2 = e.nextFloat();

		System.out.println("Insira a terceira nota: ");
		nota3 = e.nextFloat();

		System.out.println("Insira a quarta nota: ");
		nota4 = e.nextFloat();
		
		// Fechando Scanner
		e.close();
		
		// Notas coletadas, calculando a média dos valores
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		// Saída de dados
		System.out.println("A média final foi: " + media);


	}

}
