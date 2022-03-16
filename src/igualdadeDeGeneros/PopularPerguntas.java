package igualdadeDeGeneros;

import java.util.ArrayList;
import java.util.List;

public abstract class PopularPerguntas {

	public static List<Pergunta> perguntasMasculino() {

		List<Pergunta> perguntasMasculino = new ArrayList<>();
		PerguntaSimNao pergunta01 = new PerguntaSimNao("(1) Você executa tarefas domésticas(atingindo "
				+ "efetivamente seu objetivo) sem sua parceira pedir? \n(lavar louças, faxina, descongelar "
				+ "alimentos,lavar/secar roupas...)", "S");
		perguntasMasculino.add(pergunta01);

		PerguntaSimNao pergunta02 = new PerguntaSimNao(
				"(2) Você contribui para uma alimentação equilibrada"
						+ " dos membros da sua familia? \n(lista de compras, supermercado,preparo de refeições...)",
				"S");
		perguntasMasculino.add(pergunta02);

		PerguntaSimNao pergunta03 = new PerguntaSimNao("(3) Você se esforça para manter a chama acessa no "
				+ "relacionamento? \n(novas experiencias, diálogo aberto, demonstrações de afeto...)", "S");
		perguntasMasculino.add(pergunta03);

		PerguntaSimNao pergunta04 = new PerguntaSimNao("(4) Você tem proatividade nos cuidados com os membros"
				+ " da família? \n(agendamento médico dos filhos, reuniões escolares, lição de casa, fazer "
				+ "desfazer malas)", "S");
		perguntasMasculino.add(pergunta04);

		return perguntasMasculino;
	}

	public static List<Pergunta> perguntasFeminino() {

		List<Pergunta> perguntasFeminino = new ArrayList<>();
		PerguntaSimNao pergunta01 = new PerguntaSimNao(
				"(1) Você interfere quando seu parceiro está realizando tarefas doméstica de uma forma que você não acha ideal \n(ainda que eficaz)?",
				"S");
		perguntasFeminino.add(pergunta01);

		PerguntaSimNao pergunta02 = new PerguntaSimNao(
				"(2) Você confia em deixar seu marido sozinho com seus filhos enquanto sai com as amigas?", "S");
		perguntasFeminino.add(pergunta02);

		PerguntaSimNao pergunta03 = new PerguntaSimNao(
				"(3) Você envolve o parceiro na gestão da casa, permitindo que ele se responsabilize por parte desta tarefa \n(gestão financeira do lar, gestão da alimentação da familia, gestão da vida escolar dos filhos...)?",
				"S");
		perguntasFeminino.add(pergunta03);

		return perguntasFeminino;
	}

}
