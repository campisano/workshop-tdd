package modulo2;

import java.util.List;

import modulo2.exercicio.tdd.sessoes.Periodo;
import modulo2.exercicio.tdd.sessoes.Sessao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GeradorDeSessoesTest {

	private List<Sessao> s;

	// dado inicio, fim e periodicidade, retorna uma lista de inteiro
	// intervalos limites inclusivos
	// test first
	// intervalos: diários e semanais

	@Before
	public void before() {
		s = null;
	}

	@Test
	public void periodoDiarioInicioIgualFim() {
		s = new SessoesBuilder().gera(1, Periodo.DIARIA);

		Assert.assertEquals(1, s.size());
		Assert.assertEquals(1, s.get(0).getNumero());
	}

	@Test
	public void periodoDiarioNormal() {
		s = new SessoesBuilder().gera(5, Periodo.DIARIA);

		Assert.assertEquals(5, s.size());
		Assert.assertEquals(1, s.get(0).getNumero());
		Assert.assertEquals(2, s.get(1).getNumero());
		Assert.assertEquals(3, s.get(2).getNumero());
		Assert.assertEquals(4, s.get(3).getNumero());
		Assert.assertEquals(5, s.get(4).getNumero());
	}

	@Test
	public void periodoSemanalInicioIgualFim() {
		s = new SessoesBuilder().gera(1, Periodo.SEMANAL);

		Assert.assertEquals(1, s.size());
		Assert.assertEquals(1, s.get(0).getNumero());
	}

	@Test
	public void periodoSemanalNormal() {
		s = new SessoesBuilder().gera(30, Periodo.SEMANAL);

		Assert.assertEquals(5, s.size());
		Assert.assertEquals(1, s.get(0).getNumero());
		Assert.assertEquals(8, s.get(1).getNumero());
		Assert.assertEquals(15, s.get(2).getNumero());
		Assert.assertEquals(22, s.get(3).getNumero());
		Assert.assertEquals(29, s.get(4).getNumero());
	}
}
