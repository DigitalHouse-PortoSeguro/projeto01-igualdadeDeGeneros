package igualdadeDeGeneros;

import java.util.Scanner;

public class QuizTeste {

	public void perguntaPontuacaoQuiz() {
		
		String resp1;
		String resp2;
		String resp3;
		String resp4;
		String resp5;
		int pontos=0;
		int cont=0; //Quando chegar at� 5 encerra o la�o
		
		Scanner leia = new Scanner(System.in);
		
		if(cont!=5)
		{
		//Pergunta 1
		System.out.println("\n\t****Responda �s perguntas a seguir com (S) Sim ou (N) N�o****\n");
		System.out.println("Pergunta 1: Voc� lavou suas roupas e a de seus familiares sem que sua parceira tenha pedido?");
		resp1 = leia.nextLine();
		resp1 = resp1.toUpperCase();
		cont++;
		if(resp1.equals("S"))
		{
			System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
			pontos++;
		}
		else 
		{
			System.out.println("\nMandou bem mal j� de priemira,hein");
			
		}
		
		//Pergunta 2
		System.out.println("\nPergunta 2: Caso voc� os tenha, deu banho em seus filhos por iniciativa pr�pria, recentemente?");
		resp2 = leia.nextLine();
		resp2 = resp2.toUpperCase();
		cont++;
		if(resp2.equals("S"))
		{
			System.out.println("\nBoa, est� mandando muito bem!");
			pontos++;
		}
		else
		{
			System.out.println("\nVoc� precisa repensar suas atitudes");
		}
		
		//Pergunta 3
		System.out.println("\nPergunta 3: Nos �ltimos dias, voc� tirou o lixo da sua casa sem que algu�m antes te pedisse?");
		resp3=leia.nextLine();
		resp3 = resp3.toUpperCase();
		cont++;
		if(resp3.equals("S"))
		{
			System.out.println("Voc� est� se mostrando um ser iluminado!");
			pontos++;
		}
		else
		{
			System.out.println("Eu estou come�ando a te achar um embuste!");
		}
		
		//Pergunta 4
		System.out.println("\nPergunta 4: Em um momento de explos�o da sua parceira, voc� j� respondeu �s queixas de sobrecarga nas tarefas com a frase 'Mas era s� pedir'? ");
		resp4=leia.nextLine();
		resp4 = resp4.toUpperCase();
		cont++;
		if(resp4.equals("S"))
		{
			System.out.println("Voc� n�o mandou bem nessa!");
			pontos++;
		}
		else
		{
			System.out.println("Se saiu bem!");
			
		}
		
		//Pergunta 5
		System.out.println("\nPergunta 5: Na sua casa, voc� cozinha?");
		resp5=leia.nextLine();
		resp5 = resp5.toUpperCase();
		if(resp5.equals("S"))
		{
			System.out.println("Legal, � isso a�!");
			pontos++;
		}
		else
		{
			System.out.println("Voc� poderia repensar essa atitude, n�o acha?");
		}
		
		//Pontua��es
		System.out.println("\nSua pontua��o final foi: " +pontos+ " pontos");
		if(pontos<=2)
		{
			System.out.println("\nAchamos que muitos pontos em sua vida/relacionamento podem melhorar. que tal pensar nisso?");
		}
		else
		{
			System.out.println("\nGostamos do seu resultado! Continue assim!");
		}
		cont++;
		}
	}
	
}
