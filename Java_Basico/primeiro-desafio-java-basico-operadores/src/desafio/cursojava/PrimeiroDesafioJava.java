package desafio.cursojava;

import java.util.Scanner;

public class PrimeiroDesafioJava {
	
	/*Desafio 1 Verifique se um Número é Par ou Ímpar*/
	
	/*
	 * Objetivo:

		- Usar operadores aritméticos e uma estrutura if-else para verificar se um número é divisível por 2 (par) ou não (ímpar).
		
		- Dica: Utilize o módulo de operação (%) , que retorna o resto da divisão . Se o resto for 0, o número é par.
		
		Passo a Passo:

		- Peça um número ao usuário.
		- Use if para verificar se o número dividido por 2 tem resto igual a 0 .
		- Se sim, mostre que o número é par, caso contrário, é ímpar.
	 */
	
	
	public static void main(String[] args) {
		
		Scanner receber = new Scanner(System.in);
		
		System.out.println("Escolha um número inteiro para verificar se é par ou impar: ");
		int numeroEscolhido = receber.nextInt();
		
		if((numeroEscolhido % 2) == 0) {
			System.out.println("Número escolhido " + numeroEscolhido + " é par!");
		}
		else {
			System.out.println("Número escolhido " + numeroEscolhido + " é impar!");
		}
	}
}
