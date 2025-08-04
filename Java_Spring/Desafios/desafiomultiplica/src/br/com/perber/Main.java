package br.com.perber;

import br.com.perber.model.IMultiplica;
import br.com.perber.model.INumeroPrimo;

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

        //Lambda:
        INumeroPrimo numeroPrimo = n -> {
            if(n <= 1) return false;
            for(int i = 2; i<= Math.sqrt(n); i++){
                if(n % i == 0) return  false;
            }
            return true;
        };
        System.out.println(numeroPrimo.dividePrimo(10));
        System.out.println(numeroPrimo.dividePrimo(2));
        System.out.println(numeroPrimo.dividePrimo(9));
        System.out.println(numeroPrimo.dividePrimo(8));
    }
}