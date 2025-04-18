package br.com.perber.app;

import br.com.perber.modelos.PessoaFisica;
import br.com.perber.modelos.PessoaJuridica;

import javax.swing.*;

public class Banco {
    public static void main(String[] args) {
        String nomePessoa;
        String cpfPessoa;
        int tipoPessoa;
        int numeroBanco;
        int numeroConta;
        int senhaConta;
        String tipoPessoaString;
        String numeroBancoString;
        String numeroContaString;
        String senhaContaString;

        nomePessoa = JOptionPane.showInputDialog("Qual o nome da Pessoa: ");
        cpfPessoa = JOptionPane.showInputDialog("Qual o cpf: ");
        tipoPessoa = Integer.parseInt( tipoPessoaString = JOptionPane.showInputDialog("Qual o tipo de pessoa: "));
        numeroBanco = Integer.parseInt( numeroBancoString = JOptionPane.showInputDialog("Qual o número do banco: "));
        numeroConta = Integer.parseInt( numeroContaString = JOptionPane.showInputDialog("Qual o número da conta: "));
        senhaConta = Integer.parseInt( senhaContaString = JOptionPane.showInputDialog("Qual a senha da conta: "));

        PessoaFisica pessoaFisica = new PessoaFisica(nomePessoa,tipoPessoa,numeroBanco,numeroConta,senhaConta,cpfPessoa);
        //PessoaJuridica pessoaJuridica = new PessoaJuridica();
    }
}
