package br.com.perber;

import br.com.perber.model.IMultiplica;

public class Main {
    public static void main(String[] args) {
        IMultiplica multiplica = new IMultiplica() {
            @Override
            public double multiplicacao(int a, int b) {
                return a * b;
            }
        };
        System.out.println(multiplica.multiplicacao(10,2));

        //Lambda:
        IMultiplica multiplica1 = (a1 , b1) -> a1 * b1;
        System.out.println(multiplica1.multiplicacao(5, 2));
    }
}