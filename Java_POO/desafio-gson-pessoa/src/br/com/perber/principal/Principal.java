package br.com.perber.principal;

import br.com.perber.modelos.Pessoa;
import br.com.perber.modelos.TipoPessoa;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {

        String jsonPessoa = """
                {
                  "nomePessoa": "Leo",
                  "idadePessoa": 20,
                  "cidadePessoa": "Alins",
                  "estadoPessoa": "São Paulo",
                  "CPF": "11111111111",
                  "RG": ""
                }
                """;

        Gson gson = new Gson();

        TipoPessoa tipoPessoa = gson.fromJson(jsonPessoa, TipoPessoa.class);
        System.out.println(tipoPessoa);

        Pessoa pessoa = new Pessoa(tipoPessoa);
        System.out.println(pessoa);
    }
}
