package br.com.perber.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);

        String enderecoUri;
        String apiKey = "suaKeyAqui";

        System.out.println("Escreva o nome do livro: ");
        var buscaLivro = leitura.nextLine();

        enderecoUri = "https://www.googleapis.com/books/v1/volumes?q=" + buscaLivro + ":keyes&key=" + apiKey;

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest requisicao = HttpRequest.newBuilder()
                .uri(URI.create(enderecoUri.replaceAll("\\s+","")))
                .build();

        HttpResponse<String> resposta = cliente
                .send(requisicao, HttpResponse.BodyHandlers.ofString());

        System.out.println(resposta.body());


    }
}
