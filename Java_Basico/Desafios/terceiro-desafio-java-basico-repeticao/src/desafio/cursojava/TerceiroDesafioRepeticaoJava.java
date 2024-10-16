package desafio.cursojava;

import javax.swing.JOptionPane;

public class TerceiroDesafioRepeticaoJava {
	
	/*Desafio 3 Repetir Pergunta com do-while*/
	
	/*
	 *Passo a Passo:
		
		Definir a Senha Correta:

		- Defina a senha correta em uma variável (ex.: "1234").
		
		Configuração do Laço:

		- Use do-while para solicitar a senha com JOptionPane.showInputDialog().
		- Se a senha inserida for incorreta, exiba uma mensagem avisando.
		
		Mensagem de Sucesso:

		- Quando o usuário inserir a senha correta, exiba "Acesso Permitido!" com JOptionPane.showMessageDialog().
	 */
	
	public static void main(String[] args) {
		
		int senhaSistema = 1453;
		int senhaUsuario = 0;
		
		do {
			
			String senhaUsuarioString = JOptionPane.showInputDialog(null, "Informe a senha numerica do sistema: ");
			
			senhaUsuario = Integer.parseInt(senhaUsuarioString);
			
			if(senhaUsuario != senhaSistema) {
				JOptionPane.showMessageDialog(null, "Acesso Negado, tente novamente!");
			}
			
		}while(senhaUsuario != senhaSistema);
		
		JOptionPane.showMessageDialog(null, "Acesso Permitido!");
	}
}
