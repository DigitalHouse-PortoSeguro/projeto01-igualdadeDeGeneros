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

	// Um Método Especial Construtor vazio --> É considerado uma BOA PRÁTICA
	public ParticipantesPrivate() {
	}

	// Método Especial Construtor
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

	// Métodos Getters e Setters
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

	// Método para cadastrar os usuarios
	public void CadastrarParticipantes() {
		/*
		 * Método add – Adiciona um elemento no final do ArrayList. Método clear –
		 * Remove todos os elementos da estrutura. --> Método contains – Verifica se o
		 * ArrayList contém um elemento especificado, e retorna true em caso positivo,
		 * ou false caso contrário. Método get – Retorna o item em uma posição de índice
		 * especificada. Método indexOf – Retorna a posição de índice da primeira
		 * ocorrência de um elemento especificado. Método remove – Remove a primeira
		 * ocorrência de um valor especificado ou de um elemento em um índice. Método
		 * size – Informa o número de elementos que estão armazenados na estrutura.
		 * Método trimToSize – Ajusta a capacidade do ArrayList de acordo com o número
		 * de elementos armazenados no momento.
		 */
		Scanner ler = new Scanner(System.in);

		email.add("joaovictor@gmail.com");// Já cadastrado
		email.add("carlarodrigues@gmail.com");// Já cadastrado
		senha.add(1111);// Já cadastrado
		senha.add(2222);// Já cadastrado
		nome.add("joao da silva");// Já cadastrado
		nome.add("carla rodrigues");// Já cadastrado
		genero.add("masculino");// Já cadastrado
		genero.add("feminino");// Já cadastrado
		filhos.add("s");// Já cadastrado
		filhos.add("n");// Já cadastrado

		System.out.println("\n 		OlÁ Bora testar como está dividida a carga mental na sua casa?");
		System.out.println("\n      Carga mental é todo o trabalho de planejamento, organização e tomada de decisões que permite\n"
							+ "uma gestão  eficiente  da casa, é assumido principalmente  pelas mulheres. Um trabalho  geralmente,\n"
							+ "não reconhecido, e  que reforça os  papéis de gênero,  contribuindo para a manutenção das mulheres\n"
							+ "em uma situação de marginalização com relação a oportunidade de trabalho, independência financeira,\n"
							+ "possibilidade de atividades de lazer entre outros.");
		System.out.println("\nFaça o seu login");

		System.out.println("Login: ");// Digitar login(email)
		login = ler.nextLine();
		login = login.toLowerCase();

		System.out.println("Senha: ");// Digitar senha
		int verfSenha = ler.nextInt();

		if (email.contains(login) != true || senha.contains(verfSenha) != true) {
			ler.nextLine();
			System.out.println(
					"\n\tVocê ainda não possui cadastro!\nPara efetuar o seu cadastro prencha os dados abaixo:\n");

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
					System.out.println("Você tem filho(s): (S) Sim ou (N) Não ");
					String entFilhos = ler.nextLine();
					filhos.add(entFilhos);
				}
			}

			System.out.println("\nCadastro realizado com sucesso!\n  Seja bem vindo ao Seu Quiz!");

		}
	}
}
