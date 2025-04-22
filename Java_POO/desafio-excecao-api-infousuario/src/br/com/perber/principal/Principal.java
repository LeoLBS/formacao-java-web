package br.com.perber.principal;

import br.com.perber.excecoes.ErroConsultaGitHubException;
import br.com.perber.modelos.InformacaoUsuario;
import br.com.perber.modelosapi.InformacoesUsuarioGitHub;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String buscaNomeUsuario;
        String urlBusca;
        String jsonRetorno;
        int statusRetorno;

        System.out.println("Informe o nome do usuario para busca: ");
        buscaNomeUsuario = leitura.nextLine();

        urlBusca = "https://api.github.com/users/" + buscaNomeUsuario;

        try {
            HttpClient cliente = HttpClient.newHttpClient();
            HttpRequest requisicao = HttpRequest.newBuilder()
                    .uri(URI.create(urlBusca))
                    .build();

            HttpResponse<String> response = cliente
                    .send(requisicao, HttpResponse.BodyHandlers.ofString());

            statusRetorno = response.statusCode();
            jsonRetorno = response.body();
            Gson gson = new Gson();

            InformacoesUsuarioGitHub infoUsuarioGitHub = gson.fromJson(jsonRetorno, InformacoesUsuarioGitHub.class);
            InformacaoUsuario informacaoUsuario = new InformacaoUsuario(infoUsuarioGitHub, statusRetorno);



            System.out.println("Nome do usuario: " + informacaoUsuario.getNomeUsuario());
            System.out.println("Localicação do usuario: " + informacaoUsuario.getLocalizacaoUsuario());
            System.out.println("Bio do usuario: " + informacaoUsuario.getBioUsuario());
        }catch (IOException | InterruptedException e){
            System.out.println("Teve um erro na resposta do HTTP, " + e.getMessage());
        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());
        }
    }
}
