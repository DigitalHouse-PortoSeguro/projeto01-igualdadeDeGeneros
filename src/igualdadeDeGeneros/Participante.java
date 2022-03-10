package igualdadeDeGeneros;


import java.util.Scanner;

public class Participante {
	
	public static void CadastraParticipante() {

		String genero;
		String filhos;
		String numeroParticipantes;
	
		Scanner leia = new Scanner(System.in);
	
		System.out.println("\n Olá! Bora testar como está dividida a carga mental na sua casa?!");
		System.out.println("\n Para começarmos vamos precisar de alguns dados! \n Qual o seu gênero? (masculino/feminino)");
		genero= leia.nextLine();
		System.out.println("\n Tem filho(s)? (sim/não)");
		filhos = leia.nextLine();
		System.out.println("\n Vai jogar em dupla? (sim/não)");
		numeroParticipantes= leia.nextLine();
		
		/* Se o participante for do sexo masculino será uma serie de perguntas e se for do feminino outra? 
		Ou pontuação diferente para cada um dos sexos?
		 se tem filhos uma serie de perguntas? ou apenas anular aquela questão com não se aplica?*/
		
		
	}
	
}

