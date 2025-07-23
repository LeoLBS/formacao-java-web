package br.com.perber.screenmatch;

import br.com.perber.screenmatch.service.ConsumoApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		var apiKey = "";

		var consumoApi = new ConsumoApi();

		var json = consumoApi
				.obterDados("http://www.omdbapi.com/?t=supernatural&Season=1&episode=1&apikey="+apiKey);
//		var jsonCep = consumoApi
//				.obterDados("https://viacep.com.br/ws/87103030/json");
// 		System.out.println(jsonCep);

		System.out.println(json);
	}

}
