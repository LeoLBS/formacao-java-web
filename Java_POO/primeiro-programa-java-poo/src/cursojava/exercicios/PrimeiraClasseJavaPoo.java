package cursojava.exercicios;

import cursojava.classes.Aluno;

/*Aqui temos a nossa classe principal, dentro dela tem a main para executarmos no app*/
public class PrimeiraClasseJavaPoo {
	
	/*Main é um metodo auto executavel em Java*/
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno(); // Criando e definindo o objeto na memoria
		
		aluno1.setNomeAluno("Pedro"); // Utilizando o metodo set para definir o valor da variavel
		aluno1.setIdadeAluno(18);
		aluno1.setDataNascimentoAluno("20/09/2006");
		aluno1.setRegistroGeralAluno("25364.435333.4657");
		aluno1.setNumeroCpfAluno("723.723.723-99");
		aluno1.setNomeMaeAluno("Maria");
		aluno1.setNomePaiAluno("Carlos");
		aluno1.setDataMatriculaAluno("10/04/2018");
		aluno1.setSerieMatriculadoAluno("3");
		aluno1.setNomeEscolaAluno("Escola de treinamento DEV");
		
		aluno1.setNota1(90);
		aluno1.setNota2(40.5);
		aluno1.setNota3(70);
		aluno1.setNota4(85);
		
		System.out.println("Nome do aluno é: " + aluno1.getNomeAluno()); // Buscando o valor definido na variavel com o metodo get
		System.out.println("Idade do aluno é: " + aluno1.getIdadeAluno());
		System.out.println("Data de nascimento do aluno é: " + aluno1.getDataNascimentoAluno());
		System.out.println("Registro geral do aluno é: " + aluno1.getRegistroGeralAluno());
		System.out.println("CPF do aluno é: " + aluno1.getNumeroCpfAluno());
		System.out.println("Nome da mae do aluno é: " + aluno1.getNomeMaeAluno());
		System.out.println("Nome do pai do aluno é: " + aluno1.getNomePaiAluno());
		System.out.println("Data da matricula do aluno: "+ aluno1.getDataMatriculaAluno());
		System.out.println("Serie do aluno é: " + aluno1.getSerieMatriculadoAluno());
		System.out.println("Escola do alunoe é: " + aluno1.getNomeEscolaAluno());
		
		System.out.println("Média do Aluno: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
		Aluno aluno2 = new Aluno();
		
		Aluno aluno3 = new Aluno();
		
		Aluno aluno4 = new Aluno("Leonardo"); // Criando um objeto com parametro ja definido do construtor
		
		Aluno aluno5 = new Aluno("João", 16); 
	}
}
