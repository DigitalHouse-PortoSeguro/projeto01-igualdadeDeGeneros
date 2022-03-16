package igualdadeDeGeneros;


public interface Pergunta {
	public abstract String getEnunciadoPergunta();
	public abstract boolean isPerguntaCorreta();
	public abstract void setResposta(String respostaUsuario);
	
}
