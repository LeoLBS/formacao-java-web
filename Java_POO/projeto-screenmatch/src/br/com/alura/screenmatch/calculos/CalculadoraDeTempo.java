package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int duracaoTotal;

    public int getDuracaoTotal() {
        return duracaoTotal;
    }

    public void inclui(Titulo titulo){
        this.duracaoTotal += titulo.getDuracaoEmMinutos();
    }
}
