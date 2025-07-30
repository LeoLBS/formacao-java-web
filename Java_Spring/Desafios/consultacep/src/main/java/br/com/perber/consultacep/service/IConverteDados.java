package br.com.perber.consultacep.service;

public interface IConverteDados {
    <T> T dadosApi(String jason, Class<T> classe);
}
