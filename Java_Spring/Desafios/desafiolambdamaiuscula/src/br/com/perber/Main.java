package br.com.perber;

import br.com.perber.model.IConverteLetra;

public class Main {
    public static void main(String[] args) {
        IConverteLetra converteLetra = l -> l.toUpperCase();

        System.out.println(converteLetra.letraMaiuscula("Texto aqui!"));
    }
}