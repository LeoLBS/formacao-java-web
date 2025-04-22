package br.com.alura.screenmatch.excecoes;

public class ExcecaoNoAnoDeLancamento extends RuntimeException{

    private String mensagem;

    public ExcecaoNoAnoDeLancamento(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
