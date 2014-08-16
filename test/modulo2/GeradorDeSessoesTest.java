package modulo2;

import java.util.List;

import modulo2.exercicio.tdd.sessoes.GeradorDeSessoes;
import modulo2.exercicio.tdd.sessoes.Periodo;
import modulo2.exercicio.tdd.sessoes.Sessao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GeradorDeSessoesTest {

	private GeradorDeSessoes g;
	private Periodo p;
	private List<Sessao> s;

	// dado inicio, fim e periodicidade, retorna uma lista de inteiro
	// intervalos limites inclusivos
	// test first
	// intervalos: diários e semanais

	@Before
	public void before() {
		g = new GeradorDeSessoes();
	}

	@Test
	public void periodoDiarioInicioIgualFim() {
		p = Periodo.DIARIA;

		s = g.gera(1, 1, p);

		Assert.assertEquals(1, s.size());
		Assert.assertEquals(1, s.get(0).getNumero());
	}

	@Test
	public void periodoDiarioNormal() {

	}

	@Test
	public void periodoDiarioIntervalosNegativos() {

	}

	@Test
	public void periodoDiarioIntervalosInvertidos() {

	}
}
