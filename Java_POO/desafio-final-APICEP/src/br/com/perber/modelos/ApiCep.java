package br.com.perber.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class ApiCep {
    private int cepBusca;
    private String nomeRua;
    private String nomeBairro;
    private String nomeCidade;
    private String nomeEstado;
    private String siglaEstado;
    private int dddNumero;
    private String jsonRetorno;
    private transient ApiCepViaCep apiCepViaCep;


    private transient Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    public ApiCep(int cepBusca) {

        this.buscaCep(cepBusca);
        this.montaInformacaoViaCep();
        this.cepBusca = cepBusca;

    }

    public void buscaCep(int cep){

        String urlBusca = "https://viacep.com.br/ws/" + cep + "/json/";
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlBusca))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Retorno: " + response.statusCode());
            this.jsonRetorno = response.body();
        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void montaInformacaoViaCep(){
        this.apiCepViaCep = gson.fromJson(this.jsonRetorno, ApiCepViaCep.class);

        this.nomeRua = apiCepViaCep.logradouro();
        this.nomeBairro = apiCepViaCep.bairro();
        this.nomeCidade = apiCepViaCep.localidade();
        this.siglaEstado = apiCepViaCep.uf();
        this.nomeEstado = apiCepViaCep.estado();
        this.dddNumero = apiCepViaCep.ddd();

    }

    @Override
    public String toString() {
        return "ApiCep(" +
                "Cep da Busca=" + cepBusca +
                ", Nome da Rua= " + nomeRua +
                ", Nome do Bairro= " + nomeBairro +
                ", Nome do Cidade= " + nomeCidade +
                ", Nome do Estado= " + nomeEstado +
                ", Sigla do Estado= " + siglaEstado +
                ", DDD Numero=" + dddNumero +
                ')';
    }
}
