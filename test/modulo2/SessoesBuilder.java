package modulo2;

import java.util.List;

import modulo2.exercicio.tdd.sessoes.GeradorDeSessoes;
import modulo2.exercicio.tdd.sessoes.Periodo;
import modulo2.exercicio.tdd.sessoes.Sessao;

public class SessoesBuilder {

	public List<Sessao> gera(int fim, Periodo periodo) {

		return new GeradorDeSessoes().gera(1, fim, periodo);
	}

	public List<Sessao> gera(int inicio, int fim, Periodo periodo) {
		return new GeradorDeSessoes().gera(inicio, fim, periodo);
	}
}
