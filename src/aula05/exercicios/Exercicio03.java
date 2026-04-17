package aula05.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		// Instanciando um objeto da Classe Scanner
		Scanner e = new Scanner(System.in);
		
		//Mensagem inicial
		System.out.println("======= PROGRAMA DE CÁLCULO DE SALÁRIO LÍQUIDO ======= ");
		
		// Declaração das variáveis
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		// Entrada de dados
		System.out.print("Insira o valor do salário do bruto: ");
		salarioBruto = e.nextFloat();
		
		System.out.print("Insira o valor do adicional noturno: ");
		adicionalNoturno = e.nextFloat();
		
		System.out.print("Insira o valor das horas extras: ");
		horasExtras = e.nextFloat();
		
		System.out.print("Insira o valor dos descontos: ");
		descontos = e.nextFloat();
		
		// Fechando o Scanner
		e.close();
		
		// Cálculando o salário líquido com base nas informações passadas
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		// Saída de dados
		System.out.println("\nSalário Líquido: R$" + salarioLiquido);
		

	}

}
