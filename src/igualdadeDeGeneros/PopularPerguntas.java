package igualdadeDeGeneros;

import java.util.ArrayList;
import java.util.List;

public abstract class PopularPerguntas {

	public static List<Pergunta> perguntasMasculino() {

		List<Pergunta> perguntasMasculino = new ArrayList<>();
		PerguntaSimNao pergunta01 = new PerguntaSimNao("(1) Voc� executa tarefas dom�sticas(atingindo "
				+ "efetivamente seu objetivo) sem sua parceira pedir? \n(lavar lou�as, faxina, descongelar "
				+ "alimentos,lavar/secar roupas...)", "S");
		perguntasMasculino.add(pergunta01);

		PerguntaSimNao pergunta02 = new PerguntaSimNao(
				"(2) Voc� contribui para uma alimenta��o equilibrada"
						+ " dos membros da sua familia? \n(lista de compras, supermercado,preparo de refei��es...)",
				"S");
		perguntasMasculino.add(pergunta02);

		PerguntaSimNao pergunta03 = new PerguntaSimNao("(3) Voc� se esfor�a para manter a chama acessa no "
				+ "relacionamento? \n(novas experiencias, di�logo aberto, demonstra��es de afeto...)", "S");
		perguntasMasculino.add(pergunta03);

		PerguntaSimNao pergunta04 = new PerguntaSimNao("(4) Voc� tem proatividade nos cuidados com os membros"
				+ " da fam�lia? \n(agendamento m�dico dos filhos, reuni�es escolares, li��o de casa, fazer "
				+ "desfazer malas)", "S");
		perguntasMasculino.add(pergunta04);

		return perguntasMasculino;
	}

	public static List<Pergunta> perguntasFeminino() {

		List<Pergunta> perguntasFeminino = new ArrayList<>();
		PerguntaSimNao pergunta01 = new PerguntaSimNao(
				"(1) Voc� interfere quando seu parceiro est� realizando tarefas dom�stica de uma forma que voc� n�o acha ideal \n(ainda que eficaz)?",
				"S");
		perguntasFeminino.add(pergunta01);

		PerguntaSimNao pergunta02 = new PerguntaSimNao(
				"(2) Voc� confia em deixar seu marido sozinho com seus filhos enquanto sai com as amigas?", "S");
		perguntasFeminino.add(pergunta02);

		PerguntaSimNao pergunta03 = new PerguntaSimNao(
				"(3) Voc� envolve o parceiro na gest�o da casa, permitindo que ele se responsabilize por parte desta tarefa \n(gest�o financeira do lar, gest�o da alimenta��o da familia, gest�o da vida escolar dos filhos...)?",
				"S");
		perguntasFeminino.add(pergunta03);

		return perguntasFeminino;
	}

}
