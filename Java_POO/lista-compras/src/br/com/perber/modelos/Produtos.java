package br.com.perber.modelos;

public class Produtos {
    private String nomeProduto;
    private double valorProduto;

    public Produtos(String nomeProduto, double valorProduto) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

}
