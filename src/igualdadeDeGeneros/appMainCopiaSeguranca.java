package igualdadeDeGeneros;

import java.util.Scanner;

public class appMainCopiaSeguranca {

	public static void main(String[] args) {
		
		Participante part = new Participante();
		PopularPerguntas pp = new PopularPerguntas();
				
		Scanner ler = new Scanner(System.in);
		
		part.CadastraParticipante();//Chamando M�todo CadastraParticipante
		
		if(part.participanteCadastrado==true)/* Se participanteCadastrado==true linha 11 da Classe Participante, ou seja 
												se o participante ja for cadastrado ele vai para o Menu Principal, mas
												 se for false ele tem que fazer o cadastro para conseguir jogar.*/
		{
		
		int op=100;
				
		do
		{
			switch(op)
			{
			case 100://Menu Principal
			{
				System.out.println("\nEscolha uma das op��es:"
						        // +"\n(100) Menu Principal"
								   +"\n(1) Quiz Masculino"
								   +"\n(2) Quiz Feminino"
								   +"\n(3) Quiz Casal 1"
								   +"\n(4) Quiz Casal 2"
								   +"\n(0) Sair");
				op = ler.nextInt();
				break;
			}
			case 1://Quiz Masculino
			{
				ler.nextLine();
				pp.perguntasMasculino1();
				op=100;		   
				break;
			}
			case 2: //Quiz Feminino
			{
				ler.nextLine();
				pp.perguntasFeminino1();
				op=100;
				break;
			}
			case 3: //Quiz Casal 1
			{
				ler.nextLine();
				pp.perguntasCasal1();
				op=100;
				break;
			}
			case 4://QuizTeste Casal 2
			{
				ler.nextLine();
				pp.perguntasCasal2();
				op=100;
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
		
		System.out.println("\n Obrigado por se tornar uma pessoa cada vez melhor! Cotinue sempre assim!");
		}
	}
}
