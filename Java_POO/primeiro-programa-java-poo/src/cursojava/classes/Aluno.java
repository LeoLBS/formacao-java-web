package cursojava.classes;

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
	
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
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
		return (nota1 + nota2 + nota3 + nota4) /4;
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

	@Override
	public String toString() {
		return "Aluno [Nome Aluno=" + getNomeAluno() + ", Idade Aluno=" + getIdadeAluno() + ", dataNascimentoAluno="
				+ dataNascimentoAluno + ", registroGeralAluno=" + registroGeralAluno + ", numeroCpfAluno="
				+ numeroCpfAluno + ", nomeMaeAluno=" + nomeMaeAluno + ", nomePaiAluno=" + nomePaiAluno
				+ ", dataMatriculaAluno=" + dataMatriculaAluno + ", nomeEscolaAluno=" + nomeEscolaAluno
				+ ", serieMatriculadoAluno=" + serieMatriculadoAluno + ", nota1=" + nota1 + ", nota2=" + nota2
				+ ", nota3=" + nota3 + ", nota4=" + nota4 + "]";
	}
}
