package br.com.perber.consultacep.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados{

   private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T dadosApi(String jason, Class<T> classe) {

        try {
            return mapper.readValue(jason, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
