package aula07.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		// Scanner
		Scanner e = new Scanner(System.in);
		
		// Variáveis
		int idade = 1, totalPessoasMenor = 0, totalPessoasMaior = 0;

		// Mensagem inicial
		System.out.println("======= Inicio do Programa ======"
				+ "\nCertifique-se de inserir idades maiores que 0, caso o contrário o programa será encerrado."
				+ ", porém isso pode ser útil caso tenha a intenção de ver o resultado.");
		
		// Entrada de dados
		
		while(idade > 0) {
			System.out.println("Digite uma idade: ");
			idade = e.nextInt();
			
			if(idade < 21 && idade >= 1) {
				totalPessoasMenor ++;
			}else if(idade > 50) {
				totalPessoasMaior ++;
			}else if(idade < 0) {
				break;
			}
			
		}
		
		// Fechando Scanner
		e.close();
		
		// Exibindo resultado
		System.out.println("\nTotal de pessoas menores de 21 anos: " + totalPessoasMenor 
						  +"\nTotal de pessoas maiores de 50 anos: " + totalPessoasMaior);
	}

}
