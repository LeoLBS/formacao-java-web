package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{
    private String nomeDoTitulo;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public Titulo(String nomeDoTitulo, int anoDeLancamento) {
        this.nomeDoTitulo = nomeDoTitulo;
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getTotalDeAvaliacoes(){
        return  totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public String getNomeDoTitulo() {
        return nomeDoTitulo;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setNomeDoTitulo(String nomeDoFilme) {
        this.nomeDoTitulo = nomeDoFilme;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }


    public void exibeFichaTecnica(){
        System.out.println("Nome do Titulo: " + nomeDoTitulo);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Incluído no plano: " + incluidoNoPlano);
    }

    public void avaliaFilme(int notaFilme){
        somaDasAvaliacoes += notaFilme;
        totalDeAvaliacoes++;
    }

    public double pegaMediaAvaliacoes(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return getNomeDoTitulo().compareTo(outroTitulo.getNomeDoTitulo());
    }

}
