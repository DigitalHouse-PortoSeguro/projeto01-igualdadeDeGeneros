package igualdadeDeGeneros;


import java.util.Scanner;

public class Participante {
	
	String genero;
	String filhos;
	String numeroParticipantes;
	boolean participanteCadastrado=true;
	
	public static void CadastraParticipante() {

		String genero;
		String filhos;
		String numeroParticipantes;
		boolean participanteCadastrado;
		
		Scanner leia = new Scanner(System.in);
	
		System.out.println("\n Ol� Bora testar como est� dividida a carga mental na sua casa?!");
		System.out.println("\n Para come�armos vamos precisar de alguns dados! \n Qual o seu g�nero? (M) Masculino ou (F) Feminino");
		genero = leia.nextLine();
		genero = genero.toUpperCase();
		
				
		System.out.println("\n Tem filho(s)? (S) Sim ou (N) N�o");
		filhos = leia.nextLine();
		filhos = filhos.toUpperCase();
		
		System.out.println("\n Vai jogar em dupla? (S) Sim ou (N) N�o");
		numeroParticipantes= leia.nextLine();
		numeroParticipantes = numeroParticipantes.toUpperCase();
		
		participanteCadastrado = true;
		
		/* Se o participante for do sexo masculino ser� uma serie de perguntas e se for do feminino outra? 
		Ou pontua��o diferente para cada um dos sexos?
		 se tem filhos uma serie de perguntas? ou apenas anular aquela quest�o com n�o se aplica?*/
		
		
	}
	
}

