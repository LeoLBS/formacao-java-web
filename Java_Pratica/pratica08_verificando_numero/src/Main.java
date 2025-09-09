//Ana precisa identificar se um número é par ou ímpar para um jogo que está desenvolvendo.
//Para isso, deseja criar um programa que analisa se o número que ela definiu previamente é par ou ímpar.
//
//Como você ajudaria Ana a escrever um programa que
//determine se um número é par ou ímpar e exiba o resultado corretamente?

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;

        System.out.println("Digite o número:");
        numero = ler.nextInt();

        if (numero % 2 == 0){
            System.out.println("Número " + numero + " é par!");
        }else {
            System.out.println("Número " + numero + " é ímpar!");
        }
    }
}
