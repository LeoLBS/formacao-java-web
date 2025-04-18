package br.com.perber.principal;

import br.com.perber.modelos.CartaoCredito;
import br.com.perber.modelos.Produtos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {

        int saidaLoja = 1;

        Scanner receberValor = new Scanner(System.in);

        System.out.println("Digite o limite do cartão: ");
        double limiteCartao = receberValor.nextDouble();

        CartaoCredito cartaoCredito = new CartaoCredito(limiteCartao);

        List<Produtos> produtos = new ArrayList<>();

        do{
            System.out.println("Digite a descrição da compra:");
            String descricaoProduto = receberValor.next();

            System.out.println("Digite o valor da compra:");
            double valorCompra = receberValor.nextDouble();

            Produtos produto = new Produtos(descricaoProduto, valorCompra);

            if(cartaoCredito.limiteCartao(valorCompra) == 1){
                produtos.add(produto);
            }else{
                break;
            }

            System.out.println("Você deseja sair da loja? Se sim digite 0, se não digite 1");
            saidaLoja = receberValor.nextInt();

            if (saidaLoja == 0){
                produtos.sort(Comparator.comparing(Produtos::getValorProduto));
                System.out.println("*****************");
                System.out.println("Lista de compras: ");
                for (Produtos produtoLista : produtos){
                    System.out.println(produtoLista.getNomeProduto() + " - " + produtoLista.getValorProduto());
                }
                System.out.println("*****************");

                System.out.println("Saldo do cartão: " + cartaoCredito.getLimite());
            }
        }while(saidaLoja != 0);
    }
}
