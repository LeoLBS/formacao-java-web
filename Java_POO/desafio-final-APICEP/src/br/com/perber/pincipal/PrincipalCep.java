package br.com.perber.pincipal;

import br.com.perber.modelos.ApiCep;
import br.com.perber.modelos.ApiCepViaCep;
import br.com.perber.modelos.GeraArquivoJson;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalCep {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        int cepBusca;
        int opcaoCep = 1;
        String gerarArquivo;
        ApiCep apiCep;
        ApiCepViaCep viaCep;

        List<ApiCepViaCep> listaCeps = new ArrayList<>();

        while(opcaoCep != 0){
            System.out.println("""
                                Escolha uma opção: 
                                1 - Buscar CEP
                                0 - Sair""");
            opcaoCep = leitura.nextInt();

            if(opcaoCep == 0){ break;} //Verifica Opção do usuario

            System.out.println("Informe um Cep que quer buscar: ");
            cepBusca = leitura.nextInt();

            apiCep = new ApiCep();

            viaCep = apiCep.buscaCep(cepBusca);

            System.out.println(viaCep.toString());

            listaCeps.add(viaCep);

        };

        System.out.println("Deseja gerar um arquivo JSON com as Informações?");
        gerarArquivo = leitura.next();

        if(gerarArquivo.equalsIgnoreCase("sim") || gerarArquivo.equalsIgnoreCase("s")){
            GeraArquivoJson geraArquivoJson = new GeraArquivoJson(listaCeps);
        }

    }
}
