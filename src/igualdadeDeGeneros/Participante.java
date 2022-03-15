package igualdadeDeGeneros;

import java.util.ArrayList;

abstract class Participante {
	
	/*Todos esses Atributos estão com os modificadores de acesso como default, ou seja, serão vistos na mesma classe, qualquer
	classe no mesmo pacote ou qualquer classe filha no mesmo pacote.*/
	 String login;//Nesse caso vamos utilizar o email ou CPF 
	 ArrayList<String> email = new ArrayList<String>();
	 ArrayList<String> nome = new ArrayList<String>();
	 ArrayList<String> senha = new ArrayList<String>();
	 ArrayList<String> genero = new ArrayList<String>();
	 ArrayList<String> filhos = new ArrayList<String>();
		 	 
	//Um Método Especial Construtor vazio --> É considerado uma BOA PRÁTICA
	public Participante() {	}
	
	//Método Especial Construtor
	public Participante(String login, ArrayList<String> email, ArrayList<String> nome, ArrayList<String> senha,
			ArrayList<String> genero, ArrayList<String> filhos) {
		super();
		this.login = login;
		this.email = email;
		this.nome = nome;
		this.senha = senha;
		this.genero = genero;
		this.filhos = filhos;
	}
	
	//Métodos Getters e Setters
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public ArrayList<String> getEmail() {
		return email;
	}

	public void setEmail(ArrayList<String> email) {
		this.email = email;
	}

	public ArrayList<String> getNome() {
		return nome;
	}

	public void setNome(ArrayList<String> nome) {
		this.nome = nome;
	}

	public ArrayList<String> getSenha() {
		return senha;
	}

	public void setSenha(ArrayList<String> senha) {
		this.senha = senha;
	}

	public ArrayList<String> getGenero() {
		return genero;
	}

	public void setGenero(ArrayList<String> genero) {
		this.genero = genero;
	}

	public ArrayList<String> getFilhos() {
		return filhos;
	}

	public void setFilhos(ArrayList<String> filhos) {
		this.filhos = filhos;
	}
	
	//Método para ser implementado na Classe cadastroDosUsuarios
		public abstract void CadastrarParticipantes();
}

