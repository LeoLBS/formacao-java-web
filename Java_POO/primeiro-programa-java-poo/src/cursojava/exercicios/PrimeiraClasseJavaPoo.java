package cursojava.exercicios;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

/*Aqui temos a nossa classe principal, dentro dela tem a main para executarmos no app*/
public class PrimeiraClasseJavaPoo {
	
	/*Main é um metodo auto executavel em Java*/
	public static void main(String[] args) {
		
		String nomeAluno = JOptionPane.showInputDialog("Qual o nome do aluno: ");
		String idadeAluno = JOptionPane.showInputDialog("Qual a idade do aluno: ");
		String dataNascimentoAluno = JOptionPane.showInputDialog("Qual a data de nascimento do aluno: ");
		String registroGeralAluno = JOptionPane.showInputDialog("Qual o RG do aluno: ");
		String numeroCpfAluno = JOptionPane.showInputDialog("Qual o CPF do aluno: ");
		String nomeMaeAluno = JOptionPane.showInputDialog("Qual o nome da mae do aluno: ");
		String nomePaiAluno = JOptionPane.showInputDialog("Qual o nome do pai do aluno: ");
		String dataMatriculaAluno = JOptionPane.showInputDialog("Qual a data da matricula do aluno: ");
		String serieMatriculadoAluno = JOptionPane.showInputDialog("Qual a serie do aluno: ");
		String nomeEscolaAluno = JOptionPane.showInputDialog("Qual o nome da escola do aluno: ");
		
		String nota1 = JOptionPane.showInputDialog("Qual a nota 1 do aluno: ");
		String nota2 = JOptionPane.showInputDialog("Qual a nota 2 do aluno: ");
		String nota3 = JOptionPane.showInputDialog("Qual a nota 3 do aluno: ");
		String nota4 = JOptionPane.showInputDialog("Qual a nota 4 do aluno: ");
		
		Aluno aluno1 = new Aluno(); // Criando e definindo o objeto na memoria
		
		aluno1.setNomeAluno(nomeAluno); // Utilizando o metodo set para definir o valor da variavel
		aluno1.setIdadeAluno(Integer.valueOf(idadeAluno));
		aluno1.setDataNascimentoAluno(dataNascimentoAluno);
		aluno1.setRegistroGeralAluno(registroGeralAluno);
		aluno1.setNumeroCpfAluno(numeroCpfAluno);
		aluno1.setNomeMaeAluno(nomeMaeAluno);
		aluno1.setNomePaiAluno(nomePaiAluno);
		aluno1.setDataMatriculaAluno(dataMatriculaAluno);
		aluno1.setSerieMatriculadoAluno(serieMatriculadoAluno);
		aluno1.setNomeEscolaAluno(nomeEscolaAluno);
		
		aluno1.setNota1(Double.valueOf(nota1));
		aluno1.setNota2(Double.valueOf(nota2));
		aluno1.setNota3(Double.valueOf(nota3));
		aluno1.setNota4(Double.valueOf(nota4));
		
		
		//Mostrando a descrição do objeto na memoria
		System.out.println(aluno1);
		System.out.println("Media do aluno: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
		/*System.out.println("Nome do aluno é: " + aluno1.getNomeAluno()); // Buscando o valor definido na variavel com o metodo get
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
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));*/
		
	}
}
