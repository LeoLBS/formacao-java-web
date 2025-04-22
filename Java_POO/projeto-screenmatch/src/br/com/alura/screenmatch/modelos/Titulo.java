package br.com.alura.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;
import br.com.alura.screenmatch.excecoes.ExcecaoNoAnoDeLancamento;

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

    public Titulo(TituloOmdb meuTituloOmdb) {

        if(meuTituloOmdb.year().length() > 4){
            throw new ExcecaoNoAnoDeLancamento("Não foi possivel definir o ano de lançamento!!");
        }
        this.nomeDoTitulo = meuTituloOmdb.title();
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,3));
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

    @Override
    public String toString() {
        return "Titulo{" +
                "Nome do Titulo='" + nomeDoTitulo + '\'' +
                ", Ano De Lancamento=" + anoDeLancamento +
                ", Duração="+duracaoEmMinutos +
                '}';
    }
}
