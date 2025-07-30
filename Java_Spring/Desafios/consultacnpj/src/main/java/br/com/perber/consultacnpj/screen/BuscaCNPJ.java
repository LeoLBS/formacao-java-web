package br.com.perber.consultacnpj.screen;

import br.com.perber.consultacnpj.service.ArmazenaCNPJ;

import java.util.Scanner;

public class BuscaCNPJ {

    private String cnpj;
    ArmazenaCNPJ armazenaCNPJ = new ArmazenaCNPJ();
    Scanner ler = new Scanner(System.in);

    public void recebeCNPJ(){

        int opcao = 1;

        do {
            do{
                System.out.println("Informe o CNPJ para busca: ");
                this.cnpj = ler.next();
            } while(!armazenaCNPJ.validaCNPJ(this.cnpj));

            if (armazenaCNPJ.solicitarCNPJ(this.cnpj)){
                System.out.println(armazenaCNPJ.retornarCNPJ());
            }else {
                System.out.println("\nCNPJ não encontrado!!!");
            }

            System.out.println("""
                    \nEscolha uma opção:
                        1 - Para continuar;
                        0 - Para sair;""");
            opcao = ler.nextInt();
        }while(opcao != 0);
    }
}
