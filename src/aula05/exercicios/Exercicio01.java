package aula05.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		//Instanciando objeto da Classe Scanner
		Scanner e = new Scanner(System.in);
		
		// Declaração das variáveis
		float salario;
		float abono;
		float novoSalario;
		
		// Entrada de dados
		System.out.print("Insira o valor do salário: R$");
		salario = e.nextFloat();
		
		System.out.print("Insira o valor do abono: R$");
		abono = e.nextFloat();
		
		// Fechando o Scanner
		e.close();
		
		// Somando os valores para descobrir o valor do novo salário
		novoSalario = salario + abono;
		
		//Saída dos dados
		System.out.print("O valor do novo salário é: R$" + novoSalario);
	}

}
