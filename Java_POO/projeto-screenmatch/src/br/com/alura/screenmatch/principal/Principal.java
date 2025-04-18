package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Os Incriveis", 2010);

        meuFilme.setDuracaoEmMinutos(120);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avaliaFilme(10);
        System.out.println("Media de avaliações do filme: " + meuFilme.pegaMediaAvaliacoes());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Duração em minutos filme: " + meuFilme.getDuracaoEmMinutos());

        Serie supernatural = new Serie("Supernatural", 2003);
        supernatural.exibeFichaTecnica();
        supernatural.setTotalTemporadas(12);
        supernatural.setMinutosPorEpisodio(45);
        supernatural.setEpisodiosPorTemporada(12);
        System.out.println("Duração em minutos episodio: " + supernatural.getDuracaoEmMinutos());

        CalculadoraDeTempo calculaTempo = new CalculadoraDeTempo();

        calculaTempo.inclui(meuFilme);
        calculaTempo.inclui(supernatural);

        System.out.println("O tempo para maratonar é de: " + calculaTempo.getDuracaoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(supernatural);
        episodio.setTotalVisualizacoes(500);
        filtro.filtra(episodio);

        var filme2 = new Filme("A cabana", 2010);

        filme2.setDuracaoEmMinutos(120);

        ArrayList<Filme> filmes = new ArrayList<>();

        filmes.add(meuFilme);
        filmes.add(filme2);

        System.out.println("Total de filmes: " + filmes.size());
        System.out.println("Meu primeiro filme: " + filmes.get(0).getNomeDoTitulo());

        System.out.println(filmes);
    }
}

