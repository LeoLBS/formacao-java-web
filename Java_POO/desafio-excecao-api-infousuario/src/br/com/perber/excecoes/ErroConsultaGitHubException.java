package br.com.perber.excecoes;

public class ErroConsultaGitHubException extends RuntimeException{

    private String mensagem;

    public ErroConsultaGitHubException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
