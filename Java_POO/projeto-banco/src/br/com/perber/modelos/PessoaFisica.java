package br.com.perber.modelos;


public class PessoaFisica extends Pessoa{

    private String cpfPesso;


    public PessoaFisica(String nomePessoa, int tipoPessoa, int numeroBanco, int numeroConta, int senhaConta, String cpfPesso) {
        super(nomePessoa, tipoPessoa, numeroBanco, numeroConta, senhaConta);
        this.cpfPesso = cpfPesso;
    }
}
