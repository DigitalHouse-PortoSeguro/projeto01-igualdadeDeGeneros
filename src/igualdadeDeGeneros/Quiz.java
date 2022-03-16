package igualdadeDeGeneros;

import java.util.List;
import java.util.Scanner;

public class Quiz {
	
		
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
					System.out.println("\nMuito bem! Estou come�ando a gostar de voc�!!\n\n");
					pontos++;
				} else {
					System.out.println("\nMandou mal, hein...\n\n");
				};
			}
			
			//Pontua��es
			System.out.println("\nSua pontua��o final foi: " + pontos + " pontos");
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




