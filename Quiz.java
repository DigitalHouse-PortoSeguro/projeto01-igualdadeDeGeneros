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
	
	
	System.out.println("\nResponda �s perguntas a seguir com 'sim' ou 'nao'");
	System.out.println("Voc� lavou suas roupas e a de seus familiares sem que sua parceira tenha pedido?");
	resposta1 = leia.nextLine();
	if(resposta1.equals("sim"))
	{
		System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
		ponto1 = 1;
	}
	else 
	{
		System.out.println("\nMandou bem mal j� de priemira,hein");
		
	}
	
	System.out.println("\nCaso voc� os tenha, deu banho em seus filhos por iniciativa pr�pria, recentemente?");
	resposta2 = leia.nextLine();
	if(resposta2.equals("sim"))
	{
		System.out.println("\nBoa, est� mandando muito bem!");
		ponto2 = 1;
	}
	else
	{
		System.out.println("\nVoc� precisa repensar suas atitudes");
	}
	
	System.out.println("\nNos �ltimos dias, voc� tirou o lixo da sua casa sem que algu�m antes te pedisse?");
	resposta3=leia.nextLine();
	if(resposta3.equals("sim"))
	{
		System.out.println("Voc� est� se mostrando um ser iluminado!");
		ponto3= 1;
	}
	else
	{
		System.out.println("Eu estou come�ando a te achar um embuste!");
	}
	
	System.out.println("\nEm um momento de explos�o da sua parceira, voc� j� respondeu �s queixas de sobrecarga nas tarefas com a frase 'Mas era s� pedir'? ");
	resposta4=leia.nextLine();
	if(resposta4.equals("sim"))
	{
		System.out.println("Voc� n�o mandou bem nessa!");
		
	}
	else
	{
		System.out.println("Se saiu bem!");
		ponto4=1;
	}
	
	System.out.println("\nNa sua casa, voc� cozinha?");
	resposta5=leia.nextLine();
	if(resposta5.equals("sim"))
	{
		System.out.println("Legal, � isso a�!");
		ponto5= 1;
	}
	else
	{
		System.out.println("Voc� poderia repensar essa atitude, n�o acha?");
	}
	
	
	
		
	
	pontuacao =( ponto1+ponto2+ponto3+ponto4+ponto5);
	System.out.println("\nSua pontua��o final foi: " +pontuacao+ " pontos");
	if(pontuacao<=2)
	{
		System.out.println("\nAchamos que muitos pontos em sua vida/relacionamento podem melhorar. que tal pensar nisso?");
	}
	else
	{
		System.out.println("\nGostamos do seu resultado! Continue assim!");
	}
	
	
	
}
