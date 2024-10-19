package cursojava.exercicios;

import cursojava.classes.Aluno;

/*Aqui temos a nossa classe principal, dentro dela tem a main para executarmos no app*/
public class PrimeiraClasseJavaPoo {
	
	/*Main é um metodo auto executavel em Java*/
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno(); // Criando e definindo o objeto na memoria
		
		Aluno aluno2 = new Aluno();
		
		Aluno aluno3 = new Aluno();
		
		Aluno aluno4 = new Aluno("Leonardo"); // Criando um objeto com parametro ja definido do construtor
		
		Aluno aluno5 = new Aluno("João", 16); 
	}
}
