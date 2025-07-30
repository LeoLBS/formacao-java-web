package br.com.perber.consultacnpj.service;

import br.com.perber.consultacnpj.model.DadosCNPJ;
import br.com.perber.consultacnpj.model.DadosErroCNPJ;

public class ArmazenaCNPJ {

    private String json;
    private String apiToken = System.getenv("API_KEY_CNPJ");
    private String endereco;
    DadosCNPJ dadosCNPJ;
    DadosErroCNPJ dadosErroCNPJ;
    ConverteDadosApi converte = new ConverteDadosApi();
    ConsultaApi consulta = new ConsultaApi();

    public boolean validaCNPJ(String cnpj){
        if(cnpj.length() != 14){
            System.out.println("Total de caracteres do CNPJ invalido!!");
            return false;
        }else{
            return true;
        }
    }

    public boolean solicitarCNPJ(String cnpj){
        endereco ="https://api.invertexto.com/v1/cnpj/" + cnpj + "?token=" + apiToken;
        this.json = consulta.dadosRetornoApi(endereco);

        if(consulta.getStatus() >= 400 && consulta.getStatus() <= 499){
            System.out.println(dadosErroCNPJ = converte.dadosApi(this.json, DadosErroCNPJ.class));
            System.out.println("\nStatus de retorno: " + consulta.getStatus());
            return false;
        }else {
            return true;
        }
    }

    public DadosCNPJ retornarCNPJ(){
        return dadosCNPJ = converte.dadosApi(this.json, DadosCNPJ.class);
    }
}
