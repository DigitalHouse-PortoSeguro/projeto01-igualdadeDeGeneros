package igualdadeDeGeneros;

import java.util.List;

public class Quiz implements Perguntas, InterfaceParticipante {
	
	protected List<String> listaPerguntasAlternativas;
	protected List<String> listaPerguntasSimNao;

	//@Override
	public void mostrarPerguntas() {
		for (int i = 0; i < listaPerguntasAlternativas.size(); i++) {
			System.out.println(listaPerguntasAlternativas.get(i));
			
		}
	}


}
