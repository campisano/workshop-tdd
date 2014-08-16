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
		p = Periodo.DIARIA;

		s = g.gera(1, 5, p);

		Assert.assertEquals(5, s.size());
		Assert.assertEquals(1, s.get(0).getNumero());
		Assert.assertEquals(2, s.get(1).getNumero());
		Assert.assertEquals(3, s.get(2).getNumero());
		Assert.assertEquals(4, s.get(3).getNumero());
		Assert.assertEquals(5, s.get(4).getNumero());
	}

	@Test
	public void periodoSemanalInicioIgualFim() {
		p = Periodo.SEMANAL;

		s = g.gera(1, 1, p);

		Assert.assertEquals(1, s.size());
		Assert.assertEquals(1, s.get(0).getNumero());
	}

	@Test
	public void periodoSemanalNormal() {
		p = Periodo.SEMANAL;

		s = g.gera(1, 30, p);

		Assert.assertEquals(5, s.size());
		Assert.assertEquals(1, s.get(0).getNumero());
		Assert.assertEquals(8, s.get(1).getNumero());
		Assert.assertEquals(15, s.get(2).getNumero());
		Assert.assertEquals(22, s.get(3).getNumero());
		Assert.assertEquals(29, s.get(4).getNumero());
	}
}
