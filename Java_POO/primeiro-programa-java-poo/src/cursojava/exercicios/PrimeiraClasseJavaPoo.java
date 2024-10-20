package cursojava.exercicios;

import cursojava.classes.Aluno;

/*Aqui temos a nossa classe principal, dentro dela tem a main para executarmos no app*/
public class PrimeiraClasseJavaPoo {
	
	/*Main é um metodo auto executavel em Java*/
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno(); // Criando e definindo o objeto na memoria
		
		aluno1.nomeAluno = "Pedro"; // Chamando e atribuindo um valor a uma variavel do tipo public da classe Aluno
		aluno1.idadeAluno = 20;  // Tentando chamar e atribuir um valor na variavel do tipo private da classe Aluno
		
		System.out.println("Nome do aluno é: " + aluno1.nomeAluno); // Mostrando o valor na variavel nomeAluno
		System.out.println("Idade do aluno é: " + aluno1.idadeAluno); // Tentando mostrar o valor da variavel idadeAluno
		
		Aluno aluno2 = new Aluno();
		
		Aluno aluno3 = new Aluno();
		
		Aluno aluno4 = new Aluno("Leonardo"); // Criando um objeto com parametro ja definido do construtor
		
		Aluno aluno5 = new Aluno("João", 16); 
	}
}
