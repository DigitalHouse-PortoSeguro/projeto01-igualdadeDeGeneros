package igualdadeDeGeneros;

import java.util.ArrayList;
import java.util.Scanner;

public class cadastroDosUsuarios extends Participante {

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
				
		appMain aa = new appMain();
		
		int i,iD;
		
		System.out.println("\n OlÁ Bora testar como está dividida a carga mental na sua casa?");
		System.out.println("\nFaça o seu login");
		
		
		do
		{
			System.out.println("Login: ");
			login = ler.nextLine();
			login = login.toLowerCase();
			email.contains(login);//Verifica se o ArrayList contém um elemento especificado, e retorna true em caso positivo, ou false caso contrário.
			iD = email.indexOf(login);//Retorna a posição de índice da primeira ocorrência de um elemento especificado.
			
			System.out.println("Senha: ");
			String verfSenha = ler.nextLine();
			senha.contains(verfSenha);//Verifica se o ArrayList contém um elemento especificado, e retorna true em caso positivo, ou false caso contrário.
			iD = senha.indexOf(verfSenha);//Retorna a posição de índice da primeira ocorrência de um elemento especificado.
			
			//for(i=1;i<email.size();i++)
			//{
			if(email.contains(login)!=false && senha.contains(verfSenha)!=false)
				{
				//ler.nextLine();
				System.out.println("\n\tVocê ainda não possui cadastro!\nPara efetuar o seu cadastro prencha os dados abaixo:\n");
				//add emails no ArraList
				email.add("joaodasilva@gmail.com");//Já cadastrado
				email.add("carlarodrigues@gmail.com");//Já cadastrado
				System.out.println("Digite o seu email: ");
				String entEmail = ler.nextLine();
				entEmail = entEmail.toLowerCase();
				email.add(entEmail);
				
				//add senhas no ArraList
				senha.add(111111);//Já cadastrado
				senha.add(222222);//Já cadastrado
				System.out.println("Digite a sua senha: ");
				int entSenha = ler.nextInt();
				senha.add(entSenha);
				
				//add nomes no ArraList
				nome.add("joao da silva");//Já cadastrado
				nome.add("carla rodrigues");//Já cadastrado
				System.out.println("Digite o seu nome: ");
				String entNome = ler.nextLine();
				entNome = entNome.toLowerCase();
				nome.add(entNome);
						
				//add genero no ArraList
				genero.add("masculino");//Já cadastrado
				genero.add("feminino");//Já cadastrado
				System.out.println("Digite o seu genero (M) Masculino (F) Feminino (O) Outros");
				String entGenero = ler.nextLine();
				entGenero = entGenero.toLowerCase();
				genero.add(entGenero);
				
				//add filhos no ArraList
				filhos.add("s");//Já cadastrado
				filhos.add("n");//Já cadastrado
				System.out.println("Você tem filho(s): (S) Sim ou (N) Não ");
				String entFilhos = ler.nextLine();
				filhos.add(entFilhos);
				
				//add participantes cadastrados no ArraList
				participanteCadastrado.add(true);//Já cadastrado
				participanteCadastrado.add(true);//Já cadastrado
				participanteCadastrado.add(true);
				
				}
			else
			{
				break;
			}
			
		//	}
			
		}
		while(participanteCadastrado.get(0)!=true);
		
		/*
		System.out.println("\n Siga os passos abaixo para se cadastrar:\nQual o seu gênero? (M) Masculino ou (F) Feminino");
		genero = "m";//leia.nextLine();
		genero = genero.toUpperCase();
		
				
		System.out.println("\n Tem filho(s)? (S) Sim ou (N) Não");
		filhos = "s";//leia.nextLine();
		filhos = filhos.toUpperCase();
		
		System.out.println("\n Vai jogar em dupla? (S) Sim ou (N) Não");
		numeroParticipantes= "s";//leia.nextLine();
		numeroParticipantes = numeroParticipantes.toUpperCase();
		*/
	}
}
		



	