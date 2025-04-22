package br.com.perber.modelos;

public class Pessoa {
    private String nomePessoa;
    private int idadePessoa;
    private String cidadePessoa;

    public Pessoa(TipoPessoa tipoPessoa) {
        this.nomePessoa= tipoPessoa.nomePessoa();
        this.idadePessoa = tipoPessoa.idadePessoa();
        this.cidadePessoa = tipoPessoa.cidadePessoa();
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public int getIdadePessoa() {
        return idadePessoa;
    }

    public String getCidadePessoa() {
        return cidadePessoa;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nomePessoa='" + nomePessoa + '\'' +
                ", idadePessoa=" + idadePessoa +
                ", cidadePessoa='" + cidadePessoa + '\'' +
                '}';
    }
}
