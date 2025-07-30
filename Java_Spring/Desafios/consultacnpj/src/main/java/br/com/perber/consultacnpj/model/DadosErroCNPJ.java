package br.com.perber.consultacnpj.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosErroCNPJ(@JsonAlias("message") String mensagem) {

    public String getMensagem(){
       return "Unauthenticated.".equals(mensagem) ? "Token Invalido!" : mensagem;
    }

    @Override
    public String toString() {
        return "Menssagem de retorno = " + getMensagem();
    }
}
