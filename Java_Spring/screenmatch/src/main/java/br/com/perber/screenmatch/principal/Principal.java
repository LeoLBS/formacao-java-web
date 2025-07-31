package br.com.perber.screenmatch.principal;

import br.com.perber.screenmatch.model.DadosSerie;
import br.com.perber.screenmatch.model.DadosTemporada;
import br.com.perber.screenmatch.service.ConsumoApi;
import br.com.perber.screenmatch.service.ConveteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private ConsumoApi consumoApi = new ConsumoApi();
    private Scanner leitura = new Scanner(System.in);
    private ConveteDados conversor = new ConveteDados();

    private final String APIKEY = "&apikey=" + System.getenv("API_KEY_OMDB");
    private final String ENDERECO = "http://www.omdbapi.com/?t=";

    public void exibeMenu(){
        System.out.println("Qual serie você deseja buscar: ");
        var recebeSerie = leitura.nextLine();
        var json = consumoApi
                .obterDados(ENDERECO + recebeSerie.replace(" ", "+") + APIKEY);

        DadosSerie dadosSerie = conversor.ObterDados(json, DadosSerie.class);
        System.out.println("\n" + dadosSerie);


        List<DadosTemporada> temporadas = new ArrayList<>();

        for(int i = 1; i <= dadosSerie.totalTemporadas(); i++){

            json = consumoApi
                    .obterDados(ENDERECO + recebeSerie.replace(" ", "+") + "&Season=" + i + APIKEY);
            DadosTemporada dadosTemporada = conversor.ObterDados(json, DadosTemporada.class);

            temporadas.add(dadosTemporada);
        }
        temporadas.forEach(System.out::println);

        temporadas.forEach(t ->
                t.episodios().forEach(e ->
                        System.out.println(e.tituloEpisodio())));
    }
}
