package cursojava.exercicios;

import cursojava.exercicios.tipoSWITCHandCASE.TipoComandoSwitchCase;
import cursojava.exercicios.tiposIFandELSE.TiposOperadores;

public class PrimeiraClasseJava {
	public static void main(String[] args) {
		
		TiposOperadores tipoOperadores = new TiposOperadores();
		TipoComandoSwitchCase tipoComandoSwitchCase = new TipoComandoSwitchCase();
		
		tipoOperadores.operadoresIFeELSE();
		tipoOperadores.operadoresAninhados();
		tipoOperadores.operadoresTernarios();
		
		
		tipoComandoSwitchCase.utilizandoSwitchCase();
	}
}
