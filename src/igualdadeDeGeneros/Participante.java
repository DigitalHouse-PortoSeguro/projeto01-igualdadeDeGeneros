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
	
		System.out.println("\n OlÁ Bora testar como está dividida a carga mental na sua casa?!");
		System.out.println("\n Para começarmos vamos precisar de alguns dados! \n Qual o seu gênero? (M) Masculino ou (F) Feminino");
		genero = leia.nextLine();
		genero = genero.toUpperCase();
		
				
		System.out.println("\n Tem filho(s)? (S) Sim ou (N) Não");
		filhos = leia.nextLine();
		filhos = filhos.toUpperCase();
		
		System.out.println("\n Vai jogar em dupla? (S) Sim ou (N) Não");
		numeroParticipantes= leia.nextLine();
		numeroParticipantes = numeroParticipantes.toUpperCase();
		
		participanteCadastrado = true;
		
		/* Se o participante for do sexo masculino será uma serie de perguntas e se for do feminino outra? 
		Ou pontuação diferente para cada um dos sexos?
		 se tem filhos uma serie de perguntas? ou apenas anular aquela questão com não se aplica?*/
		
		
	}
	
}

