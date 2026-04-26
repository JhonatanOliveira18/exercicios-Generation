package aula08.exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio05Set {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		int n;
		
		Set<Integer> numeros = new HashSet<Integer>();	
		
		System.out.println("Insira 10 valores inteiros *NÃO REPETIDOS*\n");
		
		
		for(int i = 0; i< 10; i++) {
			System.out.print("\nInsira o " + (i+1)+ "° valor: ");
			n = e.nextInt();
			
			numeros.add(n);
		}
		
		e.close();
		
		// Lista todos os elementos da Collection Set com o Objeto da Classe Iterator
		System.out.println("\n\nListar dados do Set: ");

		Iterator<Integer> inumeros = numeros.iterator();
		
		// Enquanto tiver um proximo item dentro da collection setFrutas?
		while (inumeros.hasNext()) {
			System.out.println(inumeros.next());
		}
	}

}
