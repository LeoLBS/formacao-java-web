package br.com.perber.modelos;

import br.com.perber.excecoes.ErroConsultaGitHubException;
import br.com.perber.modelosapi.InformacoesUsuarioGitHub;

public class InformacaoUsuario {
    private String nomeUsuario;
    private String localizacaoUsuario;
    private String bioUsuario;

    public InformacaoUsuario(InformacoesUsuarioGitHub infoUsuarioGitHub, int statusRetorno) {
        if(statusRetorno == 404 ) {
            throw new ErroConsultaGitHubException("Usuario informado não foi encontrado!");
        }else if (statusRetorno == 200 || statusRetorno == 201) {
            this.nomeUsuario = infoUsuarioGitHub.name();
            this.localizacaoUsuario = infoUsuarioGitHub.location();
            this.bioUsuario = infoUsuarioGitHub.bio();
        }
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getLocalizacaoUsuario() {
        return localizacaoUsuario;
    }

    public String getBioUsuario() {
        return bioUsuario;
    }
}
