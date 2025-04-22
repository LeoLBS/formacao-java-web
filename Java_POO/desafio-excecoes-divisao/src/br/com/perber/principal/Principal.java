package br.com.perber.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int primeiroNumero;
        int segundoNumero;
        int resultadoDivisao;

        System.out.println("Programa de divisão!!!");
        System.out.println("Informe o primeiro número: ");
        primeiroNumero = leitura.nextInt();
        System.out.println("Informe o segundo número: ");
        segundoNumero = leitura.nextInt();

        try {
            resultadoDivisao = primeiroNumero / segundoNumero;
            System.out.println("Resultado da divisão: " + resultadoDivisao);
        }catch (ArithmeticException e){
            System.out.println("Número " + primeiroNumero + ", não pode ser dividido por " + segundoNumero);
        }

    }
}
