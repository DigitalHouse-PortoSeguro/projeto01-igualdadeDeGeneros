package igualdadeDeGeneros;

public class Quiz {

	String resposta1;
	String resposta2;
	String resposta3;
	String resposta4;
	String resposta5;
	int pontuacao=0;
	int ponto1=0;
	int ponto2=0;
	int ponto3=0;
	int ponto4=0;
	int ponto5=0;
	Scanner leia = new Scanner(System.in);
	
	
	System.out.println("\nResponda às perguntas a seguir com 'sim' ou 'nao'");
	System.out.println("Você lavou suas roupas e a de seus familiares sem que sua parceira tenha pedido?");
	resposta1 = leia.nextLine();
	if(resposta1.equals("sim"))
	{
		System.out.println("\nMuito bem! Estou começando a gostar de você");
		ponto1 = 1;
	}
	else 
	{
		System.out.println("\nMandou bem mal já de priemira,hein");
		
	}
	
	System.out.println("\nCaso você os tenha, deu banho em seus filhos por iniciativa própria, recentemente?");
	resposta2 = leia.nextLine();
	if(resposta2.equals("sim"))
	{
		System.out.println("\nBoa, está mandando muito bem!");
		ponto2 = 1;
	}
	else
	{
		System.out.println("\nVocê precisa repensar suas atitudes");
	}
	
	System.out.println("\nNos últimos dias, você tirou o lixo da sua casa sem que alguém antes te pedisse?");
	resposta3=leia.nextLine();
	if(resposta3.equals("sim"))
	{
		System.out.println("Você está se mostrando um ser iluminado!");
		ponto3= 1;
	}
	else
	{
		System.out.println("Eu estou começando a te achar um embuste!");
	}
	
	System.out.println("\nEm um momento de explosão da sua parceira, você já respondeu às queixas de sobrecarga nas tarefas com a frase 'Mas era só pedir'? ");
	resposta4=leia.nextLine();
	if(resposta4.equals("sim"))
	{
		System.out.println("Você não mandou bem nessa!");
		
	}
	else
	{
		System.out.println("Se saiu bem!");
		ponto4=1;
	}
	
	System.out.println("\nNa sua casa, você cozinha?");
	resposta5=leia.nextLine();
	if(resposta5.equals("sim"))
	{
		System.out.println("Legal, é isso aí!");
		ponto5= 1;
	}
	else
	{
		System.out.println("Você poderia repensar essa atitude, não acha?");
	}
	
	
	
		
	
	pontuacao =( ponto1+ponto2+ponto3+ponto4+ponto5);
	System.out.println("\nSua pontuação final foi: " +pontuacao+ " pontos");
	if(pontuacao<=2)
	{
		System.out.println("\nAchamos que muitos pontos em sua vida/relacionamento podem melhorar. que tal pensar nisso?");
	}
	else
	{
		System.out.println("\nGostamos do seu resultado! Continue assim!");
	}
	
	
	
}
