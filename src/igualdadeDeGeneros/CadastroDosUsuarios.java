package igualdadeDeGeneros;

import java.util.Scanner;

public class CadastroDosUsuarios extends Participante {
	private String login;
	private String senha;

	// Construtores:
	public CadastroDosUsuarios() {
		super();
	}

	public CadastroDosUsuarios(String senha) {
		this.login = getEmail();
		this.senha = senha;
	}

	public CadastroDosUsuarios(String email, String nome, String senha, String genero, boolean filhos) {
		super(email, nome, genero, filhos);
		this.login = email;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isParticipanteCadastrado() {
		Scanner ler = new Scanner(System.in);
		System.out.println("\nFaça o seu login");

		System.out.println("Login: ");
		String verificaLogin = ler.nextLine();
		verificaLogin = verificaLogin.toLowerCase();

		System.out.println("Senha: ");
		String verificaSenha = ler.nextLine();

		if (getEmail().contains(verificaLogin) && senha.contains(verificaSenha)) {
			return true;
		} else {
			return false;
		}
	}

	public Participante CadastrarParticipante() {

		Scanner ler = new Scanner(System.in);
		Participante novoParticipante = new Participante();

		// @formatter:off
		System.out.println("\n\tVocê ainda não possui cadastro!" 
						+ "\nPara efetuar o seu cadastro prencha os dados abaixo:\n");
		//formatter:on
		System.out.println("Digite o seu email: ");
		String entradaEmail = ler.nextLine();
		entradaEmail = entradaEmail.toLowerCase();
		novoParticipante.setEmail(entradaEmail);

		System.out.println("Digite a sua senha: ");
		String entradaSenha = ler.nextLine();
		setSenha(entradaSenha);

		System.out.println("Digite o seu nome: ");
		String entradaNome = ler.nextLine();
		entradaNome = entradaNome.toLowerCase();
		novoParticipante.setNome(entradaNome);

		System.out.println("Qual o seu genero (M) Masculino (F) Feminino (O) Outros");
		String entradaGenero = ler.nextLine();
		entradaGenero = entradaGenero.toLowerCase();
		novoParticipante.setGenero(entradaGenero);

		System.out.println("Você tem filho(s): (S) Sim ou (N) Não ");
		String entradaFilho = ler.nextLine();
		entradaFilho.toUpperCase();
		if (entradaFilho == "S") {
			novoParticipante.setFilhos(true);
		} else {
			novoParticipante.setFilhos(false);
		}

		System.out.println("\nCadastro realizado com sucesso!\n  Seja bem vindo ao Seu Quiz!");

		return novoParticipante;
	}

}
