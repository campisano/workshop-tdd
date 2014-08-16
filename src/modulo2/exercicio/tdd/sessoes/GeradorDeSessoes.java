package modulo2.exercicio.tdd.sessoes;

import java.util.ArrayList;
import java.util.List;

public class GeradorDeSessoes {

	public List<Sessao> gera(int inicio, int fim, Periodo periodo) {
		ArrayList<Sessao> a = new ArrayList<Sessao>();

		a.add(new Sessao(inicio));

		return a;
	}
}
