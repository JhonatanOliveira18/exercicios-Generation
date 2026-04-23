package aula07.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		//Scanner
		Scanner e = new Scanner(System.in);
		
		//Variáveis
		int idade, identidadeGenero, pessoaDesenvolvedora;
		int backend = 0, mulheresCisFront = 0, mulheresTransFront = 0, homensCis40Mobile = 0, homensTrans40Mobile = 0, naoBinariosFull30 = 0, totalPessoas = 0, mediaIdade = 0, totalIdades = 0;
		String continua = "s";
		
		// ======== Entrada de dados ==========
		while (!continua.equalsIgnoreCase("n")) {
			
			// 1. Coletando idade
			System.out.println("Idade: ");
			idade = e.nextInt();
			
			// 2. Coletando identidade de gênero
			System.out.print("\n\n=========== IDENTIDADE DE GÊNERO ============\n"
					  + "N° Correspondente   |      Gênero      |"
			          + "\n[1]         | Mulher Cis         |  "
			          + "\n[2]         | Homem Cis        |  "
			          + "\n[3]         | Não Binário      |  "
			          + "\n[4]         | Mulher Trans     |  "
			          + "\n[5]         | Homem Trans      |  "
			          + "\n[6]         | Outros           |  "
			          + "\nRESPOSTA: "
			          );
			identidadeGenero = e.nextInt();
			
			// 3. Coletando informação sobre a categoria da pessoa desenvolvedora
			System.out.print("\n\n=========== Pessoa Desenvolvedora  ============\n"
					  + "N° Correspondente   |     Categoria      |"
			          + "\n[1]               | Backend            |"
			          + "\n[2]               | Frontend           |"
			          + "\n[3]               | Mobile             |"
			          + "\n[4]               | FullStack          |"
			          + "\nRESPOSTA: "
			          );
			pessoaDesenvolvedora = e.nextInt();
			
			totalPessoas ++;
			totalIdades += idade;
			
			System.out.println("\nDeseja continuar a leitura dos dados de um novo colaborador ou não (S/N): ");
            continua = e.next();
            System.out.println("\n---------------------------------------------------------------------------------\n");
            
            // ========== Verificando dados ===========
            if(pessoaDesenvolvedora == 1) {
            	backend ++;
            }
            
            if(identidadeGenero == 1 && pessoaDesenvolvedora == 2) {
            	mulheresCisFront ++;
            }
            
            if(identidadeGenero == 4 && pessoaDesenvolvedora == 2) {
            	mulheresTransFront ++;
            }
            
            if(identidadeGenero == 2 && pessoaDesenvolvedora == 3 && idade > 40) {
            	homensCis40Mobile ++;
            }
            
            if(identidadeGenero == 5 && pessoaDesenvolvedora == 3 && idade > 40) {
            	homensTrans40Mobile ++;
            }
            
            if (identidadeGenero == 3 && pessoaDesenvolvedora == 4 && idade < 30) {
            	naoBinariosFull30 ++;
            }
            
        }
		
		e.close();
		
		mediaIdade = totalIdades / totalPessoas;
		
		// ========= Exibindo dados =========
        System.out.println("\t=== Resultado da Pesquisa ==="
        			      + "\n\nTotal de pessoas desenvolvedoras Backend: " + backend + ""
        		          + "\nTotal de Mulheres Cis desenvolvedoras FrontEnd: " + mulheresCisFront
        		          + "\nTotal de Mulheres Trans desenvolvedoras FrontEnd: " + mulheresTransFront
        		          + "\nTotal de Homens Cis desenvolvedores Mobile maiores de 40 anos: "+ homensCis40Mobile
        		          + "\nTotal de Homens Trans desenvolvedores Mobile maiores de 40 anos: "+ homensTrans40Mobile
        		          + "\nTotal de Não Binários desenvolvedores FullStack menores de 30 anos: " + naoBinariosFull30
        		          + "\nO número total de pessoas que responderam à pesquisa: " + totalPessoas
        		          + "\nA média de idade das pessoas que responderam à pesquisa: " + mediaIdade);
        
        
        
        //O número de pessoas desenvolvedoras Backend

        //O número de Mulheres Cis e Trans desenvolvedoras Frontend

        //O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos

        //O número de Não Binários desenvolvedores FullStack menores de 30 anos

        //O número total de pessoas que responderam à pesquisa

        //A média de idade das pessoas que responderam à pesquisa
	}

}
