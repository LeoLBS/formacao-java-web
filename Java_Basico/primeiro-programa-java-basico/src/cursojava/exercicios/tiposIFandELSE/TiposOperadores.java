package cursojava.exercicios.tiposIFandELSE;

public class TiposOperadores {
	
	private int nota1 = 70;
	private int nota2 = 50;
	private int nota3 = 40;
	private int nota4 = 60;
	private int mediaAluno = (nota1 + nota2 + nota3 + nota4)/4;
	
	public void operadoresIFeELSE() {
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
	
	public void operadoresTernarios() {
		/*Operadores ternarios, podemos utilizar para micro validações*/
	
		String resultadoAluno = mediaAluno >= 60 ? "Aluno aprovado (Ternario)" : (mediaAluno >= 40 && mediaAluno <= 59) ? "Aluno em recuperação (Ternario)" :"Aluno reprovado (Ternario)";
	
		System.out.println(resultadoAluno);
	}
	
	public void operadoresAninhados() {
		/*Operações lógicas aninhadas: São operações dentro de operações*/
	
		if(mediaAluno >= 50) {  // 1º Operação
			if(mediaAluno >= 60) {  // 2º Operação
				System.out.println("Aluno aprovado! (Aninhado)");
			}else {  // 1º Operação
				System.out.println("Aluno em recuperação! (Aninhado)");
			}
		}else {  // 2º Operação
			System.out.println("Aluno reprovado! (Aninhado)");
		}
	}
}
