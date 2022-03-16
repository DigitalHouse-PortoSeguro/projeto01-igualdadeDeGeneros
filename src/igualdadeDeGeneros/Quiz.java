package igualdadeDeGeneros;

import java.util.List;

public class Quiz {
	
	private Participante participante;
	protected List<String> listaPerguntasAlternativas;
	protected List<String> listaPerguntasSimNao;

	
	public void mostrarPerguntas() {
		for (int i = 0; i < listaPerguntasAlternativas.size(); i++) {
			System.out.println(listaPerguntasAlternativas.get(i));
			
		}
	}


	public Participante getParticipante() {
		return participante;
	}


	public void setParticipante(Participante participante) {
		this.participante = participante;
	}


}
