package igualdadeDeGeneros;


public class appMain {

	public static void main(String[] args) {
		
		Quiz quizMasculino = new Quiz();
		System.out.println("\nQuiz Masculino");
		System.out.println("\n\t****Responda �s perguntas a seguir com (S) Sim ou (N) N�o****\n");
		quizMasculino.mostrarPerguntas(PopularPerguntas.perguntasMasculino());
		
		Quiz quizFeminino = new Quiz();
		System.out.println("\nQuiz Feminino");
		System.out.println("\n\t****Responda �s perguntas a seguir com (S) Sim ou (N) N�o****\n");
		quizFeminino.mostrarPerguntas(PopularPerguntas.perguntasFeminino());

			


		
	}
}


