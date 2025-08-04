package br.com.perber;

import br.com.perber.model.IVerificaTexto;

public class Main {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder();
        IVerificaTexto verificaTexto = v -> {
            text.append(v);
            if (v.equals(text.reverse().toString())) return true;
            return false;
        };

        System.out.println("Palindromo: " + verificaTexto.verificarPalindromo("adada"));
        System.out.println("Palavra reverse: " + text.toString());

        //Forma mais curta:
        IVerificaTexto verifica = v -> v.equals(new StringBuilder(v).reverse().toString());

        System.out.println("Palindromo: " + verifica.verificarPalindromo("ovo"));
        System.out.println("Palindromo: " + verifica.verificarPalindromo("aqui"));

    }
}