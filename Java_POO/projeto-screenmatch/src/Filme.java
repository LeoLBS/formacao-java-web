public class Filme {
    String nomeDoFilme;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nomeDoFilme);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Incluído no plano: " + incluidoNoPlano);
    }

    void avaliaFilme(int notaFilme){
        somaDasAvaliacoes += notaFilme;
        totalDeAvaliacoes++;
    }

    double pegaMediaAvaliacoes(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
