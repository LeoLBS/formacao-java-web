package br.com.perber;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        numeros.replaceAll(n -> n *3);

        numeros.forEach(System.out::println);
        System.out.println(numeros);
    }
}