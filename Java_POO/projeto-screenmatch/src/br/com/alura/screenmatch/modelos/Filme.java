package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nomeDoTitulo, int anoDeLancamento) {
        super(nomeDoTitulo, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMediaAvaliacoes() / 2;
    }

    @Override
    public String toString() {
        return "Filme " + getNomeDoTitulo() + " (" + getAnoDeLancamento() + ")";
    }
}
