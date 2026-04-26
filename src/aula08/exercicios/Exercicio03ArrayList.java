package aula08.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio03ArrayList {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		for(int i = 0; i < 5; i++) {
			
		System.out.println("Insira a " + (i + 1) + "° cor:");
		String cor = e.nextLine();
		
		//Adição das cores
		cores.add(cor);
		}
		
		e.close();
		
		System.out.println("\nListar todas as cores: " + cores);
		
		//Ordena em ordem crescente
		cores.sort(null);
		
		System.out.println("\nOrdenar as cores: " + cores);
	}

}
