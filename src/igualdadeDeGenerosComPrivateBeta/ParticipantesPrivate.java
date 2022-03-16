package igualdadeDeGenerosComPrivateBeta;

import java.util.ArrayList;
import java.util.Scanner;

public class ParticipantesPrivate {

	private String login;// Nesse caso vamos utilizar o email ou CPF
	private ArrayList<String> email = new ArrayList<>();
	private ArrayList<String> nome = new ArrayList<String>();
	private ArrayList<Integer> senha = new ArrayList<Integer>();
	private ArrayList<String> genero = new ArrayList<String>();
	private ArrayList<String> filhos = new ArrayList<String>();

	// Um M�todo Especial Construtor vazio --> � considerado uma BOA PR�TICA
	public ParticipantesPrivate() {
	}

	// M�todo Especial Construtor
	public ParticipantesPrivate(String login, ArrayList<String> email, ArrayList<String> nome, ArrayList<Integer> senha,
			ArrayList<String> genero, ArrayList<String> filhos) {
		super();
		this.login = login;
		this.email = email;
		this.nome = nome;
		this.senha = senha;
		this.genero = genero;
		this.filhos = filhos;
	}

	// M�todos Getters e Setters
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

	// M�todo para cadastrar os usuarios
	public void CadastrarParticipantes() {
		/*
		 * M�todo add � Adiciona um elemento no final do ArrayList. M�todo clear �
		 * Remove todos os elementos da estrutura. --> M�todo contains � Verifica se o
		 * ArrayList cont�m um elemento especificado, e retorna true em caso positivo,
		 * ou false caso contr�rio. M�todo get � Retorna o item em uma posi��o de �ndice
		 * especificada. M�todo indexOf � Retorna a posi��o de �ndice da primeira
		 * ocorr�ncia de um elemento especificado. M�todo remove � Remove a primeira
		 * ocorr�ncia de um valor especificado ou de um elemento em um �ndice. M�todo
		 * size � Informa o n�mero de elementos que est�o armazenados na estrutura.
		 * M�todo trimToSize � Ajusta a capacidade do ArrayList de acordo com o n�mero
		 * de elementos armazenados no momento.
		 */
		Scanner ler = new Scanner(System.in);

		email.add("joaovictor@gmail.com");// J� cadastrado
		email.add("carlarodrigues@gmail.com");// J� cadastrado
		senha.add(1111);// J� cadastrado
		senha.add(2222);// J� cadastrado
		nome.add("joao da silva");// J� cadastrado
		nome.add("carla rodrigues");// J� cadastrado
		genero.add("masculino");// J� cadastrado
		genero.add("feminino");// J� cadastrado
		filhos.add("s");// J� cadastrado
		filhos.add("n");// J� cadastrado

		System.out.println("\n 		Ol� Bora testar como est� dividida a carga mental na sua casa?");
		System.out.println("\n      Carga mental � todo o trabalho de planejamento, organiza��o e tomada de decis�es que permite\n"
							+ "uma gest�o  eficiente  da casa, � assumido principalmente  pelas mulheres. Um trabalho  geralmente,\n"
							+ "n�o reconhecido, e  que refor�a os  pap�is de g�nero,  contribuindo para a manuten��o das mulheres\n"
							+ "em uma situa��o de marginaliza��o com rela��o a oportunidade de trabalho, independ�ncia financeira,\n"
							+ "possibilidade de atividades de lazer entre outros.");
		System.out.println("\nFa�a o seu login");

		System.out.println("Login: ");// Digitar login(email)
		login = ler.nextLine();
		login = login.toLowerCase();

		System.out.println("Senha: ");// Digitar senha
		int verfSenha = ler.nextInt();

		if (email.contains(login) != true || senha.contains(verfSenha) != true) {
			ler.nextLine();
			System.out.println(
					"\n\tVoc� ainda n�o possui cadastro!\nPara efetuar o seu cadastro prencha os dados abaixo:\n");

			for (int i = 0; i <= 4; i++) {
				if (i == 0) {
					// add emails no ArraList
					System.out.println("Digite o seu email: ");
					String entEmails = ler.nextLine();
					entEmails = entEmails.toLowerCase();
					email.add(entEmails);
				} else if (i == 1) {
					// add senhas no ArraList
					System.out.println("Digite a sua senha: ");
					int entSenhas = ler.nextInt();
					senha.add(entSenhas);
				} else if (i == 2) {
					System.out.println("Digite o seu nome: ");
					String entNomes = ler.nextLine();
					entNomes = entNomes.toLowerCase();
					nome.add(entNomes);
					ler.next();
				} else if (i == 3) {
					//ler.nextInt();
					System.out.println("Qual o seu genero (M) Masculino (F) Feminino (O) Outros");
					String entGeneros = ler.nextLine();
					entGeneros = entGeneros.toLowerCase();
					genero.add(entGeneros);
					ler.next();
				} else if (i == 4) {
					ler.nextLine();
					System.out.println("Voc� tem filho(s): (S) Sim ou (N) N�o ");
					String entFilhos = ler.nextLine();
					filhos.add(entFilhos);
				}
			}

			System.out.println("\nCadastro realizado com sucesso!\n  Seja bem vindo ao Seu Quiz!");

		}
	}
}
