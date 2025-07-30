package br.com.perber.consultacep;

import br.com.perber.consultacep.model.ConsultaApi;
import br.com.perber.consultacep.service.ArmazenaDados;
import br.com.perber.consultacep.service.ConverteDados;
import br.com.perber.consultacep.service.DadosCep;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ConsultacepApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConsultacepApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner ler = new Scanner(System.in);
		var consulta = new ConsultaApi();
		var opcao = 1;


		do {
			System.out.println("Informe o Cep que você quer buscar: ");
			String cep = ler.next();

			var json = consulta.obterDados("https://viacep.com.br/ws/"+cep+"/json/");

			var dadosCep = new ArmazenaDados();

			dadosCep.armazenaCep(json);
			System.out.println("Cep: " + dadosCep.getCep());
			System.out.println("Bairro: " + dadosCep.getBairro());
			System.out.println("Rua: " + dadosCep.getRua());
			System.out.println("Cidade: " + dadosCep.getCidade());
			System.out.println("Estado: " + dadosCep.getEstado());
			System.out.println("Ddd: " + dadosCep.getDdd());

			System.out.println("""
								Quer buscar mais algum CEP?
								1 - Buscar;
								0 - Sair;""");
			opcao = ler.nextInt();

		}while(opcao != 0);

		ler.close();
	}
}

//u8wn293md
//20856|pqNGIne5HI3U9g97BKalu2zXLPCqPpjM