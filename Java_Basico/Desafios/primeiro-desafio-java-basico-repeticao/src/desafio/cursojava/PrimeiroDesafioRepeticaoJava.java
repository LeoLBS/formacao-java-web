package desafio.cursojava;

import javax.swing.JOptionPane;

public class PrimeiroDesafioRepeticaoJava {
	
	/*Desafio 1 Implementar uma Tabuada*/
	
	
	/*
	 *Passo a Passo:
		Entrada de Dados:

		- Use o JOptionPane.showInputDialog() para pedir ao usuário um número.
		- Converta uma entrada para int usando Integer.parseInt().
		
		Configuração do Laço:

		- Utilize um laço for para iterar de 1 a 10 e calcular o resultado da multiplicação.
		
		Exposição do Resultado:

		- Exiba cada linha da tabuada com JOptionPane.showMessageDialog(). 
		*/
	
	public static void main(String[] args) {
		
		String numeroUsuarioString = JOptionPane.showInputDialog(null, "Escolha um número inteiro para a multiplicação!");
		
		int numeroUsuario = Integer.parseInt(numeroUsuarioString);
		
		for(int i=1; i <=10; i++) {
			int numeroMultiplicado = numeroUsuario * i;
			
			JOptionPane.showMessageDialog(null, "Número " + numeroUsuario + " multiplicado por " + i + " é igual a: " + numeroMultiplicado);
		}
		
		JOptionPane.showMessageDialog(null, "Fim da tabuada!");
	}
}


