package igualdadeDeGeneros;


public class PerguntaSimNao implements Pergunta {


	private String enunciadoPergunta;
	private String resposta;
	private String respostaCerta;
	
	//Construtor
	public PerguntaSimNao(String enunciadoPergunta, String respostaCerta) {
		super();
		this.enunciadoPergunta = enunciadoPergunta;
		this.respostaCerta = respostaCerta;
	}
	
	@Override
	public String getEnunciadoPergunta() {
		
		return enunciadoPergunta;
	}
	@Override
	public boolean isPerguntaCorreta() {
		
		return resposta.equals(respostaCerta);
	}
	@Override
	public void setResposta(String resposta) {
		this.resposta = resposta; //reposta usuário
	}

	
	public void setEnunciadoPergunta(String enunciadoPergunta) {
		this.enunciadoPergunta = enunciadoPergunta;
	}
		
	public void setRespostaCerta(String respostaCerta) {
		this.respostaCerta = respostaCerta;
	}


}
