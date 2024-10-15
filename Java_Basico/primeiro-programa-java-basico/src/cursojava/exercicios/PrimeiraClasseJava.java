package cursojava.exercicios;

public class PrimeiraClasseJava {
	public static void main(String[] args) {
		
		int nota1 = 70;
		int nota2 = 50;
		int nota3 = 40;
		int nota4 = 60;
		int mediaAluno = 0;
		
		mediaAluno = (nota1 + nota2 + nota3 + nota4)/4;
		
		/*Condições lógicas com IF e ELSE*/
		if(mediaAluno >= 60) {
			System.out.println("Aluno aprovado!");
		}
		else if(mediaAluno >= 40 && mediaAluno <= 59) {
			System.out.println("Aluno em recuperação!");
		}
		else {
			System.out.println("Aluno reprovado!");
		}
	}
}
