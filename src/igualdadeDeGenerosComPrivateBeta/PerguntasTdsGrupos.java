package igualdadeDeGenerosComPrivateBeta;

import java.util.ArrayList;
import java.util.Scanner;

public class PerguntasTdsGrupos {
	/*
	 * M�todo add � Adiciona um elemento no final do ArrayList. M�todo clear �
	 * Remove todos os elementos da estrutura. --> M�todo contains � Verifica se o
	 * ArrayList cont�m um elemento especificado, e retorna true em caso positivo,
	 * ou false caso contr�rio. M�todo get � Retorna o item em uma posi��o de �ndice
	 * especificada. M�todo indexOf � Retorna a posi��o de �ndice da primeira
	 * ocorr�ncia de um elemento especificado. M�todo remove � Remove a primeira
	 * ocorr�ncia de um valor especificado ou de um elemento em um �ndice. M�todo
	 * size � Informa o n�mero de elementos que est�o armazenados na estrutura.
	 * M�todo trimToSize � Ajusta a capacidade do ArrayList de acordo com o n�mero
	 * de elementos armazenados no momento.
	 */

	// M�todo para perguntas do p�blico Masculino1
	public void perguntasMasculino1() {

		String resp;
		int pts = 0;

		Scanner leia = new Scanner(System.in);

		ArrayList<String> perguntasMasculino1 = new ArrayList<String>();
		perguntasMasculino1.add(
				"(1) Voc� executa tarefas dom�sticas(atingindo efetivamente seu objetivo) sem sua parceira pedir?(lavar lou�as,\n"
				+ "faxina, descongelar alimentos, lavar/secar roupas...)");
		perguntasMasculino1.add(
				"(2) Voc� contribui para uma alimenta��o equilibrada dos membros da sua familia?(lista de compras, supermercado,\n"
				+ "preparo de refei��es...)");
		perguntasMasculino1.add(
				"(3) Voc� se esfor�a para manter a chama acessa no relacionamento?(novas experiencias, di�logo aberto,\n"
				+ "demonstra��es de afeto...)");
		perguntasMasculino1.add(
				"(4) Voc� tem proatividade nos cuidados com os membros da fam�lia? (agendamento m�dico dos filhos, reuni�es escolares,\n"
				+ " li��o de casa, fazer desfazer malas");
		perguntasMasculino1.add(
				"(5) Em um momento de explos�o da sua parceira, voc� j� respondeu ��s queixas de sobrecarga nas tarefas com a frase\n"
				+ "'Mas era s� pedir'? ");
		perguntasMasculino1.add(
				"(6) Voc� contribui para uma alimenta��o equilibrada dos membros da sua familia?(lista de compras, supermercado,preparo\n"
				+ " de refei��es...)");

		System.out.println("\nQuiz Masculino");
		System.out.println("\n\t****Responda �s perguntas a seguir com (S) Sim ou (N) N�o****\n");

		// Perguntas
		for (int i = 1; i <= perguntasMasculino1.size(); i++) {
			System.out.println(perguntasMasculino1.get(i - 1) + " (S) Sim ou (N) N�o");// Para pegar a posi��o desejada
																						// do ArrayList
			resp = leia.nextLine();
			resp = resp.toUpperCase();

			if (resp.equals("S")) {
				System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
				pts++;
			} else {
				System.out.println("\nMandou bem mal, hein");
			}
		}
		//Pontua��es masculino
	    System.out.println("\nSua pontua��o final foi: " +pts+ " pontos");
	    if(pts >=0 && pts <2)
	    {
	        System.out.println("\n Voc� marcou 0 � 1 ponto, isso significa que a carga mental das tarefas dom�sticas em sua casa\n"
			        		+ "est� completamente atribu�da � sua parceira, de acordo com dados levantados pelo IBGE entre1997 e 2007,\n"
			        		+ "o n�mero de div�rcios aumentou 200%, e a sobrecarga da mulher nas tarefas dom�sticas est� relacionada �\n"
			        		+ " este n�mero.As atividades dom�sticas, necess�rias para manter a integridade de um lar (como lavar lou�a,\n"
			        		+ " fazer faxina, cuidar das crian�as e cozinhar) que s�o consideradas corriqueiras, se n�o forem planejadas\n"
			        		+ "e executadas, inviabilizam o funcionamento da economia formal.\n");
	    }
	    else if (pts >=2 && pts <5)
	    {
	        System.out.println("\n Voc� marcou 2 - 4 pontos isso significa que a carga mental das tarefas dom�sticas em sua casa � atribu�da\n"
	        		+ "majoritariamente � sua parceira. Mesmo para as mulheres que trabalham fora de casa, o seu envolvimento em maior escala\n"
	        		+ "em atividades de cuidados e/ou afazeres dom�sticos tende a impactar na forma de inser��o delas no mercado de trabalho,\n"
	        		+ " que � marcada pela necessidade de concilia��o da dupla jornada entre trabalho remunerado e n�o-remunerado (CMIG 14).\n"
	                + "No Brasil, em 2019, de acordo com dados do IBGE, as mulheres dedicaram aos cuidados de pessoas ou afazeres dom�sticos\n"
	                + " quase o dobro de tempo que os homens (21,4 horas contra 11,0 horas).\n");
	    }
	    else if(pts >=5 && pts <7)
	    {
	        System.out.println("\n Voc� marcou 5 - 6 pontos isso significa que a carga mental das tarefas dom�sticas em sua casa est� caminhando\n"
	        		+ "para uma situa��o de igualdade.Parab�ns sua dedica��o em dividir o peso da carga mental com sua parceira faz de voc�s uma \n"
	        		+ "exce��o, e a sua fam�lia est� contribuindo para a mudan�a do status quo no que diz respeito aos papeis de g�nero dentro do\n"
	        		+ "lar, em que as mulheres dedicam o dobro do tempo que o homem na realiza��o das tarefas dom�sticas!\n");
	    }
	    else
	    {
	        System.out.println ("\n Houve um erro, por favor refa�a o quizz.");
	    }
	}

	// M�todo para perguntas do p�blico Feminino
	public void perguntasFeminino1() {

		String resp;
		int pts = 0;

		Scanner leia = new Scanner(System.in);

		ArrayList<String> perguntasFeminino1 = new ArrayList<String>();// Criando objeto perguntasFeminino1 do ArrayList
		perguntasFeminino1.add(
				"(1) Voc� interfere quando seu parceiro est� realizando tarefas dom�stica de uma forma que voc� n�o acha ideal \n"
				+ "(ainda que eficaz)?");
		perguntasFeminino1
				.add("(2) Voc� confia em deixar seu marido sozinho com seus filhos enquanto sai com as amigas?");
		perguntasFeminino1.add(
				"(3) Voc� envolve o parceiro na gest�o da casa, permitindo que ele se responsabilize por parte desta tarefa \n"
				+ "(gest�o financeira do lar, gest�o da alimenta��o da familia, gest�o da vida escolar dos filhos...)");

		System.out.println("\nQuiz Feminino");
		System.out.println("\n\t****Responda �s perguntas a seguir com (S) Sim ou (N) N�o****\n");

		// Perguntas
		for (int i = 1; i <= perguntasFeminino1.size(); i++) {
			System.out.println(perguntasFeminino1.get(i - 1) + " (S) Sim ou (N) N�o");// Para pegar a posi��o desejada
																						// do ArrayList
			resp = leia.nextLine();
			resp = resp.toUpperCase();

			if (resp.equals("S")) {
				System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
				pts++;
			} else {
				System.out.println("\nMandou bem mal, hein");
			}
		}
		// Pontua��es
		System.out.println("\nSua pontua��o final foi: " +pts+ " pontos");
		if(pts >=0 && pts <2)
	{
		System.out.println("\n Voc� marcou 0 � 1 ponto. Isso significa que voc� e seu parceiro n�o t�m uma divis�o igualit�ria das tarefas\n"
				+ "dom�sticas. Esta situa��o ocorre na maioria dos lares brasileiros, nos quais a mulher dedicam o dobro de tempo que os\n"
				+ "homens nas tarefas dom�sticas. Que tal come�ar a envolver o seu marido nas tarefas dom�sticas?\n");
	}
	else if (pts ==2)
	{
		System.out.println("\n Voc� marcou 2 pontos. Voc� j� tem se esfor�ado para mudar o cen�rio predominante no Brasil de acordo com os\n"
				+ "dados do IBGE, em que as mulheres gastam o dobro de seu tempo planejando e executando as tarefas dom�sticas!\n");
	}
	else if(pts ==3)
	{
		System.out.println("\n Voc� marcou 3 pontos. Parab�ns! Sua fam�lia faz parte da exce��o. Na maioria dos lares brasileiros as mulheres\n"
				+ "n�o tem uma divis�o igualit�ria das tarefas dom�sticas, ainda que trabalhem fora. As mulheres despendem do dobro de seu tempo em rela��o aos homens com cuidados dom�sticos e voc�s est�o contribuindo para que estes dados mudem.\n");
	}
	else
	{
		System.out.println ("\n Houve um erro, por favor refa�a o quizz.");
	}

	}

	// M�todo para perguntas do p�blico Casado 1
	public void perguntasCasal1() {

		String resp;
		int pts = 0;

		Scanner leia = new Scanner(System.in);

		ArrayList<String> perguntasCasal1 = new ArrayList<String>();
		perguntasCasal1.add(
				"(1) Voc� executa tarefas dom�sticas(atingindo efetivamente seu objetivo) sem sua parceira pedir?(lavar lou�as, faxina,\n"
				+ "descongelar alimentos, lavar/secar roupas...)");
		perguntasCasal1.add("(2) Voc� interfere quando seu parceiro est�o realizando tarefas dom�stica de uma forma que Voc� n�o acha ideal\n"
				+ "(ainda que eficaz)?");
		perguntasCasal1.add("(3) Voc� se esfor�a para manter a chama acessa no relacionamento?(novas experiencias, di�logo aberto, demonstra��es\n"
				+ " de afeto...)");
		perguntasCasal1.add("(4) Voc� confia em deixar seu marido sozinho com seus filhos enquanto sai com as amigas?");
		perguntasCasal1.add("(5) Voc� tem proatividade nos cuidados com os membros da fam�lia? (agendamento m�dico dos filhos, reuni�es escolares,\n"
				+ "li��o de casa, fazer desfazer malas");
		perguntasCasal1.add("(6) Voc� envolve o parceiro na gest�o da casa, permitindo que ele se responsabilize por parte desta tarefa\n"
				+ "(gest�o financeira do lar, gest�o da alimenta��oo da familia, gest�o da vida escolar dos filhos...)");
		perguntasCasal1.add(
				"(7) Em um momento de explos�o da sua parceira, voc� j� respondeu �s queixas de sobrecarga nas tarefas com a frase 'Mas era s� pedir'? ");

		System.out.println("\nQuiz Casal 1");
		System.out.println("\n\t****Responda �s perguntas a seguir com (S) Sim ou (N) N�o****\n");

		// Perguntas
		for (int i = 1; i <= perguntasCasal1.size(); i++) {
			System.out.println(perguntasCasal1.get(i - 1) + " (S) Sim ou (N) N�o");// Para pegar a posi��o desejada do
																					// ArrayList
			resp = leia.nextLine();
			resp = resp.toUpperCase();

			if (resp.equals("S")) {
				System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
				pts++;
			} else {
				System.out.println("\nMandou bem mal, hein");
			}
		}
		// Pontua��es
		System.out.println("\nSua pontua��o final foi: " + pts + " pontos");
		if (pts <= 2) {
			System.out.println(
					"\nAchamos que muitos pontos em sua vida/relacionamento podem melhorar. que tal pensar nisso?");
		} else {
			System.out.println("\nGostamos do seu resultado! Continue assim!");
		}
	}

	// M�todo para perguntas do p�blico Casado 2
	public void perguntasCasal2() {

		String resp;
		int pts = 0;

		Scanner leia = new Scanner(System.in);

		ArrayList<String> perguntasCasal2 = new ArrayList();
		perguntasCasal2.add("(1) Voc� lavou suas roupas e a de seus familiares sem que sua parceira tenha pedido?)");
		perguntasCasal2.add("(2) Caso voc� os tenha, deu banho em seus filhos por iniciativa pr�pria, recentemente?");
		perguntasCasal2.add("(3) Nos �ltimos dias, voc� tirou o lixo da sua casa sem que algu�m antes te pedisse?)");
		perguntasCasal2.add("(4) Em um momento de explos�o da sua parceira, voc� j� respondeu �s queixas de sobrecarga\n"
				+ "nas tarefas com a frase 'Mas era s� pedir'?");

		System.out.println("\nQuiz Casal 2");
		System.out.println("\n\t****Responda �s perguntas a seguir com (S) Sim ou (N) N�o****\n");

		// Perguntas
		for (int i = 1; i <= perguntasCasal2.size(); i++) {
			System.out.println(perguntasCasal2.get(i - 1) + " (S) Sim ou (N) N�o");// Para pegar a posi��o desejada do ArrayList
			resp = leia.nextLine();
			resp = resp.toUpperCase();

			if (resp.equals("S")) {
				System.out.println("\nMuito bem! Estou come�ando a gostar de voc�");
				pts++;
			} else {
				System.out.println("\nMandou bem mal, hein");
			}
		}
		// Pontua��es
		System.out.println("\nSua pontua��o final foi: " + pts + " pontos");
		if (pts <= 2) {
			System.out.println(
					"\nAchamos que muitos pontos em sua vida/relacionamento podem melhorar. que tal pensar nisso?");
		} else {
			System.out.println("\nGostamos do seu resultado! Continue assim!");
		}
	}
}
