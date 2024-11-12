package cursojava.exercicios;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

/*Aqui temos a nossa classe principal, dentro dela tem a main para executarmos no app*/
public class PrimeiraClasseJavaPoo {

	/* Main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();
		
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();

		for (int quant = 1; quant <= 5; quant++) {

			String nomeAluno = JOptionPane.showInputDialog("Qual o nome do aluno " + quant + ": ");
			/*String idadeAluno = JOptionPane.showInputDialog("Qual a idade do aluno: ");
			String dataNascimentoAluno = JOptionPane.showInputDialog("Qual a data de nascimento do aluno: ");
			String registroGeralAluno = JOptionPane.showInputDialog("Qual o RG do aluno: ");
			String numeroCpfAluno = JOptionPane.showInputDialog("Qual o CPF do aluno: ");
			String nomeMaeAluno = JOptionPane.showInputDialog("Qual o nome da mae do aluno: ");
			String nomePaiAluno = JOptionPane.showInputDialog("Qual o nome do pai do aluno: ");
			String dataMatriculaAluno = JOptionPane.showInputDialog("Qual a data da matricula do aluno: ");
			String serieMatriculadoAluno = JOptionPane.showInputDialog("Qual a serie do aluno: ");
			String nomeEscolaAluno = JOptionPane.showInputDialog("Qual o nome da escola do aluno: ");*/
			 
			Aluno aluno1 = new Aluno(); // Criando e definindo o objeto na memoria

			aluno1.setNomeAluno(nomeAluno); // Utilizando o metodo set para definir o valor da variavel
			/*aluno1.setIdadeAluno(Integer.valueOf(idadeAluno));
			aluno1.setDataNascimentoAluno(dataNascimentoAluno);
			aluno1.setRegistroGeralAluno(registroGeralAluno);
			aluno1.setNumeroCpfAluno(numeroCpfAluno);
			aluno1.setNomeMaeAluno(nomeMaeAluno);
			aluno1.setNomePaiAluno(nomePaiAluno);
			aluno1.setDataMatriculaAluno(dataMatriculaAluno);
			aluno1.setSerieMatriculadoAluno(serieMatriculadoAluno);
			aluno1.setNomeEscolaAluno(nomeEscolaAluno);*/

			for (int posicao = 1; posicao <= 1; posicao++) {

				String nomeDisciplina = JOptionPane.showInputDialog("Qual o nome da Disciplina " + posicao + "?");
				String notaDisciplina = JOptionPane.showInputDialog("Qual a nota da Disciplina " + posicao + "?");

				Disciplina disciplina = new Disciplina();

				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolhaUsuario = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

			if (escolhaUsuario == 0) {

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane
							.showInputDialog("Qual disciplina você deseja remover, 1, 2, 3 ou 4?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover alguma disciplina?");
				}
			}

			alunos.add(aluno1);
		}
		
		for (Aluno aluno : alunos) {
			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)){
				alunosAprovados.add(aluno);
			}else 
			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				alunosRecuperacao.add(aluno);
			}else {
				alunosReprovados.add(aluno);
			}
		}
		
		System.out.println("-----------------------Alunos Aprovados------------------");
		for (Aluno aluno : alunosAprovados) {
			System.out.println("Aluno: "+ aluno.getNomeAluno() +", resultado: " + aluno.getAlunoAprovado2() + ", com media: " + aluno.getMediaNota());
		}
		
		System.out.println("-----------------------Alunos Recuperacao------------------");
		for (Aluno aluno : alunosRecuperacao) {
			System.out.println("Aluno: "+ aluno.getNomeAluno() +", resultado: " + aluno.getAlunoAprovado2() + ", com media: " + aluno.getMediaNota());
		}
		
		System.out.println("-----------------------Alunos Reprovados------------------");
		for (Aluno aluno : alunosReprovados) {
			System.out.println("Aluno: "+ aluno.getNomeAluno() +", resultado: " + aluno.getAlunoAprovado2() + ", com media: " + aluno.getMediaNota());
		}
		
	}
}
