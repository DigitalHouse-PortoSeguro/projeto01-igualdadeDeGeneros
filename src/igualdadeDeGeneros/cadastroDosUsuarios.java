package igualdadeDeGeneros;

import java.util.ArrayList;
import java.util.Scanner;

public class cadastroDosUsuarios extends Participante {

/*  M�todo add � Adiciona um elemento no final do ArrayList.
	M�todo clear � Remove todos os elementos da estrutura.
-->	M�todo contains � Verifica se o ArrayList cont�m um elemento especificado, e retorna true em caso positivo, ou false caso contr�rio.
	M�todo get � Retorna o item em uma posi��o de �ndice especificada.
	M�todo indexOf � Retorna a posi��o de �ndice da primeira ocorr�ncia de um elemento especificado.
	M�todo remove � Remove a primeira ocorr�ncia de um valor especificado ou de um elemento em um �ndice.
	M�todo size � Informa o n�mero de elementos que est�o armazenados na estrutura.
	M�todo trimToSize � Ajusta a capacidade do ArrayList de acordo com o n�mero de elementos armazenados no momento.
 */
	
	@Override
	public void CadastrarParticipantes() {
						
		Scanner ler = new Scanner(System.in);
				
		appMain aa = new appMain();
		
		int i,iD;
		
		System.out.println("\n Ol� Bora testar como est� dividida a carga mental na sua casa?");
		System.out.println("\nFa�a o seu login");
		
		
		do
		{
			System.out.println("Login: ");
			login = ler.nextLine();
			login = login.toLowerCase();
			email.contains(login);//Verifica se o ArrayList cont�m um elemento especificado, e retorna true em caso positivo, ou false caso contr�rio.
			iD = email.indexOf(login);//Retorna a posi��o de �ndice da primeira ocorr�ncia de um elemento especificado.
			
			System.out.println("Senha: ");
			String verfSenha = ler.nextLine();
			senha.contains(verfSenha);//Verifica se o ArrayList cont�m um elemento especificado, e retorna true em caso positivo, ou false caso contr�rio.
			iD = senha.indexOf(verfSenha);//Retorna a posi��o de �ndice da primeira ocorr�ncia de um elemento especificado.
			
			//for(i=1;i<email.size();i++)
			//{
			if(email.contains(login)!=false && senha.contains(verfSenha)!=false)
				{
				//ler.nextLine();
				System.out.println("\n\tVoc� ainda n�o possui cadastro!\nPara efetuar o seu cadastro prencha os dados abaixo:\n");
				//add emails no ArraList
				email.add("joaodasilva@gmail.com");//J� cadastrado
				email.add("carlarodrigues@gmail.com");//J� cadastrado
				System.out.println("Digite o seu email: ");
				String entEmail = ler.nextLine();
				entEmail = entEmail.toLowerCase();
				email.add(entEmail);
				
				//add senhas no ArraList
				senha.add(111111);//J� cadastrado
				senha.add(222222);//J� cadastrado
				System.out.println("Digite a sua senha: ");
				int entSenha = ler.nextInt();
				senha.add(entSenha);
				
				//add nomes no ArraList
				nome.add("joao da silva");//J� cadastrado
				nome.add("carla rodrigues");//J� cadastrado
				System.out.println("Digite o seu nome: ");
				String entNome = ler.nextLine();
				entNome = entNome.toLowerCase();
				nome.add(entNome);
						
				//add genero no ArraList
				genero.add("masculino");//J� cadastrado
				genero.add("feminino");//J� cadastrado
				System.out.println("Digite o seu genero (M) Masculino (F) Feminino (O) Outros");
				String entGenero = ler.nextLine();
				entGenero = entGenero.toLowerCase();
				genero.add(entGenero);
				
				//add filhos no ArraList
				filhos.add("s");//J� cadastrado
				filhos.add("n");//J� cadastrado
				System.out.println("Voc� tem filho(s): (S) Sim ou (N) N�o ");
				String entFilhos = ler.nextLine();
				filhos.add(entFilhos);
				
				//add participantes cadastrados no ArraList
				participanteCadastrado.add(true);//J� cadastrado
				participanteCadastrado.add(true);//J� cadastrado
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
		System.out.println("\n Siga os passos abaixo para se cadastrar:\nQual o seu g�nero? (M) Masculino ou (F) Feminino");
		genero = "m";//leia.nextLine();
		genero = genero.toUpperCase();
		
				
		System.out.println("\n Tem filho(s)? (S) Sim ou (N) N�o");
		filhos = "s";//leia.nextLine();
		filhos = filhos.toUpperCase();
		
		System.out.println("\n Vai jogar em dupla? (S) Sim ou (N) N�o");
		numeroParticipantes= "s";//leia.nextLine();
		numeroParticipantes = numeroParticipantes.toUpperCase();
		*/
	}
}
		



	