package br.com.perber.consultacnpj.model;

import br.com.perber.consultacnpj.model.cnpj.AtividadePrincipal;
import br.com.perber.consultacnpj.model.cnpj.Endereco;
import br.com.perber.consultacnpj.model.cnpj.Situacao;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosCNPJ(@JsonAlias("cnpj") String cnpj,
                        @JsonAlias("razao_social") String razaoSocial,
                        @JsonAlias("nome_fantasia") String nomeFantasia,
                        @JsonProperty("situacao") Situacao situacao,
                        @JsonAlias("endereco") Endereco endereco,
                        @JsonProperty("atividade_principal") AtividadePrincipal atividadePrincipal)
{

    public String getDescricaoAtividade() {
        return atividadePrincipal.descricao();
    }
    public String getStatusSituacao() {
        return situacao.status();
    }
    public String getMunicipioEndereco(){
        return endereco.municipio();
    }
    public String getEstadoEndereco(){
        return endereco.estado();
    }

    @Override
    public String toString() {
        return "\nDados do CNPJ:" +
                "\nCNPJ = " + cnpj +
                "\nRazao Social = " + razaoSocial +
                "\nNome Fantasia = " + nomeFantasia +
                "\nStatus atual = " + getStatusSituacao() +
                "\nMunicipio = " + getMunicipioEndereco() +
                "\nEstado = " + getEstadoEndereco() +
                "\nDescricao = " + getDescricaoAtividade();
    }
}
