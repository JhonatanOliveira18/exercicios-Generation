package aula07.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		//Scanner
		Scanner e = new Scanner(System.in);
		
		//Variáveis
		int n1, numerosPares = 0, numerosImpares = 0;
		
		
		//Entrada de dados
		for(int i = 1; i < 11; i++) {
        	System.out.println("Digite o " + i + "º número: ");
            n1 = e.nextInt();
        	
            if(n1 % 2 == 0) {
            	numerosPares++;
            }else {
            	numerosImpares++;
            }   
        }
		
		//Fechando Scanner
		e.close();
		
		// Exibindo resultado
		System.out.println("\nTotal de números pares: " + numerosPares 
						  +"\nTotal de número ímpares: " + numerosImpares);

		
		
	}

}
