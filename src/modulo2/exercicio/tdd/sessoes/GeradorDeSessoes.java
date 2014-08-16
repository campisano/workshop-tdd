package modulo2.exercicio.tdd.sessoes;

import java.util.ArrayList;
import java.util.List;

public class GeradorDeSessoes {

	public List<Sessao> gera(int inicio, int fim, Periodo periodo) {
		ArrayList<Sessao> a = new ArrayList<Sessao>();

		for (int i = inicio; i <= fim; i += periodo.getTamanho()) {
			a.add(new Sessao(i));
		}

		return a;
	}
}
