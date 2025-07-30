package br.com.perber.consultacep.service;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosCep(@JsonAlias("cep") String cep,
                       @JsonAlias("logradouro") String rua,
                       @JsonAlias("bairro") String bairro,
                       @JsonAlias("localidade") String cidade,
                       @JsonAlias("estado") String estado,
                       @JsonAlias("ddd") String ddd) {
}
