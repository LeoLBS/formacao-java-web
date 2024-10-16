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
		
		int condicao = 5;
		
		do {  // O mesmo vai executar pelo menos uma vez antes de verificar a condição!
			
			System.out.println("Numero 2: " + condicao + " (Do While)");
			
			
		}while(condicao >= 10);
	}
}
