package br.com.perber.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeraArquivoJson {

    Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    public GeraArquivoJson( List<ApiCep> apiCep) {
        try {
            FileWriter escrita = new FileWriter("Ceps.json");
            escrita.write(gson.toJson(apiCep));
            escrita.close();
        }catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
