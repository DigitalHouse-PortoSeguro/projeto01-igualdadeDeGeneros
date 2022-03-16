package igualdadeDeGeneros;

import java.util.ArrayList;
import java.util.List;

public class PerguntaAlternativa implements Pergunta {

	private String enunciadoPergunta;
	private List<String> alternativas = new ArrayList<String>();
	private String resposta;
	private String respostaCerta;
	
	//Construtor
	public PerguntaAlternativa(String enunciadoPergunta, String respostaCerta) {
		super();
		this.enunciadoPergunta = enunciadoPergunta;
		this.respostaCerta = respostaCerta;
	}
	
	@Override
	public String getEnunciadoPergunta() {
		String alternativasEnunciado = "";
		for (String alternativa : alternativas) {
			alternativasEnunciado += alternativa + "\n";
		}
		return enunciadoPergunta 
				+ "\n" 
				+ alternativasEnunciado;
	}
	@Override
	public boolean isPerguntaCorreta() {
		
		return resposta.equals(respostaCerta);
	}
	
	public List<String> getAlternativas() {
		return alternativas;
	}

	public String getResposta() {
		return resposta;
	}
	public String getRespostaCerta() {
		return respostaCerta;
	}

	@Override
	public void setResposta(String resposta) {
		this.resposta = resposta; //resposta do usuário
	}


	public void setRespostaCerta(String repostaCerta) {
		this.respostaCerta = repostaCerta;
	}

	public void setEnunciadoPergunta(String enunciadoPergunta) {
		this.enunciadoPergunta = enunciadoPergunta;
	}

	
	

}

