package igualdadeDeGenerosComAbstract;

import java.util.ArrayList;
import java.util.Scanner;

public class PopularPerguntas {
	/*  M�todo add � Adiciona um elemento no final do ArrayList.
		M�todo clear � Remove todos os elementos da estrutura.
	-->	M�todo contains � Verifica se o ArrayList cont�m um elemento especificado, e retorna true em caso positivo, ou false caso contr�rio.
		M�todo get � Retorna o item em uma posi��o de �ndice especificada.
		M�todo indexOf � Retorna a posi��o de �ndice da primeira ocorr�ncia de um elemento especificado.
		M�todo remove � Remove a primeira ocorr�ncia de um valor especificado ou de um elemento em um �ndice.
		M�todo size � Informa o n�mero de elementos que est�o armazenados na estrutura.
		M�todo trimToSize � Ajusta a capacidade do ArrayList de acordo com o n�mero de elementos armazenados no momento.
	 */
		
	//M�todo para perguntas do p�blico Masculino1
	public void perguntasMasculino1() {
				
		String resp;
		int pts=0;
				
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> perguntasMasculino1 = new ArrayList<String>();
		perguntasMasculino1.add("(1) Voc� executa tarefas dom�sticas(atingindo efetivamente seu objetivo) sem sua parceira pedir?(lavar lou�as, faxina, descongelar alimentos, lavar/secar roupas...)");
		perguntasMasculino1.add("(2) Voc� contribui para uma alimenta��o equilibrada dos membros da sua familia?(lista de compras, supermercado,preparo de refei��es...)");
		perguntasMasculino1.add("(3) Voc� se esfor�a para manter a chama acessa no relacionamento?(novas experiencias, di�logo aberto, demonstra��es de afeto...)");
		perguntasMasculino1.add("(4) Voc� tem proatividade nos cuidados com os membros da fam�lia? (agendamento m�dico dos filhos, reuni�es escolares, li��o de casa, fazer desfazer malas");
		perguntasMasculino1.add("(5) Em um momento de explos�o da sua parceira, voc� j� respondeu ��s queixas de sobrecarga nas tarefas com a frase 'Mas era s� pedir'? ");
		perguntasMasculino1.add("(6) Voc� contribui para uma alimenta��o equilibrada dos membros da sua familia?(lista de compras, supermercado,preparo de refei��es...)");
		
			System.out.println("\nQuiz Feminino");
			System.out.println("\n\t****Responda �s perguntas a seguir com (S) Sim ou (N) N�o****\n");
		
			//Perguntas
			for(int i=1;i<=perguntasMasculino1.size();i++)
			{
				System.out.println(perguntasMasculino1.get(i-1)+" (S) Sim ou (N) N�o");//Para pegar a posi��o desejada do ArrayList
				resp = leia.nextLine();
				resp = resp.toUpperCase();
												
				if(resp.equals("S"))
				{
					System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal j� de priemira,hein");
				}
			}
				//Pontua��es
				System.out.println("\nSua pontua��o final foi: " +pts+ " pontos");
				if(pts<=2)
				{
					System.out.println("\nAchamos que muitos pontos em sua vida/relacionamento podem melhorar. que tal pensar nisso?");
				}
				else
				{
					System.out.println("\nGostamos do seu resultado! Continue assim!");
				}
					
	}
			
	//M�todo para perguntas do p�blico Feminino
	public void perguntasFeminino1() {
	
		String resp;
		int pts=0;
				
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> perguntasFeminino1 = new ArrayList<String>();// Criando objeto perguntasFeminino1 do ArrayList
		perguntasFeminino1.add("(1) Voc� interfere quando seu parceiro est� realizando tarefas dom�stica de uma forma que voc� n�o acha ideal (ainda que eficaz)?");
		perguntasFeminino1.add("(2) Voc� confia em deixar seu marido sozinho com seus filhos enquanto sai com as amigas?");
		perguntasFeminino1.add("(3) Voc� envolve o parceiro na gest�o da casa, permitindo que ele se responsabilize por parte desta tarefa (gest�o financeira do lar, gest�o da alimenta��o da familia, gest�o da vida escolar dos filhos...)");
		
			System.out.println("\nQuiz Feminino");
			System.out.println("\n\t****Responda �s perguntas a seguir com (S) Sim ou (N) N�o****\n");
		
			//Perguntas
			for(int i=1;i<=perguntasFeminino1.size();i++)
			{
				System.out.println(perguntasFeminino1.get(i-1)+" (S) Sim ou (N) N�o");//Para pegar a posi��o desejada do ArrayList
				resp = leia.nextLine();
				resp = resp.toUpperCase();
												
				if(resp.equals("S"))
				{
					System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal j� de priemira,hein");
				}
			}
				//Pontua��es
				System.out.println("\nSua pontua��o final foi: " +pts+ " pontos");
				if(pts<=2)
				{
					System.out.println("\nAchamos que muitos pontos em sua vida/relacionamento podem melhorar. que tal pensar nisso?");
				}
				else
				{
					System.out.println("\nGostamos do seu resultado! Continue assim!");
				}
				
	}
	
	//M�todo para perguntas do p�blico Casado 1
	public void perguntasCasal1() {
			
		String resp;
		int pts=0;
				
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> perguntasCasal1 = new ArrayList<String>();
		perguntasCasal1.add("(1) Voc� executa tarefas dom�sticas(atingindo efetivamente seu objetivo) sem sua parceira pedir?(lavar lou�as, faxina, descongelar alimentos, lavar/secar roupas...)");
		perguntasCasal1.add("(2) Voc� interfere quando seu parceiro est�o realizando tarefas dom�stica de uma forma que Voc� n�o acha ideal (ainda que eficaz)?");
		perguntasCasal1.add("(3) Voc� se esfor�a para manter a chama acessa no relacionamento?(novas experiencias, di�logo aberto, demonstra��es de afeto...)");
		perguntasCasal1.add("(4) Voc� confia em deixar seu marido sozinho com seus filhos enquanto sai com as amigas?");
		perguntasCasal1.add("(5) Voc� tem proatividade nos cuidados com os membros da fam�lia? (agendamento m�dico dos filhos, reuni�es escolares, li��o de casa, fazer desfazer malas");
		perguntasCasal1.add("(6) Voc� envolve o parceiro na gest�o da casa, permitindo que ele se responsabilize por parte desta tarefa (gest�o financeira do lar, gest�o da alimenta��oo da familia, gest�o da vida escolar dos filhos...)");
		perguntasCasal1.add("(7) Em um momento de explos�o da sua parceira, voc� j� respondeu �s queixas de sobrecarga nas tarefas com a frase 'Mas era s� pedir'? ");
		
			System.out.println("\nQuiz Casal 1");
			System.out.println("\n\t****Responda �s perguntas a seguir com (S) Sim ou (N) N�o****\n");
		
			//Perguntas
			for(int i=1;i<=perguntasCasal1.size();i++)
			{
				System.out.println(perguntasCasal1.get(i-1)+" (S) Sim ou (N) N�o");//Para pegar a posi��o desejada do ArrayList
				resp = leia.nextLine();
				resp = resp.toUpperCase();
												
				if(resp.equals("S"))
				{
					System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal j� de priemira,hein");
				}
			}
				//Pontua��es
				System.out.println("\nSua pontua��o final foi: " +pts+ " pontos");
				if(pts<=2)
				{
					System.out.println("\nAchamos que muitos pontos em sua vida/relacionamento podem melhorar. que tal pensar nisso?");
				}
				else
				{
					System.out.println("\nGostamos do seu resultado! Continue assim!");
				}				
		}
	
		//M�todo para perguntas do p�blico Casado 2
		public void perguntasCasal2() {
						
			String resp;
			int pts=0;
					
			Scanner leia = new Scanner(System.in);
			
			ArrayList<String> perguntasCasal2 = new ArrayList();
			perguntasCasal2.add("(1) Voc� lavou suas roupas e a de seus familiares sem que sua parceira tenha pedido?)");
			perguntasCasal2.add("(2) Caso voc� os tenha, deu banho em seus filhos por iniciativa pr�pria, recentemente?");
			perguntasCasal2.add("(3) Nos �ltimos dias, voc� tirou o lixo da sua casa sem que algu�m antes te pedisse?)");
			perguntasCasal2.add("(4) Em um momento de explos�o da sua parceira, voc� j� respondeu �s queixas de sobrecarga nas tarefas com a frase 'Mas era s� pedir'?");
			
			
				System.out.println("\nQuiz Feminino");
				System.out.println("\n\t****Responda �s perguntas a seguir com (S) Sim ou (N) N�o****\n");
			
				//Perguntas
				for(int i=1;i<=perguntasCasal2.size();i++)
				{
					System.out.println(perguntasCasal2.get(i-1)+" (S) Sim ou (N) N�o");//Para pegar a posi��o desejada do ArrayList
					resp = leia.nextLine();
					resp = resp.toUpperCase();
													
					if(resp.equals("S"))
					{
						System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
						pts++;
					}
					else 
					{
						System.out.println("\nMandou bem mal j� de priemira,hein");
					}
				}
					//Pontua��es
					System.out.println("\nSua pontua��o final foi: " +pts+ " pontos");
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
	
