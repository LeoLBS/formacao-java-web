package br.com.perber.pincipal;

import br.com.perber.modelos.ApiCep;
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
        int opcaoCep;
        String gerarArquivo;

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .excludeFieldsWithoutExposeAnnotation()
                .create();

        List<ApiCep> listaApiCeps = new ArrayList<>();

        do {
            System.out.println("""
                                Escolha uma opção: 
                                1 - Buscar CEP
                                0 - Sair""");
            opcaoCep = leitura.nextInt();

            if(opcaoCep == 0){ break;} //Verifica Opção do usuario

            System.out.println("Informe um Cep que quer buscar: ");
            cepBusca = leitura.nextInt();

            ApiCep apiCep = new ApiCep(cepBusca);

            listaApiCeps.add(apiCep);


            System.out.println(apiCep.toString());

        }while(opcaoCep != 0);

        for(ApiCep apicepe : listaApiCeps){
            System.out.println(apicepe.toString());
        }

        FileWriter escrita = new FileWriter("Ceps.json");
        escrita.write(gson.toJson(listaApiCeps));
        escrita.close();

        /*System.out.println("Deseja gerar um arquivo JSON com as Informações?");
        gerarArquivo = leitura.next();

        if(gerarArquivo.equalsIgnoreCase("sim") || gerarArquivo.equalsIgnoreCase("s")){
            GeraArquivoJson geraArquivoJson = new GeraArquivoJson(listaApiCeps);
        }*/
    }
}
