package br.com.perber.excecoes;

public class ExcecaoSenhaDoUsuarioPequena extends RuntimeException {

    private String mensagem;

    public ExcecaoSenhaDoUsuarioPequena(String mensagem){
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
