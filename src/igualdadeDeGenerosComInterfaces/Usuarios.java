package igualdadeDeGenerosComInterfaces;

import java.util.Scanner;

public class Usuarios extends BaseCadastroDosUsuarios implements InterfacesParticipantes {

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
		
		email.add("joaodasilva@gmail.com");//J� cadastrado
		email.add("carlarodrigues@gmail.com");//J� cadastrado
		senha.add(1111);//J� cadastrado
		senha.add(2222);//J� cadastrado
		nome.add("joao da silva");//J� cadastrado
		nome.add("carla rodrigues");//J� cadastrado
		genero.add("masculino");//J� cadastrado
		genero.add("feminino");//J� cadastrado
		filhos.add("s");//J� cadastrado
		filhos.add("n");//J� cadastrado		
		
		System.out.println("\n Ol� Bora testar como est� dividida a carga mental na sua casa?");
		System.out.println("\nFa�a o seu login");
			
		System.out.println("Login: ");//Digitar login(email)
		login = ler.nextLine();
		login = login.toLowerCase();
				
		System.out.println("Senha: ");//Digitar senha
		int verfSenha = ler.nextInt();
			
		if(super.email.contains(login)!=true || super.senha.contains(verfSenha)!=true)
		{
			ler.nextLine();//limpar cache
			System.out.println("\n\tVoc� ainda n�o possui cadastro!\nPara efetuar o seu cadastro prencha os dados abaixo:\n");
			
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
					System.out.println("Voc� tem filho(s): (S) Sim ou (N) N�o ");
					String entFilhos = ler.nextLine();
					super.filhos.add(entFilhos);
				}
			}
			
			System.out.println("\nCadastro realizado com sucesso!\n  Seja bem vindo ao Seu Quiz!");
			
		}
	
	}
	
}
