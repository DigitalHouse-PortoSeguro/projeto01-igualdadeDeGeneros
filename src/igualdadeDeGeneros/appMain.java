package igualdadeDeGeneros;

import java.util.Scanner;

public class appMain {

	public static void main(String[] args) {
		
		//Participante();
		//PopulaPerguntas();
		//Quiz
		//Resultado

		Participante part = new Participante();
		PopulaPerguntas pp = new PopulaPerguntas();
				
		Scanner ler = new Scanner(System.in);
		
		Participante.CadastraParticipante();//Chamando Método CadastraParticipante
		
		if(part.participanteCadastrado==true)/* Se participanteCadastrado==true linha 11 da Classe Participante, ou seja 
												se o participante ja for cadastrado ele vai para o Menu Principal, mas
												 se for false ele tem que fazer o cadastro, para conseguir jogar.*/
		{
		
		int op=100;
				
		do
		{
			switch(op)
			{
			case 100://Menu Principal
			{
				System.out.println("\nEscolha uma das opções:"
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
				op=pp.perguntasMasculino1(op);/*Quando o Método perguntasMasculino1 for finalizado, o mesmo retornara 100 *return 100* 
												   linha 128 da PopulaPerguntas. Que será atribuido a variavel op da Classe appMain... 
												   e quando 'op = 100' o mesmo direciona para o Menu Principal.*/
				break;
			}
			case 2: //Quiz Feminino
			{
				ler.nextLine();
				op=pp.perguntasFeminino1(op);/*Quando o Método perguntasFeminino1 for finalizado, o mesmo retornara 100 *return 100* 
											   linha 205 da PopulaPerguntas. Que será atribuido a variavel op da Classe appMain... 
											   e quando 'op = 100' o mesmo direciona para o Menu Principal.*/
				break;
			}
			case 3: //Quiz Casal 1
			{
				ler.nextLine();
				op=pp.perguntasCasal1(op);/*Quando o Método perguntasFeminino1 for finalizado, o mesmo retornara 100 *return 100* 
										   linha 346 da PopulaPerguntas. Que será atribuido a variavel op da Classe appMain... 
										   e quando 'op = 100' o mesmo direciona para o Menu Principal.*/
				break;
			}
			case 4://QuizTeste Casal 2
			{
				ler.nextLine();
				op=pp.perguntasCasal2(op);/*Quando o Método perguntasFeminino1 for finalizado, o mesmo retornara 100 *return 100* 
										   linha 453 da PopulaPerguntas. Que será atribuido a variavel op da Classe appMain... 
										   e quando 'op = 100' o mesmo direciona para o Menu Principal.*/
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


