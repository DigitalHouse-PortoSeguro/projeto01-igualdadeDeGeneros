package igualdadeDeGenerosComPrivateBeta;

import java.util.Scanner;

public class appMain extends ParticipantesPrivate {

	public static void main(String[] args) {

		ParticipantesPrivate participantes = new ParticipantesPrivate();
		PerguntasTdsGrupos pp = new PerguntasTdsGrupos();
		Informativo info = new Informativo();

		Scanner ler = new Scanner(System.in);

		participantes.CadastrarParticipantes();// Chamando M�todo CadastraParticipante

		int op = 100;

		do {
			switch (op) {
			case 100:// Menu Principal
			{
				System.out.println("----------------------------------------------------------------");
				System.out.println("   Para iniciar o seu jogo\nescolha uma das op��es abaixo:\n"
						+ "\n(1) Quiz Masculino" + "\n(2) Quiz Feminino" + "\n(3) Quiz Casal 1" + "\n(4) Quiz Casal 2"
						+ "\n(5) Info: O que � carga mental para o p�blico masculino?"
						+ "\n(6) Info: O que � carga mental para os casados?" + "\n(0) Sair");
				System.out.println("----------------------------------------------------------------");
				op = ler.nextInt();// Ler a op��o digitada pelo usu�rio
				break;
			}
			case 1:// Quiz Masculino
			{
				ler.nextLine();// liapar cache
				pp.perguntasMasculino1();// Chamando M�todo perguntasMasculino1 atrav�s do objeto pp
				op = 100; // op recebe 100 para voltar ao Menu Principal
				break;
			}
			case 2: // Quiz Feminino
			{
				ler.nextLine();// liapar cache
				pp.perguntasFeminino1();// Chamando M�todo perguntasFeminino1 atrav�s do objeto pp
				op = 100;// op recebe 100 para voltar ao Menu Principal
				break;
			}
			case 3: // Quiz Casal 1
			{
				ler.nextLine();// liapar cache
				pp.perguntasCasal1();// Chamando M�todo perguntasCasal1 atrav�s do objeto pp
				op = 100;// op recebe 100 para voltar ao Menu Principal
				break;
			}
			case 4:// QuizTeste Casal 2
			{
				ler.nextLine();// liapar cache
				pp.perguntasCasal2();// Chamando M�todo perguntasCasal2 atrav�s do objeto pp
				op = 100;// op recebe 100 para voltar ao Menu Principal
				break;
			}
			case 5:// Info Masculino
			{
				ler.nextLine();
				info.informativoPublicoMaculino();
				System.out.println("\n\n***Pressione enter para continuar!***");
				ler.nextLine();
				op = 100;// op recebe 100 para voltar ao Menu Principal
				break;
			}
			case 6:// Info Casados
			{
				ler.nextLine();
				info.informativoPublicoCasal();
				System.out.println("\n\n***Pressione enter para continuar!***");
				ler.nextLine();
				op = 100;// op recebe 100 para voltar ao Menu Principal
				break;
			}
			case 0:// Para Sair do Programa
			{
				ler.nextLine();
				break;
			}
			default: {
				System.err.println("\nA op��o digitada � inv�lida, por favor tente novamente!");
				op = 100;
			}
			}

		} while (op != 0);// Se for igual a zero, termina/finaliza o programa

		System.out.println("\n Obrigado por se tornar uma pessoa cada vez melhor! Continue sempre assim!");
	}
}
