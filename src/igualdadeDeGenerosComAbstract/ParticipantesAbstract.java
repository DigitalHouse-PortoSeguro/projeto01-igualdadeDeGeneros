package igualdadeDeGenerosComAbstract;

import java.util.ArrayList;

abstract class ParticipantesAbstract {
	
	/*Todos esses Atributos estão com os modificadores de acesso como default, ou seja, serão vistos na mesma classe, qualquer
	classe no mesmo pacote ou qualquer classe filha no mesmo pacote.*/
	 String login;//Nesse caso vamos utilizar o email ou CPF 
	 ArrayList<String> email = new ArrayList<>();
	 ArrayList<String> nome = new ArrayList<String>();
	 ArrayList<Integer> senha = new ArrayList<Integer>();
	 ArrayList<String> genero = new ArrayList<String>();
	 ArrayList<String> filhos = new ArrayList<String>();
		 	 
	//Um Método Especial Construtor vazio --> É considerado uma BOA PRÁTICA
	public ParticipantesAbstract() {	}
	
	//Método Especial Construtor
	public ParticipantesAbstract(String login, ArrayList<String> email, ArrayList<String> nome,
			ArrayList<Integer> senha, ArrayList<String> genero, ArrayList<String> filhos) {
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

	public ArrayList<Integer> getSenha() {
		return senha;
	}

	public void setSenha(ArrayList<Integer> senha) {
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

