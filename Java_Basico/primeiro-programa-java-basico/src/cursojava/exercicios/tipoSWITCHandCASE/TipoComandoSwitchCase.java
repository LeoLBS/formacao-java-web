package cursojava.exercicios.tipoSWITCHandCASE;

public class TipoComandoSwitchCase {
	
	
	public void utilizandoSwitchCase() {
		
		/*Operações utilizando o Switch e Case*/
		
		int nota1 = 70;
		int nota2 = 50;
		int nota3 = 40;
		int nota4 = 60;
		int mediaAluno = (nota1 + nota2 + nota3 + nota4)/4;
		
		int escolha = 1;
		
		switch(escolha) {
		
		case 1:
			System.out.println("Media do Aluno foi: " + mediaAluno + " (Switch e Case)");
			break;
		case 2:
			System.out.println("Nota 1 do Aluno: " + nota1 + " (Switch e Case)");
			break;
		case 3:
			System.out.println("Nota 2 do Aluno: " + nota2 + " (Switch e Case)");
			break;
		case 4:
			System.out.println("Nota 3 do Aluno: " + nota3 + " (Switch e Case)");
			break;
		case 5:
			System.out.println("Nota 4 do Aluno: " + nota4 + " (Switch e Case)");
			break;
		
		default:
			System.out.println("Escolha errada!!! (Switch e Case)");
			break;
		}
	}
}
