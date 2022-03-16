package igualdadeDeGeneros;

import java.util.List;
import java.util.Scanner;

public class Quiz {
	
	//método estático pode ser chamado direto: Quiz.menuQuiz()
	public static void menuQuiz() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("   Para iniciar o seu jogo\nescolha uma das opções abaixo:\n"
				           +"\n(1) Quiz Masculino"
						   +"\n(2) Quiz Feminino"
						   +"\n(3) Quiz Casal "
						   +"\n(0) Sair");
		System.out.println("----------------------------------------------------------------");
	}
	
		
	public void mostrarPerguntas(List<Pergunta> listaPerguntas) {
		Scanner leia = new Scanner(System.in);
		String resp;
		int pontos=0;
			
			for (Pergunta pergunta : listaPerguntas) {
				System.out.println(pergunta.getEnunciadoPergunta());
				resp = leia.nextLine();
				resp = resp.toUpperCase();
				pergunta.setResposta(resp);
				if(pergunta.isPerguntaCorreta()) {
					System.out.println("\nMuito bem! Estou começando a gostar de você!!\n\n");
					pontos++;
				} else {
					System.out.println("\nMandou mal, hein...\n\n");
				};
			}
			
			//Pontuações
			System.out.println("\nSua pontuação final foi: " + pontos + " pontos");
			if(pontos <= 2)
			{
				System.out.println("\nAchamos que muitos pontos em sua vida/relacionamento podem melhorar. "
						+ "\nQue tal pensar nisso?");
			}
			else
			{
				System.out.println("\nGostamos do seu resultado! Continue assim!");
			}
			
		}
	}




