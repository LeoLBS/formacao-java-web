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

        System.out.println("Escreva o nome da moeda: ");
        var buscaMoeda = leitura.nextLine();

        enderecoUri = "https://api.coingecko.com/api/v3/simple/price?ids=" + buscaMoeda + "&vs_currencies=USD&x_cg_demo_api_key=" + apiKey;

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest requisicao = HttpRequest.newBuilder()
                .uri(URI.create(enderecoUri.replaceAll("\\s+","")))
                .build();

        HttpResponse<String> resposta = cliente
                .send(requisicao, HttpResponse.BodyHandlers.ofString());

        System.out.println(resposta.body());
    }
}
