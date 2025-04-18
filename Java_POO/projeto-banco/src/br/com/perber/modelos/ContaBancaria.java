package br.com.perber.modelos;

import java.util.ArrayList;

public class ContaBancaria {
    private double saldoBancarioCorrente;
    private double saldoBancarioCredito;
    private double saldoExtratoBancarioCredito;
    private String descricaoExtratoCredito;
    private String descricaoExtratoCorrente;


    public double getSaldoBancarioCorrente() {
        return saldoBancarioCorrente;
    }

    public double getSaldoBancarioCredito() {
        return saldoBancarioCredito;
    }

    public double getSaldoExtratoBancarioCredito() {
        return saldoExtratoBancarioCredito;
    }

    public String getDescricaoExtratoCredito() {
        return descricaoExtratoCredito;
    }

    public String getDescricaoExtratoCorrente() {
        return descricaoExtratoCorrente;
    }

    public void depositarSaldo(double valorDeposito, Pessoa pessoaConta){



    }

}
