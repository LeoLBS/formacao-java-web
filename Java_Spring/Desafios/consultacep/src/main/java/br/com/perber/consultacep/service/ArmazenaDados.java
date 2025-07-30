package br.com.perber.consultacep.service;

public class ArmazenaDados {

    private String cep;
    private String bairro;
    private String rua;
    private String cidade;
    private String estado;
    private String ddd;



    public void armazenaCep(String json){
        ConverteDados converter = new ConverteDados();
        DadosCep dados = converter.dadosApi(json, DadosCep.class);

        this.cep = dados.cep();
        this.bairro = dados.bairro();
        this.rua = dados.rua();
        this.cidade = dados.cidade();
        this.estado = dados.estado();
        this.ddd = dados.ddd();
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getDdd() {
        return ddd;
    }
}
