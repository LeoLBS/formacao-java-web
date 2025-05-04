package br.com.perber.screenmatch;

import br.com.perber.screenmatch.models.DadosSerie;
import br.com.perber.screenmatch.service.ConsumoApi;
import br.com.perber.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		System.out.println("Olá!");
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumirApi = new ConsumoApi();
		var json = consumirApi.obterDados("https://www.omdbapi.com/?t=supernatural&apikey=859ff2ff");
		System.out.println(json);

		ConverteDados conversor = new ConverteDados();

		DadosSerie dadosSerie = conversor.obterDados(json, DadosSerie.class);

		System.out.println(dadosSerie);
	}
}
