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
		int cont=0; //Quando chegar até 5 encerra o laço
		
		Scanner leia = new Scanner(System.in);
		
		if(cont!=5)
		{
		//Pergunta 1
		System.out.println("\n\t****Responda às perguntas a seguir com (S) Sim ou (N) Não****\n");
		System.out.println("Pergunta 1: Você lavou suas roupas e a de seus familiares sem que sua parceira tenha pedido?");
		resp1 = leia.nextLine();
		resp1 = resp1.toUpperCase();
		cont++;
		if(resp1.equals("S"))
		{
			System.out.println("\nMuito bem! Estou começando a gostar de você");
			pontos++;
		}
		else 
		{
			System.out.println("\nMandou bem mal já de priemira,hein");
			
		}
		
		//Pergunta 2
		System.out.println("\nPergunta 2: Caso você os tenha, deu banho em seus filhos por iniciativa própria, recentemente?");
		resp2 = leia.nextLine();
		resp2 = resp2.toUpperCase();
		cont++;
		if(resp2.equals("S"))
		{
			System.out.println("\nBoa, está mandando muito bem!");
			pontos++;
		}
		else
		{
			System.out.println("\nVocê precisa repensar suas atitudes");
		}
		
		//Pergunta 3
		System.out.println("\nPergunta 3: Nos últimos dias, você tirou o lixo da sua casa sem que alguém antes te pedisse?");
		resp3=leia.nextLine();
		resp3 = resp3.toUpperCase();
		cont++;
		if(resp3.equals("S"))
		{
			System.out.println("Você está se mostrando um ser iluminado!");
			pontos++;
		}
		else
		{
			System.out.println("Eu estou começando a te achar um embuste!");
		}
		
		//Pergunta 4
		System.out.println("\nPergunta 4: Em um momento de explosão da sua parceira, você já respondeu às queixas de sobrecarga nas tarefas com a frase 'Mas era só pedir'? ");
		resp4=leia.nextLine();
		resp4 = resp4.toUpperCase();
		cont++;
		if(resp4.equals("S"))
		{
			System.out.println("Você não mandou bem nessa!");
			pontos++;
		}
		else
		{
			System.out.println("Se saiu bem!");
			
		}
		
		//Pergunta 5
		System.out.println("\nPergunta 5: Na sua casa, você cozinha?");
		resp5=leia.nextLine();
		resp5 = resp5.toUpperCase();
		if(resp5.equals("S"))
		{
			System.out.println("Legal, é isso aí!");
			pontos++;
		}
		else
		{
			System.out.println("Você poderia repensar essa atitude, não acha?");
		}
		
		//Pontuações
		System.out.println("\nSua pontuação final foi: " +pontos+ " pontos");
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
