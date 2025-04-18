package br.com.perber.modelos;

public class CartaoCredito implements ValorLimite{

    private double limite;

    public CartaoCredito(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public int limiteCartao(double valorCompra) {
        if(valorCompra <= this.limite){
            this.limite -= valorCompra;
            return 1;
        }else{
            System.out.println("Valor da comprar é maior que o limite atual do cartão, de R$: " + this.getLimite());
            return 0;
        }
    }
}
