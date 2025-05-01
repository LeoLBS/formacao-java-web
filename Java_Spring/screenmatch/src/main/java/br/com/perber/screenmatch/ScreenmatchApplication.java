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
		var consumirApi = new ConsumoApi();
		var json = consumirApi.obterDados("https://www.omdbapi.com/?t=supernatural&Season=1&apikey=859ff2ff");
		System.out.println(json);
	}
}
