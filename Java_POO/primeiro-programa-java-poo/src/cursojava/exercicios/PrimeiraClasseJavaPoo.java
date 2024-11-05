package cursojava.exercicios;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

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
		
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de dados");
		disciplina1.setNota(80);
		
		
		
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Java");
		disciplina2.setNota(90);
		
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("WEB");
		disciplina3.setNota(85);
		
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Redes");
		disciplina4.setNota(75);
		
		
		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina2);
		aluno1.getDisciplinas().add(disciplina3);
		aluno1.getDisciplinas().add(disciplina4);
		
		//Mostrando a descrição do objeto na memoria
		System.out.println(aluno1);
		System.out.println("Media do aluno: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
	}
}
