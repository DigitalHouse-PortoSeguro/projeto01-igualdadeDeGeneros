package igualdadeDeGenerosComAbstract;

import java.util.ArrayList;
import java.util.Scanner;

public class PopularPerguntas {
	/*  Método add – Adiciona um elemento no final do ArrayList.
		Método clear – Remove todos os elementos da estrutura.
	-->	Método contains – Verifica se o ArrayList contém um elemento especificado, e retorna true em caso positivo, ou false caso contrário.
		Método get – Retorna o item em uma posição de índice especificada.
		Método indexOf – Retorna a posição de índice da primeira ocorrência de um elemento especificado.
		Método remove – Remove a primeira ocorrência de um valor especificado ou de um elemento em um índice.
		Método size – Informa o número de elementos que estão armazenados na estrutura.
		Método trimToSize – Ajusta a capacidade do ArrayList de acordo com o número de elementos armazenados no momento.
	 */
		
	//Método para perguntas do público Masculino1
	public void perguntasMasculino1() {
				
		String resp;
		int pts=0;
				
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> perguntasMasculino1 = new ArrayList<String>();
		perguntasMasculino1.add("(1) Você executa tarefas domésticas(atingindo efetivamente seu objetivo) sem sua parceira pedir?(lavar louças, faxina, descongelar alimentos, lavar/secar roupas...)");
		perguntasMasculino1.add("(2) Você contribui para uma alimentação equilibrada dos membros da sua familia?(lista de compras, supermercado,preparo de refeições...)");
		perguntasMasculino1.add("(3) Você se esforça para manter a chama acessa no relacionamento?(novas experiencias, diálogo aberto, demonstrações de afeto...)");
		perguntasMasculino1.add("(4) Você tem proatividade nos cuidados com os membros da família? (agendamento médico dos filhos, reuniões escolares, lição de casa, fazer desfazer malas");
		perguntasMasculino1.add("(5) Em um momento de explosão da sua parceira, você já respondeu  às queixas de sobrecarga nas tarefas com a frase 'Mas era só pedir'? ");
		perguntasMasculino1.add("(6) Você contribui para uma alimentação equilibrada dos membros da sua familia?(lista de compras, supermercado,preparo de refeições...)");
		
			System.out.println("\nQuiz Feminino");
			System.out.println("\n\t****Responda às perguntas a seguir com (S) Sim ou (N) Não****\n");
		
			//Perguntas
			for(int i=1;i<=perguntasMasculino1.size();i++)
			{
				System.out.println(perguntasMasculino1.get(i-1)+" (S) Sim ou (N) Não");//Para pegar a posição desejada do ArrayList
				resp = leia.nextLine();
				resp = resp.toUpperCase();
												
				if(resp.equals("S"))
				{
					System.out.println("\nMuito bem! Estou começando a gostar de você");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal já de priemira,hein");
				}
			}
				//Pontuações
				System.out.println("\nSua pontuação final foi: " +pts+ " pontos");
				if(pts<=2)
				{
					System.out.println("\nAchamos que muitos pontos em sua vida/relacionamento podem melhorar. que tal pensar nisso?");
				}
				else
				{
					System.out.println("\nGostamos do seu resultado! Continue assim!");
				}
					
	}
			
	//Método para perguntas do público Feminino
	public void perguntasFeminino1() {
	
		String resp;
		int pts=0;
				
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> perguntasFeminino1 = new ArrayList<String>();// Criando objeto perguntasFeminino1 do ArrayList
		perguntasFeminino1.add("(1) Você interfere quando seu parceiro está realizando tarefas doméstica de uma forma que você não acha ideal (ainda que eficaz)?");
		perguntasFeminino1.add("(2) Você confia em deixar seu marido sozinho com seus filhos enquanto sai com as amigas?");
		perguntasFeminino1.add("(3) Você envolve o parceiro na gestão da casa, permitindo que ele se responsabilize por parte desta tarefa (gestão financeira do lar, gestão da alimentação da familia, gestão da vida escolar dos filhos...)");
		
			System.out.println("\nQuiz Feminino");
			System.out.println("\n\t****Responda às perguntas a seguir com (S) Sim ou (N) Não****\n");
		
			//Perguntas
			for(int i=1;i<=perguntasFeminino1.size();i++)
			{
				System.out.println(perguntasFeminino1.get(i-1)+" (S) Sim ou (N) Não");//Para pegar a posição desejada do ArrayList
				resp = leia.nextLine();
				resp = resp.toUpperCase();
												
				if(resp.equals("S"))
				{
					System.out.println("\nMuito bem! Estou começando a gostar de você");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal já de priemira,hein");
				}
			}
				//Pontuações
				System.out.println("\nSua pontuação final foi: " +pts+ " pontos");
				if(pts<=2)
				{
					System.out.println("\nAchamos que muitos pontos em sua vida/relacionamento podem melhorar. que tal pensar nisso?");
				}
				else
				{
					System.out.println("\nGostamos do seu resultado! Continue assim!");
				}
				
	}
	
	//Método para perguntas do público Casado 1
	public void perguntasCasal1() {
			
		String resp;
		int pts=0;
				
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> perguntasCasal1 = new ArrayList<String>();
		perguntasCasal1.add("(1) Você executa tarefas domésticas(atingindo efetivamente seu objetivo) sem sua parceira pedir?(lavar louças, faxina, descongelar alimentos, lavar/secar roupas...)");
		perguntasCasal1.add("(2) Você interfere quando seu parceiro estão realizando tarefas doméstica de uma forma que Você não acha ideal (ainda que eficaz)?");
		perguntasCasal1.add("(3) Você se esforça para manter a chama acessa no relacionamento?(novas experiencias, diálogo aberto, demonstrações de afeto...)");
		perguntasCasal1.add("(4) Você confia em deixar seu marido sozinho com seus filhos enquanto sai com as amigas?");
		perguntasCasal1.add("(5) Você tem proatividade nos cuidados com os membros da família? (agendamento médico dos filhos, reuniões escolares, lição de casa, fazer desfazer malas");
		perguntasCasal1.add("(6) Você envolve o parceiro na gestão da casa, permitindo que ele se responsabilize por parte desta tarefa (gestão financeira do lar, gestão da alimentaçãoo da familia, gestão da vida escolar dos filhos...)");
		perguntasCasal1.add("(7) Em um momento de explosão da sua parceira, você já respondeu às queixas de sobrecarga nas tarefas com a frase 'Mas era só pedir'? ");
		
			System.out.println("\nQuiz Casal 1");
			System.out.println("\n\t****Responda às perguntas a seguir com (S) Sim ou (N) Não****\n");
		
			//Perguntas
			for(int i=1;i<=perguntasCasal1.size();i++)
			{
				System.out.println(perguntasCasal1.get(i-1)+" (S) Sim ou (N) Não");//Para pegar a posição desejada do ArrayList
				resp = leia.nextLine();
				resp = resp.toUpperCase();
												
				if(resp.equals("S"))
				{
					System.out.println("\nMuito bem! Estou começando a gostar de você");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal já de priemira,hein");
				}
			}
				//Pontuações
				System.out.println("\nSua pontuação final foi: " +pts+ " pontos");
				if(pts<=2)
				{
					System.out.println("\nAchamos que muitos pontos em sua vida/relacionamento podem melhorar. que tal pensar nisso?");
				}
				else
				{
					System.out.println("\nGostamos do seu resultado! Continue assim!");
				}				
		}
	
		//Método para perguntas do público Casado 2
		public void perguntasCasal2() {
						
			String resp;
			int pts=0;
					
			Scanner leia = new Scanner(System.in);
			
			ArrayList<String> perguntasCasal2 = new ArrayList();
			perguntasCasal2.add("(1) Você lavou suas roupas e a de seus familiares sem que sua parceira tenha pedido?)");
			perguntasCasal2.add("(2) Caso você os tenha, deu banho em seus filhos por iniciativa própria, recentemente?");
			perguntasCasal2.add("(3) Nos últimos dias, você tirou o lixo da sua casa sem que alguém antes te pedisse?)");
			perguntasCasal2.add("(4) Em um momento de explosão da sua parceira, você já respondeu às queixas de sobrecarga nas tarefas com a frase 'Mas era só pedir'?");
			
			
				System.out.println("\nQuiz Feminino");
				System.out.println("\n\t****Responda às perguntas a seguir com (S) Sim ou (N) Não****\n");
			
				//Perguntas
				for(int i=1;i<=perguntasCasal2.size();i++)
				{
					System.out.println(perguntasCasal2.get(i-1)+" (S) Sim ou (N) Não");//Para pegar a posição desejada do ArrayList
					resp = leia.nextLine();
					resp = resp.toUpperCase();
													
					if(resp.equals("S"))
					{
						System.out.println("\nMuito bem! Estou começando a gostar de você");
						pts++;
					}
					else 
					{
						System.out.println("\nMandou bem mal já de priemira,hein");
					}
				}
					//Pontuações
					System.out.println("\nSua pontuação final foi: " +pts+ " pontos");
					if(pts<=2)
					{
						System.out.println("\nAchamos que muitos pontos em sua vida/relacionamento podem melhorar. que tal pensar nisso?");
					}
					else
					{
						System.out.println("\nGostamos do seu resultado! Continue assim!");
					}				
			}	
}
	
