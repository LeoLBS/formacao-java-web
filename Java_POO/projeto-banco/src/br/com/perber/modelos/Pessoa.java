package br.com.perber.modelos;


public class Pessoa {
    private String nomePessoa;
    private int tipoPessoa;
    private int numeroBanco;
    private int numeroConta;
    private int senhaConta;


    public Pessoa(String nomePessoa, int tipoPessoa, int numeroBanco, int numeroConta, int senhaConta) {

        this.nomePessoa = nomePessoa;
        this.tipoPessoa = tipoPessoa;
        this.numeroBanco = numeroBanco;
        this.numeroConta = numeroConta;
        this.senhaConta = senhaConta;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public int getTipoPessoa() {
        return tipoPessoa;
    }

    public int getNumeroBanco() {
        return numeroBanco;
    }

}
