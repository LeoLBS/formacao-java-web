package br.com.perber.consultacnpj.model.cnpj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AtividadePrincipal(String codigo,
                                 String descricao) {
}
