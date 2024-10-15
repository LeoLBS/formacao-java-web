package desafio.cursojava;

import java.util.Scanner;

public class SegundoDesafioJava {

	/* Desafio 2 Verifique a Faixa Etária*/
	
	/*
	 * Objetivo:

		- Use if-else-if para categorizar a idade da pessoa.
		- Você vai precisar definir intervalos de idade , por exemplo:
			Menor que 13 anos: criança.
			Entre 13 e 17 anos: adolescente.
			Entre 18 e 59 anos: adulto.
		60 anos ou mais: idoso.
		
		Passo a Passo:

		- Peça a idade do usuário.
		- Use if-else-ifpara verificar cada intervalo de idade.
		- Exiba uma mensagem correspondente à categoria.
*/
	
	
	public static void main(String[] args) {
		
		Scanner receber = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		int idadeInformada = receber.nextInt();
		
		if(idadeInformada < 13) {
			System.out.println("Você é uma criança!");
		}
		else if(idadeInformada >= 13 && idadeInformada <= 17) {
			System.out.println("Você é um adolecente!");
		}
		else if(idadeInformada >= 18 && idadeInformada <= 59) {
			System.out.println("Você é um adulto!");
		}
		else if(idadeInformada >= 60) {
			System.out.println("Você é um idoso");
		}
		else {
			System.out.println("Idade invalida!!");
		}
		
	}
}
