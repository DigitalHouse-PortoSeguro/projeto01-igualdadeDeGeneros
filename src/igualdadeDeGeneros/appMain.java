package igualdadeDeGeneros;

import java.util.Scanner;

public class appMain {

	public static void main(String[] args) {
		
		Participante part = new Participante();
		PopulaPerguntas pp = new PopulaPerguntas();
		QuizTeste quiz = new QuizTeste();
		
		Scanner ler = new Scanner(System.in);
		
		part.CadastraParticipante();//Chamando Método CadastraParticipante
		
		if(part.participanteCadastrado)
		{
		System.out.println("\nEscolha uma das opções:\n(1) Perguntas Populares"
				   +"\n(2) Quiz"
				   +"\n(3) Resultado"
				   +"\n(0) Sair");
		
		int op = ler.nextInt();
		
		do
		{
			switch(op)
			{
			case 1://Perguntas Populares
			{
				ler.nextLine();
				pp.PopulaPerguntas();
				
				break;	
			}
			case 2://Quiz
			{
				ler.nextLine();
				quiz.perguntaPontuacaoQuiz();
				
				break;
			}
			case 3://Resultado
			{
				ler.nextLine();
				
				//Corpo do Resultado
				break;
			}
			case 0:
			{
				ler.nextLine();
				break;
			}
				
			}
						
		}
		while(op!=0);
		
		System.out.println("\n Obrigado por se tornar uma pessoa cada vez melhor! Cotinue sempre assim!");
		}
	}

}
