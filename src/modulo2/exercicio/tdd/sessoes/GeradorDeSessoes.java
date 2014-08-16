package modulo2.exercicio.tdd.sessoes;

import java.util.ArrayList;
import java.util.List;

public class GeradorDeSessoes {

	public List<Sessao> gera(int inicio, int fim, Periodo periodo)
			throws Exception {

		if (fim < inicio) {
			throw new IllegalArgumentException(
					"Fim não pode ser menor que inicio");
		}

		if (periodo == null) {
			throw new IllegalArgumentException("Periodo não pode ser nulo");
		}

		ArrayList<Sessao> a = new ArrayList<Sessao>();

		for (int i = inicio; i <= fim; i += periodo.getTamanho()) {
			a.add(new Sessao(i));
		}

		return a;
	}
}
