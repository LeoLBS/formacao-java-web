package br.com.perber.modelos;


public class PessoaJuridica extends Pessoa{

    private String cnpjPessoa;


    public PessoaJuridica(String nomePessoa, int tipoPessoa, int numeroBanco, int numeroConta, int senhaConta, String cnpjPessoa) {
        super(nomePessoa, tipoPessoa, numeroBanco, numeroConta, senhaConta);
        this.cnpjPessoa = cnpjPessoa;
    }
}
