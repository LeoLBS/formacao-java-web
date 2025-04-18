package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Os Incriveis", 2009);
        meuFilme.avaliaFilme(10);
        var filme2 = new Filme("A cabana", 2010);
        filme2.avaliaFilme(8);

        Serie supernatural = new Serie("Supernatural", 2003);

        filme2.setDuracaoEmMinutos(120);

        List<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(filme2);
        lista.add(supernatural);

        for (Titulo item : lista){
            System.out.println("Nome: " + item.getNomeDoTitulo());

            if(item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        List<String> ordermAutores = new ArrayList<String>();

        ordermAutores.add("Leo");
        ordermAutores.add("Pedro");
        ordermAutores.add("João");

        System.out.println(ordermAutores);
        System.out.println("Ordem dos autores com ordenação!");
        Collections.sort(ordermAutores);
        System.out.println(ordermAutores);

        System.out.println("Ordem da lista de titulos:");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordernando por ano: ");
        System.out.println(lista);


    }
}
