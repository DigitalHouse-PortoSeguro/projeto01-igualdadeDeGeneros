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
	
		System.out.println("\n Ol�! Bora testar como est� dividida a carga mental na sua casa?"
				+ "\nMas antes de iniciar, Mas antes de iniciar precisamos fazer o seu cadastro!");
		
		System.out.println("\n Siga os passos abaixo para se cadastrar:"
				+ "\nQual o seu g�nero? (M) Masculino ou (F) Feminino");
		genero = leia.nextLine();
		genero = genero.toUpperCase();
		
		System.out.println("\n Tem filho(s)? (S) Sim ou (N) N�o");
		filhos = leia.nextLine();
		filhos = filhos.toUpperCase();
		
		System.out.println("\n Vai jogar em dupla? (S) Sim ou (N) N�o");
		numeroParticipantes= leia.nextLine();
		numeroParticipantes = numeroParticipantes.toUpperCase();
		
		
		
		
		
		
	}
	
}

