package aula06.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		// Scanner
		Scanner e = new Scanner(System.in);

		// Declarando variáveis
		String nome;
		int codigo;
		float salario, novoSalario;

		// Entrada de dados
		System.out.println("=========== TABELA FUNCIONÁRIOS ============\n"
						  + "Cód Cargo   |      Cargo      |  Percentual do Reajustes"
				          + "\n[1]         | Gerente         |  10%"
				          + "\n[2]         | Vendedor        |  7%"
				          + "\n[3]         | Supervisor      |  9%"
				          + "\n[4]         | Motorista       |  6%"
				          + "\n[5]         | Estoquista      |  5%"
				          + "\n[6]         | Técnico de TI   |  8%"
				          );
		System.out.println("\nNome do colaborador: ");
		nome = e.nextLine();

		System.out.println("\nCódigo do cargo: ");
		codigo = e.nextInt();
		
		System.out.println("\nSalário: ");
		salario = e.nextFloat();
		
		//Fechando Scanner
		e.close();

		// Estrutura Condicional SWITCH-CASE
		switch (codigo) {
		case 1:
			novoSalario = salario + (0.1f * salario);
			System.out.println("\nNome do colaborador: " + nome + "\nCargo: Gerente\nSalário: R$" + novoSalario);
			break;
		case 2:
			novoSalario = salario + (0.07f * salario);
			System.out.println("\nNome do colaborador: " + nome + "\nCargo: Vendedor\nSalário: R$" + novoSalario);
			break;
		case 3:
			novoSalario = salario + (0.09f * salario);
			System.out.println("\nNome do colaborador: " + nome + "\nCargo: Supervisor\nSalário: R$" + novoSalario);
			break;
		case 4:
			novoSalario = salario + (0.06f * salario);
			System.out.println("\nNome do colaborador: " + nome + "\nCargo: Motorista\nSalário: R$" + novoSalario);
			break;
		case 5:
			novoSalario = salario + (0.05f * salario);
			System.out.println("\nNome do colaborador: " + nome + "\nCargo: Estoquista\nSalário: R$" + novoSalario);
			break;
		case 6:
			novoSalario = salario + (0.08f * salario);
			System.out.println("\nNome do colaborador: " + nome + "\nCargo: Técnico de TI\nSalário: R$" + novoSalario);
			break;
		default:
			System.out.println("Opção Inválida");
		}

	}

}
