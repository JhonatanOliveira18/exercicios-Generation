package aula08.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio04ArrayList {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);
		
		int n;
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("\nDigite o número que você deseja encontrar: ");
		n = e.nextInt();
		
		e.close();
		
		if(numeros.contains(n)) {
			// Mostra a nota inserida em uma determinada posição (indice)
			System.out.println("\nO número " + n + " está localizado na posição: " + numeros.indexOf(n));
		}else {
			System.out.println("O número "+ n +" não foi encontrado!\n");
		}
			
		
	}

}
