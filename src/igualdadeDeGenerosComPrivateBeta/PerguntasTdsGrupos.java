package igualdadeDeGenerosComPrivateBeta;

import java.util.ArrayList;
import java.util.Scanner;

public class PerguntasTdsGrupos {
	/*
	 * Método add – Adiciona um elemento no final do ArrayList. Método clear –
	 * Remove todos os elementos da estrutura. --> Método contains – Verifica se o
	 * ArrayList contém um elemento especificado, e retorna true em caso positivo,
	 * ou false caso contrário. Método get – Retorna o item em uma posição de índice
	 * especificada. Método indexOf – Retorna a posição de índice da primeira
	 * ocorrência de um elemento especificado. Método remove – Remove a primeira
	 * ocorrência de um valor especificado ou de um elemento em um índice. Método
	 * size – Informa o número de elementos que estão armazenados na estrutura.
	 * Método trimToSize – Ajusta a capacidade do ArrayList de acordo com o número
	 * de elementos armazenados no momento.
	 */

	// Método para perguntas do público Masculino1
	public void perguntasMasculino1() {

		String resp;
		int pts = 0;

		Scanner leia = new Scanner(System.in);

		ArrayList<String> perguntasMasculino1 = new ArrayList<String>();
		perguntasMasculino1.add(
				"(1) Você executa tarefas domésticas(atingindo efetivamente seu objetivo) sem sua parceira pedir?(lavar louças,\n"
				+ "faxina, descongelar alimentos, lavar/secar roupas...)");
		perguntasMasculino1.add(
				"(2) Você contribui para uma alimentação equilibrada dos membros da sua familia?(lista de compras, supermercado,\n"
				+ "preparo de refeições...)");
		perguntasMasculino1.add(
				"(3) Você se esforça para manter a chama acessa no relacionamento?(novas experiencias, diálogo aberto,\n"
				+ "demonstrações de afeto...)");
		perguntasMasculino1.add(
				"(4) Você tem proatividade nos cuidados com os membros da família? (agendamento médico dos filhos, reuniões escolares,\n"
				+ " lição de casa, fazer desfazer malas");
		perguntasMasculino1.add(
				"(5) Em um momento de explosão da sua parceira, você já respondeu  às queixas de sobrecarga nas tarefas com a frase\n"
				+ "'Mas era só pedir'? ");
		perguntasMasculino1.add(
				"(6) Você contribui para uma alimentação equilibrada dos membros da sua familia?(lista de compras, supermercado,preparo\n"
				+ " de refeições...)");

		System.out.println("\nQuiz Masculino");
		System.out.println("\n\t****Responda às perguntas a seguir com (S) Sim ou (N) Não****\n");

		// Perguntas
		for (int i = 1; i <= perguntasMasculino1.size(); i++) {
			System.out.println(perguntasMasculino1.get(i - 1) + " (S) Sim ou (N) Não");// Para pegar a posição desejada
																						// do ArrayList
			resp = leia.nextLine();
			resp = resp.toUpperCase();

			if (resp.equals("S")) {
				System.out.println("\nMuito bem! Estou começando a gostar de você");
				pts++;
			} else {
				System.out.println("\nMandou bem mal, hein");
			}
		}
		//Pontuações masculino
	    System.out.println("\nSua pontuação final foi: " +pts+ " pontos");
	    if(pts >=0 && pts <2)
	    {
	        System.out.println("\n Você marcou 0 – 1 ponto, isso significa que a carga mental das tarefas domésticas em sua casa\n"
			        		+ "está completamente atribuída à sua parceira, de acordo com dados levantados pelo IBGE entre1997 e 2007,\n"
			        		+ "o número de divórcios aumentou 200%, e a sobrecarga da mulher nas tarefas domésticas está relacionada à\n"
			        		+ " este número.As atividades domésticas, necessárias para manter a integridade de um lar (como lavar louça,\n"
			        		+ " fazer faxina, cuidar das crianças e cozinhar) que são consideradas corriqueiras, se não forem planejadas\n"
			        		+ "e executadas, inviabilizam o funcionamento da economia formal.\n");
	    }
	    else if (pts >=2 && pts <5)
	    {
	        System.out.println("\n Você marcou 2 - 4 pontos isso significa que a carga mental das tarefas domésticas em sua casa é atribuída\n"
	        		+ "majoritariamente à sua parceira. Mesmo para as mulheres que trabalham fora de casa, o seu envolvimento em maior escala\n"
	        		+ "em atividades de cuidados e/ou afazeres domésticos tende a impactar na forma de inserção delas no mercado de trabalho,\n"
	        		+ " que é marcada pela necessidade de conciliação da dupla jornada entre trabalho remunerado e não-remunerado (CMIG 14).\n"
	                + "No Brasil, em 2019, de acordo com dados do IBGE, as mulheres dedicaram aos cuidados de pessoas ou afazeres domésticos\n"
	                + " quase o dobro de tempo que os homens (21,4 horas contra 11,0 horas).\n");
	    }
	    else if(pts >=5 && pts <7)
	    {
	        System.out.println("\n Você marcou 5 - 6 pontos isso significa que a carga mental das tarefas domésticas em sua casa está caminhando\n"
	        		+ "para uma situação de igualdade.Parabéns sua dedicação em dividir o peso da carga mental com sua parceira faz de vocês uma \n"
	        		+ "exceção, e a sua família está contribuindo para a mudança do status quo no que diz respeito aos papeis de gênero dentro do\n"
	        		+ "lar, em que as mulheres dedicam o dobro do tempo que o homem na realização das tarefas domésticas!\n");
	    }
	    else
	    {
	        System.out.println ("\n Houve um erro, por favor refaça o quizz.");
	    }
	}

	// Método para perguntas do público Feminino
	public void perguntasFeminino1() {

		String resp;
		int pts = 0;

		Scanner leia = new Scanner(System.in);

		ArrayList<String> perguntasFeminino1 = new ArrayList<String>();// Criando objeto perguntasFeminino1 do ArrayList
		perguntasFeminino1.add(
				"(1) Você interfere quando seu parceiro está realizando tarefas doméstica de uma forma que você não acha ideal \n"
				+ "(ainda que eficaz)?");
		perguntasFeminino1
				.add("(2) Você confia em deixar seu marido sozinho com seus filhos enquanto sai com as amigas?");
		perguntasFeminino1.add(
				"(3) Você envolve o parceiro na gestão da casa, permitindo que ele se responsabilize por parte desta tarefa \n"
				+ "(gestão financeira do lar, gestão da alimentação da familia, gestão da vida escolar dos filhos...)");

		System.out.println("\nQuiz Feminino");
		System.out.println("\n\t****Responda às perguntas a seguir com (S) Sim ou (N) Não****\n");

		// Perguntas
		for (int i = 1; i <= perguntasFeminino1.size(); i++) {
			System.out.println(perguntasFeminino1.get(i - 1) + " (S) Sim ou (N) Não");// Para pegar a posição desejada
																						// do ArrayList
			resp = leia.nextLine();
			resp = resp.toUpperCase();

			if (resp.equals("S")) {
				System.out.println("\nMuito bem! Estou começando a gostar de você");
				pts++;
			} else {
				System.out.println("\nMandou bem mal, hein");
			}
		}
		// Pontuações
		System.out.println("\nSua pontuação final foi: " +pts+ " pontos");
		if(pts >=0 && pts <2)
	{
		System.out.println("\n Você marcou 0 – 1 ponto. Isso significa que você e seu parceiro não têm uma divisão igualitária das tarefas\n"
				+ "domésticas. Esta situação ocorre na maioria dos lares brasileiros, nos quais a mulher dedicam o dobro de tempo que os\n"
				+ "homens nas tarefas domésticas. Que tal começar a envolver o seu marido nas tarefas domésticas?\n");
	}
	else if (pts ==2)
	{
		System.out.println("\n Você marcou 2 pontos. Você já tem se esforçado para mudar o cenário predominante no Brasil de acordo com os\n"
				+ "dados do IBGE, em que as mulheres gastam o dobro de seu tempo planejando e executando as tarefas domésticas!\n");
	}
	else if(pts ==3)
	{
		System.out.println("\n Você marcou 3 pontos. Parabéns! Sua família faz parte da exceção. Na maioria dos lares brasileiros as mulheres\n"
				+ "não tem uma divisão igualitária das tarefas domésticas, ainda que trabalhem fora. As mulheres despendem do dobro de seu tempo em relação aos homens com cuidados domésticos e vocês estão contribuindo para que estes dados mudem.\n");
	}
	else
	{
		System.out.println ("\n Houve um erro, por favor refaça o quizz.");
	}

	}

	// Método para perguntas do público Casado 1
	public void perguntasCasal1() {

		String resp;
		int pts = 0;

		Scanner leia = new Scanner(System.in);

		ArrayList<String> perguntasCasal1 = new ArrayList<String>();
		perguntasCasal1.add(
				"(1) Você executa tarefas domésticas(atingindo efetivamente seu objetivo) sem sua parceira pedir?(lavar louças, faxina,\n"
				+ "descongelar alimentos, lavar/secar roupas...)");
		perguntasCasal1.add("(2) Você interfere quando seu parceiro estão realizando tarefas doméstica de uma forma que Você não acha ideal\n"
				+ "(ainda que eficaz)?");
		perguntasCasal1.add("(3) Você se esforça para manter a chama acessa no relacionamento?(novas experiencias, diálogo aberto, demonstrações\n"
				+ " de afeto...)");
		perguntasCasal1.add("(4) Você confia em deixar seu marido sozinho com seus filhos enquanto sai com as amigas?");
		perguntasCasal1.add("(5) Você tem proatividade nos cuidados com os membros da família? (agendamento médico dos filhos, reuniões escolares,\n"
				+ "lição de casa, fazer desfazer malas");
		perguntasCasal1.add("(6) Você envolve o parceiro na gestão da casa, permitindo que ele se responsabilize por parte desta tarefa\n"
				+ "(gestão financeira do lar, gestão da alimentaçãoo da familia, gestão da vida escolar dos filhos...)");
		perguntasCasal1.add(
				"(7) Em um momento de explosão da sua parceira, você já respondeu às queixas de sobrecarga nas tarefas com a frase 'Mas era só pedir'? ");

		System.out.println("\nQuiz Casal 1");
		System.out.println("\n\t****Responda às perguntas a seguir com (S) Sim ou (N) Não****\n");

		// Perguntas
		for (int i = 1; i <= perguntasCasal1.size(); i++) {
			System.out.println(perguntasCasal1.get(i - 1) + " (S) Sim ou (N) Não");// Para pegar a posição desejada do
																					// ArrayList
			resp = leia.nextLine();
			resp = resp.toUpperCase();

			if (resp.equals("S")) {
				System.out.println("\nMuito bem! Estou começando a gostar de você");
				pts++;
			} else {
				System.out.println("\nMandou bem mal, hein");
			}
		}
		// Pontuações
		System.out.println("\nSua pontuação final foi: " + pts + " pontos");
		if (pts <= 2) {
			System.out.println(
					"\nAchamos que muitos pontos em sua vida/relacionamento podem melhorar. que tal pensar nisso?");
		} else {
			System.out.println("\nGostamos do seu resultado! Continue assim!");
		}
	}

	// Método para perguntas do público Casado 2
	public void perguntasCasal2() {

		String resp;
		int pts = 0;

		Scanner leia = new Scanner(System.in);

		ArrayList<String> perguntasCasal2 = new ArrayList();
		perguntasCasal2.add("(1) Você lavou suas roupas e a de seus familiares sem que sua parceira tenha pedido?)");
		perguntasCasal2.add("(2) Caso você os tenha, deu banho em seus filhos por iniciativa própria, recentemente?");
		perguntasCasal2.add("(3) Nos últimos dias, você tirou o lixo da sua casa sem que alguém antes te pedisse?)");
		perguntasCasal2.add("(4) Em um momento de explosão da sua parceira, você já respondeu às queixas de sobrecarga\n"
				+ "nas tarefas com a frase 'Mas era só pedir'?");

		System.out.println("\nQuiz Casal 2");
		System.out.println("\n\t****Responda às perguntas a seguir com (S) Sim ou (N) Não****\n");

		// Perguntas
		for (int i = 1; i <= perguntasCasal2.size(); i++) {
			System.out.println(perguntasCasal2.get(i - 1) + " (S) Sim ou (N) Não");// Para pegar a posição desejada do ArrayList
			resp = leia.nextLine();
			resp = resp.toUpperCase();

			if (resp.equals("S")) {
				System.out.println("\nMuito bem! Estou começando a gostar de você");
				pts++;
			} else {
				System.out.println("\nMandou bem mal, hein");
			}
		}
		// Pontuações
		System.out.println("\nSua pontuação final foi: " + pts + " pontos");
		if (pts <= 2) {
			System.out.println(
					"\nAchamos que muitos pontos em sua vida/relacionamento podem melhorar. que tal pensar nisso?");
		} else {
			System.out.println("\nGostamos do seu resultado! Continue assim!");
		}
	}
}
