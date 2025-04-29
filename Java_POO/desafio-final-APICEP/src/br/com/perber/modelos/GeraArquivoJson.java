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

    public GeraArquivoJson( List<ApiCepViaCep> listaCeps) {
        try {
            FileWriter escrita = new FileWriter("Ceps.json");
            escrita.write(gson.toJson(listaCeps));
            escrita.close();
        }catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
