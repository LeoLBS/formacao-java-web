package br.com.perber.consultacnpj;

import br.com.perber.consultacnpj.screen.BuscaCNPJ;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsultacnpjApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConsultacnpjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var buscaCNPJ = new BuscaCNPJ();
		buscaCNPJ.recebeCNPJ();
	}
}
