package br.com.perber.principal;

import br.com.perber.excecoes.ExcecaoSenhaDoUsuarioPequena;
import br.com.perber.modelos.Usuario;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leituraUsuario = new Scanner(System.in);

        String nomeUsuario;
        String senhaUsuario;

        System.out.println("Criando um usuario!!");
        System.out.println("Informe o nome do usuario: ");
        nomeUsuario = leituraUsuario.nextLine();
        System.out.println("Informe a senha do usuario: ");
        senhaUsuario = leituraUsuario.nextLine();

        try {
            Usuario usuario = new Usuario(nomeUsuario, senhaUsuario);

            if (usuario.getUsuarioValido()) {
                System.out.println("Usuario " + usuario.getNomeUsuario() + ", senha " + usuario.getSenhaUsuario() + ", criado!!");
            }
        }catch (ExcecaoSenhaDoUsuarioPequena e){
            System.out.println("Usuario não criado, " + e.getMessage());
        }
    }
}
