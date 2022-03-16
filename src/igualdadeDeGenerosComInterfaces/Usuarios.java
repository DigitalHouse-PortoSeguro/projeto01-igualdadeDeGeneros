package igualdadeDeGenerosComInterfaces;

import java.util.Scanner;

public class Usuarios extends BaseCadastroDosUsuarios implements InterfacesParticipantes {

	/*  Método add – Adiciona um elemento no final do ArrayList.
	Método clear – Remove todos os elementos da estrutura.
-->	Método contains – Verifica se o ArrayList contém um elemento especificado, e retorna true em caso positivo, ou false caso contrário.
	Método get – Retorna o item em uma posição de índice especificada.
	Método indexOf – Retorna a posição de índice da primeira ocorrência de um elemento especificado.
	Método remove – Remove a primeira ocorrência de um valor especificado ou de um elemento em um índice.
	Método size – Informa o número de elementos que estão armazenados na estrutura.
	Método trimToSize – Ajusta a capacidade do ArrayList de acordo com o número de elementos armazenados no momento.
 */
	
	@Override
	public void CadastrarParticipantes() {
						
		Scanner ler = new Scanner(System.in);
		
		email.add("joaodasilva@gmail.com");//Já cadastrado
		email.add("carlarodrigues@gmail.com");//Já cadastrado
		senha.add(1111);//Já cadastrado
		senha.add(2222);//Já cadastrado
		nome.add("joao da silva");//Já cadastrado
		nome.add("carla rodrigues");//Já cadastrado
		genero.add("masculino");//Já cadastrado
		genero.add("feminino");//Já cadastrado
		filhos.add("s");//Já cadastrado
		filhos.add("n");//Já cadastrado		
		
		System.out.println("\n OlÁ Bora testar como está dividida a carga mental na sua casa?");
		System.out.println("\nFaça o seu login");
			
		System.out.println("Login: ");//Digitar login(email)
		login = ler.nextLine();
		login = login.toLowerCase();
				
		System.out.println("Senha: ");//Digitar senha
		int verfSenha = ler.nextInt();
			
		if(super.email.contains(login)!=true || super.senha.contains(verfSenha)!=true)
		{
			ler.nextLine();//limpar cache
			System.out.println("\n\tVocê ainda não possui cadastro!\nPara efetuar o seu cadastro prencha os dados abaixo:\n");
			
			for(int i=0;i<=4;i++)
			{
				if(i==0)
				{
					//add emails no ArrayList
					System.out.println("Digite o seu email: ");
					String entEmails = ler.nextLine();
					entEmails = entEmails.toLowerCase();
					super.email.add(entEmails);
				}
				else if(i==1) 
				{
					//add senhas no ArrayList
					System.out.println("Digite a sua senha: ");
					int entSenhas = ler.nextInt();
					super.senha.add(entSenhas);
				}
				else if(i==2)
				{	
					//add nomes no ArrayList
					ler.nextLine();//limpar cache
					System.out.println("Digite o seu nome: ");
					String entNomes = ler.nextLine();
					entNomes = entNomes.toLowerCase();
					super.nome.add(entNomes);
				}
				else if(i==3)
				{
					//add genero no ArrayList
					System.out.println("Qual o seu genero (M) Masculino (F) Feminino (O) Outros");
					String entGeneros = ler.nextLine();
					entGeneros = entGeneros.toLowerCase();
					super.genero.add(entGeneros);
				}
				else if(i==4)
				{
					//add filhos no ArrayList
					System.out.println("Você tem filho(s): (S) Sim ou (N) Não ");
					String entFilhos = ler.nextLine();
					super.filhos.add(entFilhos);
				}
			}
			
			System.out.println("\nCadastro realizado com sucesso!\n  Seja bem vindo ao Seu Quiz!");
			
		}
	
	}
	
}
