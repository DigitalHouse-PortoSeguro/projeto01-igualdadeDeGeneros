package igualdadeDeGeneros;

import java.util.Scanner;

public class appMain {

	public static void main(String[] args) {
		
		//Cadastrando dois usuários para teste:
		CadastroDosUsuarios usuario01 = new CadastroDosUsuarios("joaodasilva@gmail.com","joao da silva",
				"1111",	"masculino", true);
		CadastroDosUsuarios usuario02 = new CadastroDosUsuarios("carlarodrigues@gmail.com", "carla rodrigues",
				"2222", "feminino", false );
		
		CadastroDosUsuarios usuario03 = new CadastroDosUsuarios();
		
			
		System.out.println("\n Olá Bora testar como está dividida a carga mental na sua casa?");
		if (usuario01.isParticipanteCadastrado()) {
			//menu quiz
			System.out.println("Escolha o quiz");
		} else { 
			usuario01.CadastrarParticipante();
			
		};
		
		
		

		int option = 100;
			
		do {
			Quiz.menuQuiz();
			Scanner leia = new Scanner(System.in);
			option = leia.nextInt();
			switch (option) {
			case 1:
				Quiz quizMasculino = new Quiz();
				System.out.println("\nQuiz Masculino");
				System.out.println("\n\t****Responda às perguntas a seguir com (S) Sim ou (N) Não****\n");
				quizMasculino.mostrarPerguntas(PopularPerguntas.perguntasMasculino());
				break;
				
			case 2: 
				Quiz quizFeminino = new Quiz();
				System.out.println("\nQuiz Feminino");
				System.out.println("\n\t****Responda às perguntas a seguir com (S) Sim ou (N) Não****\n");
				quizFeminino.mostrarPerguntas(PopularPerguntas.perguntasFeminino());
				break;
				
			case 3:
				System.out.println("\nQuiz Casal");
				break;

			default:
				break;
			}
			
		} while (option != 0);
		
		System.out.println("\n Obrigado por se tornar uma pessoa cada vez melhor! Cotinue sempre assim!");
		
	}
}


