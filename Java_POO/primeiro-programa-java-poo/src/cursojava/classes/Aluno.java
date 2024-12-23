package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import cursojava.constantes.StatusAluno;

/*Aqui temos nossa classe Aluno, sendo ela o nosso molde para os objetos*/
public class Aluno {
	
	/*Aqui temos os nossos atributos da nossa classe Aluno*/
	private String nomeAluno;
	private int idadeAluno;
	private String dataNascimentoAluno;
	private String registroGeralAluno;
	private String numeroCpfAluno;
	private String nomeMaeAluno;
	private String nomePaiAluno;
	private String dataMatriculaAluno;
	private String nomeEscolaAluno;
	private String serieMatriculadoAluno;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	
	public Aluno() { // Criando um construtor dentro da classe Aluno
		// Esse tipo de construtor é padrão do Java, sem nenhum parametro
	}
	
	public Aluno(String nomeAluno) { // Criando um construtor com parametro ja definido
		this.nomeAluno = nomeAluno;
	}
	
	public Aluno(String nomeAluno, int idadeAluno) {
		this.nomeAluno = nomeAluno;
		this.idadeAluno = idadeAluno;
	}
	
	/* Aqui vamos utilizar os GETTERS e SETTERS para os atributos privados da classe Aluno*/
	
	/* O GET serve para obter o valor que esta no atributo da classe*/
	public String getNomeAluno() {
		return nomeAluno; // Retornando o valor da variavel nomeAluno
	}
	
	/* O SET serve para atribuir/modificar um valor no atributo da classe*/
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno; // Utilizando o this para referenciar a variavel do objeto
	}

	public int getIdadeAluno() {
		return idadeAluno;
	}

	public void setIdadeAluno(int idadeAluno) {
		this.idadeAluno = idadeAluno;
	}

	public String getDataNascimentoAluno() {
		return dataNascimentoAluno;
	}

	public void setDataNascimentoAluno(String dataNascimentoAluno) {
		this.dataNascimentoAluno = dataNascimentoAluno;
	}

	public String getRegistroGeralAluno() {
		return registroGeralAluno;
	}

	public void setRegistroGeralAluno(String registroGeralAluno) {
		this.registroGeralAluno = registroGeralAluno;
	}

	public String getNumeroCpfAluno() {
		return numeroCpfAluno;
	}

	public void setNumeroCpfAluno(String numeroCpfAluno) {
		this.numeroCpfAluno = numeroCpfAluno;
	}

	public String getNomeMaeAluno() {
		return nomeMaeAluno;
	}

	public void setNomeMaeAluno(String nomeMaeAluno) {
		this.nomeMaeAluno = nomeMaeAluno;
	}

	public String getNomePaiAluno() {
		return nomePaiAluno;
	}

	public void setNomePaiAluno(String nomePaiAluno) {
		this.nomePaiAluno = nomePaiAluno;
	}

	public String getDataMatriculaAluno() {
		return dataMatriculaAluno;
	}

	public void setDataMatriculaAluno(String dataMatriculaAluno) {
		this.dataMatriculaAluno = dataMatriculaAluno;
	}

	public String getNomeEscolaAluno() {
		return nomeEscolaAluno;
	}

	public void setNomeEscolaAluno(String nomeEscolaAluno) {
		this.nomeEscolaAluno = nomeEscolaAluno;
	}

	public String getSerieMatriculadoAluno() {
		return serieMatriculadoAluno;
	}

	public void setSerieMatriculadoAluno(String serieMatriculadoAluno) {
		this.serieMatriculadoAluno = serieMatriculadoAluno;
	}
	
	//Metodo para calcular e retornar a media do aluno
	public double getMediaNota() {
		
		double somaNotas = 0.0;
		double mediaNotas = 0.0;
		
		for(Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		
		mediaNotas = somaNotas / disciplinas.size();
		
		return mediaNotas;
	}
	
	//Verificando seo Aluno esta aprovado ou não
	public boolean getAlunoAprovado() {
		
		double media = this.getMediaNota();
		
		if(media >= 70) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getAlunoAprovado2() {
		
		double media = this.getMediaNota();
		
		if(media >= 50) {
			if(media >= 70) {
				return StatusAluno.APROVADO;
			}else {
				return StatusAluno.RECUPERACAO;
			}
		}
		else {
			return StatusAluno.REPROVADO;
		}
	}


	@Override
	public String toString() {
		return "Aluno [nomeAluno=" + nomeAluno + ", idadeAluno=" + idadeAluno + ", dataNascimentoAluno="
				+ dataNascimentoAluno + ", registroGeralAluno=" + registroGeralAluno + ", numeroCpfAluno="
				+ numeroCpfAluno + ", nomeMaeAluno=" + nomeMaeAluno + ", nomePaiAluno=" + nomePaiAluno
				+ ", dataMatriculaAluno=" + dataMatriculaAluno + ", nomeEscolaAluno=" + nomeEscolaAluno
				+ ", serieMatriculadoAluno=" + serieMatriculadoAluno + "]";
	}

	//Sobrescrevendo os metodos hashCode e equals
	@Override
	public int hashCode() {
		return Objects.hash(nomeAluno, numeroCpfAluno);
	}

	@Override
	public boolean equals(Object obj) {  //Classe Object principal
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nomeAluno, other.nomeAluno) && Objects.equals(numeroCpfAluno, other.numeroCpfAluno);
	}
	
}
