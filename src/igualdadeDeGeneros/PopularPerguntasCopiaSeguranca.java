package igualdadeDeGeneros;

import java.util.ArrayList;
import java.util.Scanner;

public class PopularPerguntasCopiaSeguranca {
	
	//Método para perguntas do público Masculino1
	public int perguntasMasculino1(int op) {
		
		String r1,r2,r3,r4,r5,r6;
		int pts=0,cont=0;
				
		Scanner leia = new Scanner(System.in);
				
		ArrayList<String> perguntasMasculino1 = new ArrayList();
		perguntasMasculino1.add("(1) Você executa tarefas domésticas(atingindo efetivamente seu objetivo) sem sua parceira pedir?(lavar louças, faxina, descongelar alimentos, lavar/secar roupas...)");
		perguntasMasculino1.add("(2) Você contribui para uma alimentação equilibrada dos membros da sua familia?(lista de compras, supermercado,preparo de refeições...)");
		perguntasMasculino1.add("(3) Você se esforça para manter a chama acessa no relacionamento?(novas experiencias, diálogo aberto, demonstrações de afeto...)");
		perguntasMasculino1.add("(4) Você tem proatividade nos cuidados com os membros da família? (agendamento médico dos filhos, reuniões escolares, lição de casa, fazer desfazer malas");
		perguntasMasculino1.add("(5) Em um momento de explosão da sua parceira, você já respondeu  às queixas de sobrecarga nas tarefas com a frase 'Mas era só pedir'? ");
		perguntasMasculino1.add("(6) Você contribui para uma alimentação equilibrada dos membros da sua familia?(lista de compras, supermercado,preparo de refeições...)");
		
				System.out.println("\nQuiz Masculino");
				System.out.println("\n\t****Responda às perguntas a seguir com (S) Sim ou (N) Não****\n");
		
				//Pergunta 1
				System.out.println(perguntasMasculino1.get(0)+" (S) Sim ou (N) Não");//Para pegar a posição desejada do ArrayList
				r1 = leia.nextLine();
				r1 = r1.toUpperCase();
				cont++;
				if(r1.equals("S"))
				{
					System.out.println("\nMuito bem! Estou começando a gostar de você");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal já de priemira,hein");
				}
				
				//Pergunta 2
				System.out.println(perguntasMasculino1.get(1)+" (S) Sim ou (N) Não");//Para pegar a posição desejada do ArrayList
				r2 = leia.nextLine();
				r2 = r2.toUpperCase();
				cont++;
				if(r2.equals("S"))
				{
					System.out.println("\nMuito bem! Estou começando a gostar de você");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal já de priemira,hein");
				}
				
				//Pergunta 3
				System.out.println(perguntasMasculino1.get(2)+" (S) Sim ou (N) Não");//Para pegar a posição desejada do ArrayList
				r3 = leia.nextLine();
				r3 = r3.toUpperCase();
				cont++;
				if(r3.equals("S"))
				{
					System.out.println("\nMuito bem! Estou começando a gostar de você");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal já de priemira,hein");
				}
		
				//Pergunta 4
				System.out.println(perguntasMasculino1.get(3)+" (S) Sim ou (N) Não");//Para pegar a posição desejada do ArrayList
				r4 = leia.nextLine();
				r4 = r4.toUpperCase();
				cont++;
				if(r4.equals("S"))
				{
					System.out.println("\nMuito bem! Estou começando a gostar de você");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal já de priemira,hein");
				}
		
				//Pergunta 5
				System.out.println(perguntasMasculino1.get(4)+" (S) Sim ou (N) Não");//Para pegar a posição desejada do ArrayList
				r5 = leia.nextLine();
				r5 = r5.toUpperCase();
				cont++;
				if(r5.equals("S"))
				{
					System.out.println("\nMuito bem! Estou começando a gostar de você");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal já de priemira,hein");
				}
				
				//Pergunta 6
				System.out.println(perguntasMasculino1.get(5)+" (S) Sim ou (N) Não");//Para pegar a posição desejada do ArrayList
				r6 = leia.nextLine();
				r6 = r6.toUpperCase();
				cont++;
				if(r6.equals("S"))
				{
					System.out.println("\nMuito bem! Estou começando a gostar de você");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal já de priemira,hein");
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
				cont++;
				
				return 100;
			
	}
	
		
	//Método para perguntas do público Feminino
	public int perguntasFeminino1(int op) {
	
		String r1,r2,r3,r4,r5,r6;
		int pts=0,cont=0;
				
		Scanner leia = new Scanner(System.in);
	
		ArrayList<String> perguntasFeminino1 = new ArrayList();
		perguntasFeminino1.add("(1) Você interfere quando seu parceiro está realizando tarefas doméstica de uma forma que você não acha ideal (ainda que eficaz)?");
		perguntasFeminino1.add("(2) Você confia em deixar seu marido sozinho com seus filhos enquanto sai com as amigas?");
		perguntasFeminino1.add("(3) Você envolve o parceiro na gestão da casa, permitindo que ele se responsabilize por parte desta tarefa (gestão financeira do lar, gestão da alimentação da familia, gestão da vida escolar dos filhos...)");
		
			System.out.println("\nQuiz Feminino");
			System.out.println("\n\t****Responda às perguntas a seguir com (S) Sim ou (N) Não****\n");
		
				//Pergunta 1
				System.out.println(perguntasFeminino1.get(0)+" (S) Sim ou (N) Não");//Para pegar a posição desejada do ArrayList
				r1 = leia.nextLine();
				r1 = r1.toUpperCase();
				cont++;
				if(r1.equals("S"))
				{
					System.out.println("\nMuito bem! Estou começando a gostar de você");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal já de priemira,hein");
				}
				
				//Pergunta 2
				System.out.println(perguntasFeminino1.get(1)+" (S) Sim ou (N) Não");//Para pegar a posição desejada do ArrayList
				r2 = leia.nextLine();
				r2 = r2.toUpperCase();
				cont++;
				if(r2.equals("S"))
				{
					System.out.println("\nMuito bem! Estou começando a gostar de você");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal já de priemira,hein");
				}
				
				//Pergunta 3
				System.out.println(perguntasFeminino1.get(2)+" (S) Sim ou (N) Não");//Para pegar a posição desejada do ArrayList
				r3 = leia.nextLine();
				r3 = r3.toUpperCase();
				cont++;
				if(r3.equals("S"))
				{
					System.out.println("\nMuito bem! Estou começando a gostar de você");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal já de priemira,hein");
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
				cont++;
				
				return 100;
	}
	
	
		
	//Método para perguntas do público Casado 1
	public int perguntasCasal1(int op) {
	
		String r1,r2,r3,r4,r5,r6,r7;
		int pts=0,cont=0;
				
		Scanner leia = new Scanner(System.in);
	
		ArrayList<String> perguntasCasal1 = new ArrayList();
		perguntasCasal1.add("(1) Você executa tarefas domésticas(atingindo efetivamente seu objetivo) sem sua parceira pedir?(lavar louças, faxina, descongelar alimentos, lavar/secar roupas...)");
		perguntasCasal1.add("(2) Você interfere quando seu parceiro estão realizando tarefas doméstica de uma forma que Você não acha ideal (ainda que eficaz)?");
		perguntasCasal1.add("(3) Você se esforça para manter a chama acessa no relacionamento?(novas experiencias, diálogo aberto, demonstrações de afeto...)");
		perguntasCasal1.add("(4) Você confia em deixar seu marido sozinho com seus filhos enquanto sai com as amigas?");
		perguntasCasal1.add("(5) Você tem proatividade nos cuidados com os membros da família? (agendamento médico dos filhos, reuniões escolares, lição de casa, fazer desfazer malas");
		perguntasCasal1.add("(6) Você envolve o parceiro na gestão da casa, permitindo que ele se responsabilize por parte desta tarefa (gestão financeira do lar, gestão da alimentaçãoo da familia, gestão da vida escolar dos filhos...)");
		perguntasCasal1.add("(7) Em um momento de explosão da sua parceira, você já respondeu às queixas de sobrecarga nas tarefas com a frase 'Mas era só pedir'? ");
		
				System.out.println("\nQuiz Casal 1");
				System.out.println("\n\t****Responda às perguntas a seguir com (S) Sim ou (N) Não****\n");
		
				//Pergunta 1
				System.out.println(perguntasCasal1.get(0)+" (S) Sim ou (N) Não");//Para pegar a posição desejada do ArrayList
				r1 = leia.nextLine();
				r1 = r1.toUpperCase();
				cont++;
				if(r1.equals("S"))
				{
					System.out.println("\nMuito bem! Estou começando a gostar de você");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal já de priemira,hein");
				}
				
				//Pergunta 2
				System.out.println(perguntasCasal1.get(1)+" (S) Sim ou (N) Não");//Para pegar a posição desejada do ArrayList
				r2 = leia.nextLine();
				r2 = r2.toUpperCase();
				cont++;
				if(r2.equals("S"))
				{
					System.out.println("\nMuito bem! Estou começando a gostar de você");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal já de priemira,hein");
				}
				
				//Pergunta 3
				System.out.println(perguntasCasal1.get(2)+" (S) Sim ou (N) Não");//Para pegar a posição desejada do ArrayList
				r3 = leia.nextLine();
				r3 = r3.toUpperCase();
				cont++;
				if(r3.equals("S"))
				{
					System.out.println("\nMuito bem! Estou começando a gostar de você");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal já de priemira,hein");
				}
		
				//Pergunta 4
				System.out.println(perguntasCasal1.get(3)+" (S) Sim ou (N) Não");//Para pegar a posição desejada do ArrayList
				r4 = leia.nextLine();
				r4 = r4.toUpperCase();
				cont++;
				if(r4.equals("S"))
				{
					System.out.println("\nMuito bem! Estou começando a gostar de você");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal já de priemira,hein");
				}
		
				//Pergunta 5
				System.out.println(perguntasCasal1.get(4)+" (S) Sim ou (N) Não");//Para pegar a posição desejada do ArrayList
				r5 = leia.nextLine();
				r5 = r5.toUpperCase();
				cont++;
				if(r5.equals("S"))
				{
					System.out.println("\nMuito bem! Estou começando a gostar de você");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal já de priemira,hein");
				}
				
				//Pergunta 6
				System.out.println(perguntasCasal1.get(5)+" (S) Sim ou (N) Não");//Para pegar a posição desejada do ArrayList
				r6 = leia.nextLine();
				r6 = r6.toUpperCase();
				cont++;
				if(r6.equals("S"))
				{
					System.out.println("\nMuito bem! Estou começando a gostar de você");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal já de priemira,hein");
				}
				
				//Pergunta 7
				System.out.println(perguntasCasal1.get(6)+" (S) Sim ou (N) Não");//Para pegar a posição desejada do ArrayList
				r7 = leia.nextLine();
				r7 = r7.toUpperCase();
				cont++;
				if(r7.equals("S"))
				{
					System.out.println("\nMuito bem! Estou começando a gostar de você");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal já de priemira,hein");
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
				cont++;
				
				return 100;
		}
	
		//Método para perguntas do público Casado 2
		public int perguntasCasal2(int op) {
			
			String r1,r2,r3,r4,r5,r6,r7;
			int pts=0,cont=0;
					
			Scanner leia = new Scanner(System.in);
			
			ArrayList<String> perguntasCasal2 = new ArrayList();
			perguntasCasal2.add("(1) Você lavou suas roupas e a de seus familiares sem que sua parceira tenha pedido?)");
			perguntasCasal2.add("(2) Caso você os tenha, deu banho em seus filhos por iniciativa própria, recentemente?");
			perguntasCasal2.add("(3) Nos últimos dias, você tirou o lixo da sua casa sem que alguém antes te pedisse?)");
			perguntasCasal2.add("(4) Em um momento de explosão da sua parceira, você já respondeu às queixas de sobrecarga nas tarefas com a frase 'Mas era só pedir'?");
			perguntasCasal2.add("(5) Na sua casa, você cozinha?");
			
					System.out.println("\nQuiz Casal 2");	
					System.out.println("\n\t****Responda às perguntas a seguir com (S) Sim ou (N) Não****\n");
			
					//Pergunta 1
					System.out.println(perguntasCasal2.get(0)+" (S) Sim ou (N) Não");//Para pegar a posição desejada do ArrayList
					r1 = leia.nextLine();
					r1 = r1.toUpperCase();
					cont++;
					if(r1.equals("S"))
					{
						System.out.println("\nMuito bem! Estou começando a gostar de você");
						pts++;
					}
					else 
					{
						System.out.println("\nMandou bem mal já de priemira,hein");
					}
					
					//Pergunta 2
					System.out.println(perguntasCasal2.get(1)+" (S) Sim ou (N) Não");//Para pegar a posição desejada do ArrayList
					r2 = leia.nextLine();
					r2 = r2.toUpperCase();
					cont++;
					if(r2.equals("S"))
					{
						System.out.println("\nMuito bem! Estou começando a gostar de você");
						pts++;
					}
					else 
					{
						System.out.println("\nMandou bem mal já de priemira,hein");
					}
					
					//Pergunta 3
					System.out.println(perguntasCasal2.get(2)+" (S) Sim ou (N) Não");//Para pegar a posição desejada do ArrayList
					r3 = leia.nextLine();
					r3 = r3.toUpperCase();
					cont++;
					if(r3.equals("S"))
					{
						System.out.println("\nMuito bem! Estou começando a gostar de você");
						pts++;
					}
					else 
					{
						System.out.println("\nMandou bem mal já de priemira,hein");
					}
			
					//Pergunta 4
					System.out.println(perguntasCasal2.get(3)+" (S) Sim ou (N) Não");//Para pegar a posição desejada do ArrayList
					r4 = leia.nextLine();
					r4 = r4.toUpperCase();
					cont++;
					if(r4.equals("S"))
					{
						System.out.println("\nMuito bem! Estou começando a gostar de você");
						pts++;
					}
					else 
					{
						System.out.println("\nMandou bem mal já de priemira,hein");
					}
			
					//Pergunta 5
					System.out.println(perguntasCasal2.get(4)+" (S) Sim ou (N) Não");//Para pegar a posição desejada do ArrayList
					r5 = leia.nextLine();
					r5 = r5.toUpperCase();
					cont++;
					if(r5.equals("S"))
					{
						System.out.println("\nMuito bem! Estou começando a gostar de você");
						pts++;
					}
					else 
					{
						System.out.println("\nMandou bem mal já de priemira,hein");
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
					cont++;
					
					return 100;
			
		}
	
}
	
