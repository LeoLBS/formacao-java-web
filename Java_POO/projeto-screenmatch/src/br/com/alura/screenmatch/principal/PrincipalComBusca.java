package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecoes.ExcecaoNoAnoDeLancamento;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);

        String apiKey = "suaApiKeyAqui";
        String enderecoUri;

        String busca = "";
        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while(!busca.equalsIgnoreCase("sair")) {
            System.out.println("Digite o nome do seu filme:");
            busca = leitura.nextLine();

            enderecoUri = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=" + apiKey;

            try {
                HttpClient cliente = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(enderecoUri))
                        .build();
                HttpResponse<String> response = cliente
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);


                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);

                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println(meuTitulo);

                FileWriter arquivoTitulo = new FileWriter("titulo.txt"); // Criando um objeto para o arquivo titulo.txt
                arquivoTitulo.write(meuTitulo.toString());
                arquivoTitulo.close();

                titulos.add(meuTitulo);

            } catch (NumberFormatException e) {
                System.out.println("Erro identificado: " + e.getMessage());
            } catch (IllegalArgumentException | NullPointerException e) { //multi-catch
                System.out.println("Erro dentro da URL informada: " + e.getMessage());
            } catch (ExcecaoNoAnoDeLancamento e) {
                System.out.println(e.getMessage());
            }
        }

        FileWriter escrita = new FileWriter("Filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();

        System.out.println("Programa finalizou!!");

    }
}
