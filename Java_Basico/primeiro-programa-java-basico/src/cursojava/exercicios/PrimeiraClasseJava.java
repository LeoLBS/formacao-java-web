package cursojava.exercicios;

import cursojava.exercicios.repeticaoWhileDoWhile.TiposRepeticao;
import cursojava.exercicios.tipoSWITCHandCASE.TipoComandoSwitchCase;
import cursojava.exercicios.tiposIFandELSE.TiposOperadores;

public class PrimeiraClasseJava {
	public static void main(String[] args) {
		
		TiposOperadores tipoOperadores = new TiposOperadores();
		TipoComandoSwitchCase tipoComandoSwitchCase = new TipoComandoSwitchCase();
		TiposRepeticao tipoRepeticao = new TiposRepeticao();
		
		tipoOperadores.operadoresIFeELSE();
		tipoOperadores.operadoresAninhados();
		tipoOperadores.operadoresTernarios();
		
		
		tipoComandoSwitchCase.utilizandoSwitchCase();
		
		tipoRepeticao.utilizandoWhile();
		tipoRepeticao.utilizandoDoWhile();
	}
}
