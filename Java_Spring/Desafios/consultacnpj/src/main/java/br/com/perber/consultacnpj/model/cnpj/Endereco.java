package br.com.perber.consultacnpj.model.cnpj;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Endereco(String municipio,
                       @JsonAlias("uf") String estado) {
}
