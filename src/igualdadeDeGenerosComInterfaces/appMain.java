package igualdadeDeGenerosComInterfaces;

import java.util.Scanner;

public class appMain extends BaseCadastroDosUsuarios implements InterfacesParticipantes{

	public static void main(String[] args) {
				
		Usuarios cadDosUsers = new Usuarios();
		PopularPerguntas pp = new PopularPerguntas();
				
		Scanner ler = new Scanner(System.in);
		
		cadDosUsers.CadastrarParticipantes();//Chamando Método CadastraParticipante
		
		int op=100;
				
		do
		{
			switch(op)
			{
			case 100://Menu Principal
			{	System.out.println("----------------------------------------------------------------");
				System.out.println("   Para iniciar o seu jogo\nescolha uma das opções abaixo:\n"
						           +"\n(1) Quiz Masculino"
								   +"\n(2) Quiz Feminino"
								   +"\n(3) Quiz Casal 1"
								   +"\n(4) Quiz Casal 2"
								   +"\n(0) Sair");
				System.out.println("----------------------------------------------------------------");
				op = ler.nextInt();//Ler a opção digitada pelo usuário
				break;
			}
			case 1://Quiz Masculino
			{
				ler.nextLine();//liapar cache
				pp.perguntasMasculino1();//Chamando Método perguntasMasculino1 através do objeto pp
				op=100;	//op recebe 100 para voltar ao Menu Principal	   
				break;
			}
			case 2: //Quiz Feminino
			{
				ler.nextLine();//liapar cache
				pp.perguntasFeminino1();//Chamando Método perguntasFeminino1 através do objeto pp
				op=100;//op recebe 100 para voltar ao Menu Principal	
				break;
			}
			case 3: //Quiz Casal 1
			{
				ler.nextLine();//liapar cache
				pp.perguntasCasal1();//Chamando Método perguntasCasal1 através do objeto pp
				op=100;//op recebe 100 para voltar ao Menu Principal	
				break;
			}
			case 4://QuizTeste Casal 2
			{
				ler.nextLine();//liapar cache
				pp.perguntasCasal2();//Chamando Método perguntasCasal2 através do objeto pp
				op=100;//op recebe 100 para voltar ao Menu Principal	
				break;
			}
			case 0://Para Sair do Programa
			{
				ler.nextLine();
				break;
			}
				
			}
		}
		while(op!=0);//Se for igual a zero, termina/finaliza o programa
		
		System.out.println("\n Obrigado por se tornar uma pessoa cada vez melhor! Continue sempre assim!");
		}

	@Override
	public void CadastrarParticipantes() {
		System.out.println("Testtando para ver se acontece alguma coisa");
	}
}
