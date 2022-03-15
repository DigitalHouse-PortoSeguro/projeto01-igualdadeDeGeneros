package igualdadeDeGeneros;

import java.util.ArrayList;

abstract class Participante {
	
	/*iD vamos utilizar o indice do Array um código para cada Usuário/Participante
	Todos esses Atributos estão com os modificadores de acesso como default, ou seja, serão vistos na mesma classe, qualquer
	classe no mesmo pacote ou qualquer classe filha no mesmo pacote.*/
	 String login;//Nesse caso vamos utilizar o email ou CPF 
	 ArrayList<String> email = new ArrayList<String>();
	 ArrayList<String> nome = new ArrayList<String>();
	 ArrayList<Integer> senha = new ArrayList<Integer>();
	 ArrayList<String> genero = new ArrayList<String>();
	 ArrayList<String> filhos = new ArrayList<String>();
	 ArrayList<Boolean> participanteCadastrado = new ArrayList<Boolean>();//Case o participante seja cadastrado retorna true e o Menu Principal sera acessado,
	 																	  //caso contrario a tela de login e senha ficara em Loop.
	 	 
	//Um Método Especial Construtor vazio --> É considerado uma BOA PRÁTICA
	public Participante() {	}
	
	//Método Especial Construtor
	public Participante(ArrayList<String> email, ArrayList<String> nome, String login,
			ArrayList<Integer> senha, ArrayList<String> genero, ArrayList<String> filhos,
			ArrayList<Boolean> participanteCadastrado) {
		super();
		this.email = email;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.genero = genero;
		this.filhos = filhos;
		this.participanteCadastrado = participanteCadastrado;
	}

	//Métodos Getters e Setters
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
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
	public ArrayList<Boolean> getParticipanteCadastrado() {
		return participanteCadastrado;
	}
	public void setParticipanteCadastrado(ArrayList<Boolean> participanteCadastrado) {
		this.participanteCadastrado = participanteCadastrado;
	}

	
	
	
	//Método para ser implementado na Classe cadastroDosUsuarios
		public abstract void CadastrarParticipantes();

	
	
}

