//Você trabalha em um e-commerce e precisa classificar os
//produtos em diferentes categorias com base no preço.
//
//Escreva um programa que classifique um produto em uma
//categoria com base em um preço e exiba a categoria correspondente, conforme as seguintes regras:
//
//Econômico: preço até R$ 50,00.
//Intermediário: preço entre R$ 50,01 e R$ 200,00.
//Premium: preço acima de R$ 200,00


public class Main {
    public static void main(String[] args) {

        double precoProduto = 204;

        if (precoProduto <= 50){
            System.out.println("Produto da categoria: Econômico");
        }else if (precoProduto > 50 && precoProduto <= 200){
            System.out.println("Produto da categoria: Intermediário");
        } else if (precoProduto > 200) {
            System.out.println("Produto da categoria: Premium");
        }
    }
}
