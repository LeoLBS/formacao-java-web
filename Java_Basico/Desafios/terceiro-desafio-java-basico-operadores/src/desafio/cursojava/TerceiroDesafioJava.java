package desafio.cursojava;

import java.util.Scanner;

public class TerceiroDesafioJava {
	
	/*Desafio 3 Implementar um Menu de Opções Simples*/
	
	/*
	 * Objetivo:
			- Crie um menu interativo onde o usuário escolhe uma opção.
			- Utilize o switch-case para controlar as ações baseadas na escolha do usuário.
			
			Passo a Passo:

			- Exiba um menu com opções para o usuário (por exemplo: somar, subtrair, multiplicar e dividir).
			- Peça para o usuário digitar o número da opção escolhida .
			- Use switch-case para realizar a ação correspondente.
				Dentro de cada case, peça dois números e realize a operação desejada.
			- Não se esqueça de adicionar um default para tratar opções inválidas.
	 */
	
	public static void main(String[] args) {
		
		Scanner receber = new Scanner(System.in);
		
		double numero1;
		double numero2;
		
		System.out.println("Escolha uma opção: 1 - Somar, 2 - Subtrair, 3 - Multiplicar e 4 - Dividir");
		int escolhaNumero = receber.nextInt();
		
		switch(escolhaNumero) {
		
			case 1:
				System.out.println("Escolha o primeiro número: ");
				numero1 = receber.nextDouble();
				System.out.println("Escolha o segundo número: ");
				numero2 = receber.nextDouble();
				
				System.out.println("Soma dos dois números: " + (numero1 + numero2));
			break;
			case 2:
				System.out.println("Escolha o primeiro número: ");
				numero1 = receber.nextDouble();
				System.out.println("Escolha o segundo número: ");
				numero2 = receber.nextDouble();
				
				System.out.println("Subtração dos dois números: " + (numero1 - numero2));
			break;
			case 3:
				System.out.println("Escolha o primeiro número: ");
				numero1 = receber.nextDouble();
				System.out.println("Escolha o segundo número: ");
				numero2 = receber.nextDouble();
				
				System.out.println("Multiplicação dos dois números: " + (numero1 * numero2));
			break;
			case 4:
				System.out.println("Escolha o primeiro número: ");
				numero1 = receber.nextDouble();
				System.out.println("Escolha o segundo número: ");
				numero2 = receber.nextDouble();
				
				System.out.println("Divisao dos dois números: " + (numero1 / numero2));
			break;
			default:
				System.out.println("Opção invalida!");
			break;
		}
	}
}
