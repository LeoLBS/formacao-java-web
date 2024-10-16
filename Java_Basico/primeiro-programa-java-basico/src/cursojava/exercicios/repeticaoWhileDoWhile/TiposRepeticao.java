package cursojava.exercicios.repeticaoWhileDoWhile;

public class TiposRepeticao {
	
	public void utilizandoWhile() {
		
		/*Estrutura de repetição com while*/
		
		int condicao = 20;
		
		while(condicao >= 10) {   // O mesmo vai verificar e repetir o bloco de codigos enquanto a condição for verdadeira!
			
			System.out.println("Numero 1: " + condicao + " (While)");
			
			condicao = condicao - 5;
		}
	}
	
	public void utilizandoDoWhile() {
		
		/*Estrutura de repetição com do while*/
		
		int condicao = 5;
		
		do {  // O mesmo vai executar pelo menos uma vez antes de verificar a condição!
			
			System.out.println("Numero 2: " + condicao + " (Do While)");
			
			
		}while(condicao >= 10);
	}
	
	public void utilizandoFor() {
		
		/*Estrutura de repetição com for*/
		
		for(int numeroX = 0; numeroX <= 5; numeroX++) {  // O mesmo vai executar enquanto a condição for verdadeira, assim definimos o número de vezes
			System.out.println("Numero agora é: " + numeroX + " (For)");
		}
	}
	
	public void utilizandoBreakFor() {
		
		/*Estrutura de repetição com break no for*/
		
		for(int numeroX = 0; numeroX <= 10; numeroX++) {  // O mesmo vai executar enquanto a condição for verdadeira, assim definimos o número de vezes
			if(numeroX == 4) {
				System.out.println("Numero foi encontrado que é: " + numeroX + " parando o programa (Break For)");
				break;
			}
		}
		
	}
}
