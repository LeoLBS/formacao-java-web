package cursojava.classes;

/*Aqui temos nossa classe Aluno, sendo ela o nosso molde para os objetos*/
public class Aluno {
	
	/*Aqui temos os nossos atributos da nossa classe Aluno*/
	public String nomeAluno; // Variavel é do tipo de acsso public
	private int idadeAluno;  // Variavel é do tipo de acesso private
	String dataNascimentoAluno;
	String registroGeralAluno;
	String numeroCpfAluno;
	String nomeMaeAluno;
	String nomePaiAluno;
	String dataMatriculaAluno;
	String nomeEscolaAluno;
	String serieMatriculadoAluno;
	
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
}
