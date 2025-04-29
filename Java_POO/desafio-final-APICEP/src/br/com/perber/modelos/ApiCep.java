package br.com.perber.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class ApiCep {

    Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    public ApiCepViaCep buscaCep(int cepBusca){
        String jsonRetorno = "";
        String urlBusca = "https://viacep.com.br/ws/" + cepBusca + "/json/";
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlBusca))
                    .build();
        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Retorno: " + response.statusCode());
            jsonRetorno = response.body();

            return new Gson().fromJson(jsonRetorno, ApiCepViaCep.class);
        } catch (Exception e) {
            throw new RuntimeException("Não deu certo: " + e.getMessage());
        }
    }
}
