package br.com.perber.consultacnpj.service;

public interface IConverteDadosApi {

    <T> T dadosApi(String json, Class<T> classe);
}
