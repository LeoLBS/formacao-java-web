package br.com.perber.modelos;

import br.com.perber.excecoes.ExcecaoSenhaDoUsuarioPequena;

public class Usuario {

    private String nomeUsuario;
    private String senhaUsuario;
    private boolean usuarioValido = false;

    public Usuario(String nomeUsuario, String senhaUsuario) {

        if(senhaUsuario.length() < 8){
            throw new ExcecaoSenhaDoUsuarioPequena("Senha o usuario é menor que 8 caracteres!!");
        }else{
            this.nomeUsuario = nomeUsuario;
            this.senhaUsuario = senhaUsuario;
            this.usuarioValido = true;
        }
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public boolean getUsuarioValido() {
        return usuarioValido;
    }
}
