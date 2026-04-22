package aula06.exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		//Scanner
		Scanner e = new Scanner(System.in);
		
		//Variáveis
		float saldo = 1000, saque, deposito;
		int codigo;
		
		// Entrada de dados
		System.out.println("=========== BANCO GENERATION ============\n"
						 + "Código      |      Operação      |"
						 + "\n[1]         | Saldo            |"
						 + "\n[2]         | Saque            |"
					     + "\n[3]         | Depósito         |"
						 );
				
						
		System.out.println("\nOperação: ");
		codigo = e.nextInt();
		
		//Fechando Scanner
		e.close();
				
		// Estrutura Condicional SWITCH-CASE
		switch (codigo) {
		case 1:
			System.out.println("Saldo: " + saldo);
			break;
		case 2:
			System.out.println("Saque.");
			System.out.println("Insira o valor do saque: ");
			saque = e.nextFloat();
			if(saque > saldo) {
				System.out.println("Saldo insuficiente");
			}else {
				saldo -= saque;
				System.out.println("Novo saldo " + saldo);
			}
			break;
		case 3:
			System.out.println("Depósito.");
			System.out.println("Insira o valor do depósito: ");
			deposito = e.nextFloat();
			if(deposito <= 0) {
				System.out.println("O valor deve ser acima de 0.");
			}else {
				saldo += deposito;
				System.out.println("Novo saldo " + saldo);
			}
			break;
		default:
			System.out.println("Opção Inválida");
		}
	}

}
