package desafio.cursojava;

import java.util.Scanner;

public class QuartoDesafioJava {
	
	/*Desafio 4  Validar se uma Pessoa Pode Votar*/
	
	/*
	 * Objetivo:
		- Verifique se uma pessoa pode votar e se o voto é facultativo ou obrigatório , com base na idade.
		
		Regras:

		- Menores de 16 anos: Não podem votar.
		- Entre 16 e 17 anos ou acima de 70 anos: Voto é facultativo .
		- Entre 18 e 70 anos: Voto é obrigatório .
		
		Passo a Passo:

		- Peça a idade do usuário.
		- Use uma cadeia de if-else para verificar cada faixa etária.
		- Exiba uma mensagem com o status de voto: não permitido , facultativo ou obrigatório .
	*/
	
	public static void main(String[] args) {
		
		Scanner escolher = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		int idadeInformada = escolher.nextInt();
		
		if(idadeInformada < 16) {
			System.out.println("Não permitido");
		}else if((idadeInformada >= 16 && idadeInformada <= 17) || (idadeInformada > 70)) {
			System.out.println("Facultativo");
		}else if(idadeInformada >= 18 && idadeInformada <= 70) {
			System.out.println("Obrigatorio");
		}else {
			System.out.println("Idade invalida!");
		}
	}
}
