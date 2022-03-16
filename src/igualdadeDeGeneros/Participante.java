package igualdadeDeGeneros;


public class Participante {
	
	
	 private String email;
	 private String nome;
	 private String genero;
	 private boolean filhos;
		 	 
	//Construtores
	public Participante() {	}
	
	public Participante(String email, String nome, String genero, boolean filhos) {
		super();
		this.email = email;
		this.nome = nome;
		this.genero = genero;
		this.filhos = filhos;
	}

	
	
	//Métodos Getters e Setters
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public boolean getFilhos() {
		return filhos;
	}

	public void setFilhos(boolean filhos) {
		this.filhos = filhos;
	}
	
	
		
	}
	


