package igualdadeDeGeneros;

import java.util.ArrayList;
import java.util.Scanner;

public class PopularPerguntasCopiaSeguranca {
	
	//M�todo para perguntas do p�blico Masculino1
	public int perguntasMasculino1(int op) {
		
		String r1,r2,r3,r4,r5,r6;
		int pts=0,cont=0;
				
		Scanner leia = new Scanner(System.in);
				
		ArrayList<String> perguntasMasculino1 = new ArrayList();
		perguntasMasculino1.add("(1) Voc� executa tarefas dom�sticas(atingindo efetivamente seu objetivo) sem sua parceira pedir?(lavar lou�as, faxina, descongelar alimentos, lavar/secar roupas...)");
		perguntasMasculino1.add("(2) Voc� contribui para uma alimenta��o equilibrada dos membros da sua familia?(lista de compras, supermercado,preparo de refei��es...)");
		perguntasMasculino1.add("(3) Voc� se esfor�a para manter a chama acessa no relacionamento?(novas experiencias, di�logo aberto, demonstra��es de afeto...)");
		perguntasMasculino1.add("(4) Voc� tem proatividade nos cuidados com os membros da fam�lia? (agendamento m�dico dos filhos, reuni�es escolares, li��o de casa, fazer desfazer malas");
		perguntasMasculino1.add("(5) Em um momento de explos�o da sua parceira, voc� j� respondeu ��s queixas de sobrecarga nas tarefas com a frase 'Mas era s� pedir'? ");
		perguntasMasculino1.add("(6) Voc� contribui para uma alimenta��o equilibrada dos membros da sua familia?(lista de compras, supermercado,preparo de refei��es...)");
		
				System.out.println("\nQuiz Masculino");
				System.out.println("\n\t****Responda �s perguntas a seguir com (S) Sim ou (N) N�o****\n");
		
				//Pergunta 1
				System.out.println(perguntasMasculino1.get(0)+" (S) Sim ou (N) N�o");//Para pegar a posi��o desejada do ArrayList
				r1 = leia.nextLine();
				r1 = r1.toUpperCase();
				cont++;
				if(r1.equals("S"))
				{
					System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal j� de priemira,hein");
				}
				
				//Pergunta 2
				System.out.println(perguntasMasculino1.get(1)+" (S) Sim ou (N) N�o");//Para pegar a posi��o desejada do ArrayList
				r2 = leia.nextLine();
				r2 = r2.toUpperCase();
				cont++;
				if(r2.equals("S"))
				{
					System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal j� de priemira,hein");
				}
				
				//Pergunta 3
				System.out.println(perguntasMasculino1.get(2)+" (S) Sim ou (N) N�o");//Para pegar a posi��o desejada do ArrayList
				r3 = leia.nextLine();
				r3 = r3.toUpperCase();
				cont++;
				if(r3.equals("S"))
				{
					System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal j� de priemira,hein");
				}
		
				//Pergunta 4
				System.out.println(perguntasMasculino1.get(3)+" (S) Sim ou (N) N�o");//Para pegar a posi��o desejada do ArrayList
				r4 = leia.nextLine();
				r4 = r4.toUpperCase();
				cont++;
				if(r4.equals("S"))
				{
					System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal j� de priemira,hein");
				}
		
				//Pergunta 5
				System.out.println(perguntasMasculino1.get(4)+" (S) Sim ou (N) N�o");//Para pegar a posi��o desejada do ArrayList
				r5 = leia.nextLine();
				r5 = r5.toUpperCase();
				cont++;
				if(r5.equals("S"))
				{
					System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal j� de priemira,hein");
				}
				
				//Pergunta 6
				System.out.println(perguntasMasculino1.get(5)+" (S) Sim ou (N) N�o");//Para pegar a posi��o desejada do ArrayList
				r6 = leia.nextLine();
				r6 = r6.toUpperCase();
				cont++;
				if(r6.equals("S"))
				{
					System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal j� de priemira,hein");
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
				cont++;
				
				return 100;
			
	}
	
		
	//M�todo para perguntas do p�blico Feminino
	public int perguntasFeminino1(int op) {
	
		String r1,r2,r3,r4,r5,r6;
		int pts=0,cont=0;
				
		Scanner leia = new Scanner(System.in);
	
		ArrayList<String> perguntasFeminino1 = new ArrayList();
		perguntasFeminino1.add("(1) Voc� interfere quando seu parceiro est� realizando tarefas dom�stica de uma forma que voc� n�o acha ideal (ainda que eficaz)?");
		perguntasFeminino1.add("(2) Voc� confia em deixar seu marido sozinho com seus filhos enquanto sai com as amigas?");
		perguntasFeminino1.add("(3) Voc� envolve o parceiro na gest�o da casa, permitindo que ele se responsabilize por parte desta tarefa (gest�o financeira do lar, gest�o da alimenta��o da familia, gest�o da vida escolar dos filhos...)");
		
			System.out.println("\nQuiz Feminino");
			System.out.println("\n\t****Responda �s perguntas a seguir com (S) Sim ou (N) N�o****\n");
		
				//Pergunta 1
				System.out.println(perguntasFeminino1.get(0)+" (S) Sim ou (N) N�o");//Para pegar a posi��o desejada do ArrayList
				r1 = leia.nextLine();
				r1 = r1.toUpperCase();
				cont++;
				if(r1.equals("S"))
				{
					System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal j� de priemira,hein");
				}
				
				//Pergunta 2
				System.out.println(perguntasFeminino1.get(1)+" (S) Sim ou (N) N�o");//Para pegar a posi��o desejada do ArrayList
				r2 = leia.nextLine();
				r2 = r2.toUpperCase();
				cont++;
				if(r2.equals("S"))
				{
					System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal j� de priemira,hein");
				}
				
				//Pergunta 3
				System.out.println(perguntasFeminino1.get(2)+" (S) Sim ou (N) N�o");//Para pegar a posi��o desejada do ArrayList
				r3 = leia.nextLine();
				r3 = r3.toUpperCase();
				cont++;
				if(r3.equals("S"))
				{
					System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal j� de priemira,hein");
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
				cont++;
				
				return 100;
	}
	
	
		
	//M�todo para perguntas do p�blico Casado 1
	public int perguntasCasal1(int op) {
	
		String r1,r2,r3,r4,r5,r6,r7;
		int pts=0,cont=0;
				
		Scanner leia = new Scanner(System.in);
	
		ArrayList<String> perguntasCasal1 = new ArrayList();
		perguntasCasal1.add("(1) Voc� executa tarefas dom�sticas(atingindo efetivamente seu objetivo) sem sua parceira pedir?(lavar lou�as, faxina, descongelar alimentos, lavar/secar roupas...)");
		perguntasCasal1.add("(2) Voc� interfere quando seu parceiro est�o realizando tarefas dom�stica de uma forma que Voc� n�o acha ideal (ainda que eficaz)?");
		perguntasCasal1.add("(3) Voc� se esfor�a para manter a chama acessa no relacionamento?(novas experiencias, di�logo aberto, demonstra��es de afeto...)");
		perguntasCasal1.add("(4) Voc� confia em deixar seu marido sozinho com seus filhos enquanto sai com as amigas?");
		perguntasCasal1.add("(5) Voc� tem proatividade nos cuidados com os membros da fam�lia? (agendamento m�dico dos filhos, reuni�es escolares, li��o de casa, fazer desfazer malas");
		perguntasCasal1.add("(6) Voc� envolve o parceiro na gest�o da casa, permitindo que ele se responsabilize por parte desta tarefa (gest�o financeira do lar, gest�o da alimenta��oo da familia, gest�o da vida escolar dos filhos...)");
		perguntasCasal1.add("(7) Em um momento de explos�o da sua parceira, voc� j� respondeu �s queixas de sobrecarga nas tarefas com a frase 'Mas era s� pedir'? ");
		
				System.out.println("\nQuiz Casal 1");
				System.out.println("\n\t****Responda �s perguntas a seguir com (S) Sim ou (N) N�o****\n");
		
				//Pergunta 1
				System.out.println(perguntasCasal1.get(0)+" (S) Sim ou (N) N�o");//Para pegar a posi��o desejada do ArrayList
				r1 = leia.nextLine();
				r1 = r1.toUpperCase();
				cont++;
				if(r1.equals("S"))
				{
					System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal j� de priemira,hein");
				}
				
				//Pergunta 2
				System.out.println(perguntasCasal1.get(1)+" (S) Sim ou (N) N�o");//Para pegar a posi��o desejada do ArrayList
				r2 = leia.nextLine();
				r2 = r2.toUpperCase();
				cont++;
				if(r2.equals("S"))
				{
					System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal j� de priemira,hein");
				}
				
				//Pergunta 3
				System.out.println(perguntasCasal1.get(2)+" (S) Sim ou (N) N�o");//Para pegar a posi��o desejada do ArrayList
				r3 = leia.nextLine();
				r3 = r3.toUpperCase();
				cont++;
				if(r3.equals("S"))
				{
					System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal j� de priemira,hein");
				}
		
				//Pergunta 4
				System.out.println(perguntasCasal1.get(3)+" (S) Sim ou (N) N�o");//Para pegar a posi��o desejada do ArrayList
				r4 = leia.nextLine();
				r4 = r4.toUpperCase();
				cont++;
				if(r4.equals("S"))
				{
					System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal j� de priemira,hein");
				}
		
				//Pergunta 5
				System.out.println(perguntasCasal1.get(4)+" (S) Sim ou (N) N�o");//Para pegar a posi��o desejada do ArrayList
				r5 = leia.nextLine();
				r5 = r5.toUpperCase();
				cont++;
				if(r5.equals("S"))
				{
					System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal j� de priemira,hein");
				}
				
				//Pergunta 6
				System.out.println(perguntasCasal1.get(5)+" (S) Sim ou (N) N�o");//Para pegar a posi��o desejada do ArrayList
				r6 = leia.nextLine();
				r6 = r6.toUpperCase();
				cont++;
				if(r6.equals("S"))
				{
					System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal j� de priemira,hein");
				}
				
				//Pergunta 7
				System.out.println(perguntasCasal1.get(6)+" (S) Sim ou (N) N�o");//Para pegar a posi��o desejada do ArrayList
				r7 = leia.nextLine();
				r7 = r7.toUpperCase();
				cont++;
				if(r7.equals("S"))
				{
					System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
					pts++;
				}
				else 
				{
					System.out.println("\nMandou bem mal j� de priemira,hein");
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
				cont++;
				
				return 100;
		}
	
		//M�todo para perguntas do p�blico Casado 2
		public int perguntasCasal2(int op) {
			
			String r1,r2,r3,r4,r5,r6,r7;
			int pts=0,cont=0;
					
			Scanner leia = new Scanner(System.in);
			
			ArrayList<String> perguntasCasal2 = new ArrayList();
			perguntasCasal2.add("(1) Voc� lavou suas roupas e a de seus familiares sem que sua parceira tenha pedido?)");
			perguntasCasal2.add("(2) Caso voc� os tenha, deu banho em seus filhos por iniciativa pr�pria, recentemente?");
			perguntasCasal2.add("(3) Nos �ltimos dias, voc� tirou o lixo da sua casa sem que algu�m antes te pedisse?)");
			perguntasCasal2.add("(4) Em um momento de explos�o da sua parceira, voc� j� respondeu �s queixas de sobrecarga nas tarefas com a frase 'Mas era s� pedir'?");
			perguntasCasal2.add("(5) Na sua casa, voc� cozinha?");
			
					System.out.println("\nQuiz Casal 2");	
					System.out.println("\n\t****Responda �s perguntas a seguir com (S) Sim ou (N) N�o****\n");
			
					//Pergunta 1
					System.out.println(perguntasCasal2.get(0)+" (S) Sim ou (N) N�o");//Para pegar a posi��o desejada do ArrayList
					r1 = leia.nextLine();
					r1 = r1.toUpperCase();
					cont++;
					if(r1.equals("S"))
					{
						System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
						pts++;
					}
					else 
					{
						System.out.println("\nMandou bem mal j� de priemira,hein");
					}
					
					//Pergunta 2
					System.out.println(perguntasCasal2.get(1)+" (S) Sim ou (N) N�o");//Para pegar a posi��o desejada do ArrayList
					r2 = leia.nextLine();
					r2 = r2.toUpperCase();
					cont++;
					if(r2.equals("S"))
					{
						System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
						pts++;
					}
					else 
					{
						System.out.println("\nMandou bem mal j� de priemira,hein");
					}
					
					//Pergunta 3
					System.out.println(perguntasCasal2.get(2)+" (S) Sim ou (N) N�o");//Para pegar a posi��o desejada do ArrayList
					r3 = leia.nextLine();
					r3 = r3.toUpperCase();
					cont++;
					if(r3.equals("S"))
					{
						System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
						pts++;
					}
					else 
					{
						System.out.println("\nMandou bem mal j� de priemira,hein");
					}
			
					//Pergunta 4
					System.out.println(perguntasCasal2.get(3)+" (S) Sim ou (N) N�o");//Para pegar a posi��o desejada do ArrayList
					r4 = leia.nextLine();
					r4 = r4.toUpperCase();
					cont++;
					if(r4.equals("S"))
					{
						System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
						pts++;
					}
					else 
					{
						System.out.println("\nMandou bem mal j� de priemira,hein");
					}
			
					//Pergunta 5
					System.out.println(perguntasCasal2.get(4)+" (S) Sim ou (N) N�o");//Para pegar a posi��o desejada do ArrayList
					r5 = leia.nextLine();
					r5 = r5.toUpperCase();
					cont++;
					if(r5.equals("S"))
					{
						System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
						pts++;
					}
					else 
					{
						System.out.println("\nMandou bem mal j� de priemira,hein");
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
					cont++;
					
					return 100;
			
		}
	
}
	
