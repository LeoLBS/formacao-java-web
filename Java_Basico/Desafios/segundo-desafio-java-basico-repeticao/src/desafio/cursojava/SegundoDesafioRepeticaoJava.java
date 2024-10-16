package desafio.cursojava;

import javax.swing.JOptionPane;

public class SegundoDesafioRepeticaoJava {

	/*Desafio 2 Somar Números com while*/
	
	/*
	 * Passo a Passo:
		
		Inicialização:

		- Crie uma variável para armazenar a soma total.
		- Use JOptionPane.showInputDialog() para pedir um número inicial ao usuário e converta para int.
		
		Laço while:

		- Continue pedindo números até que o usuário insira 0.
		- Adicione o número inserido à soma total.
		
		Exibição da Soma:

		- Ao final do laço, exiba o total com JOptionPane.showMessageDialog().
		*/
	
	public static void main(String[] args) {
		
		int somaTotal = 0;
		
		String numeroUsuarioString = JOptionPane.showInputDialog(null,"Informe um número inteiro: ");
		
		int numeroUsuario = Integer.parseInt(numeroUsuarioString);
		
		somaTotal = somaTotal + numeroUsuario;
		
		while(numeroUsuario != 0) {
			
			numeroUsuarioString = JOptionPane.showInputDialog(null,"Informe um número inteiro: ");
			
			numeroUsuario = Integer.parseInt(numeroUsuarioString);
			
			somaTotal = somaTotal + numeroUsuario;
		}
		
		JOptionPane.showMessageDialog(null, "A soma total de números informados foi de: " + somaTotal);
	}
}
