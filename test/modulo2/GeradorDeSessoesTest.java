package modulo2;

import java.util.List;

import modulo2.exercicio.tdd.sessoes.GeradorDeSessoes;
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
	public void periodoDiarioInicioIgualFim() throws Exception {
		s = gera(1, Periodo.DIARIA);

		assertSessoes(s, 1);
	}

	@Test
	public void periodoDiarioNormal() throws Exception {
		s = gera(5, Periodo.DIARIA);

		assertSessoes(s, 1, 2, 3, 4, 5);
	}

	@Test
	public void periodoSemanalInicioIgualFim() throws Exception {
		s = gera(1, Periodo.SEMANAL);

		assertSessoes(s, 1);
	}

	@Test
	public void periodoSemanalNormal() throws Exception {
		s = gera(30, Periodo.SEMANAL);

		assertSessoes(s, 1, 8, 15, 22, 29);
	}

	@Test(expected = IllegalArgumentException.class)
	public void intervaloInvalidoToException() throws Exception {
		s = gera(30, 1, Periodo.SEMANAL);
	}

	@Test(expected = IllegalArgumentException.class)
	public void intervaloPeriodoNuloToException() throws Exception {
		s = gera(1, null);
	}

	// private method

	private List<Sessao> gera(int fim, Periodo periodo) throws Exception {

		return new GeradorDeSessoes().gera(1, fim, periodo);
	}

	private List<Sessao> gera(int inicio, int fim, Periodo periodo)
			throws Exception {
		return new GeradorDeSessoes().gera(inicio, fim, periodo);
	}

	private void assertSessoes(List<Sessao> resultado, int... nums) {
		Assert.assertEquals(nums.length, resultado.size());

		for (int i = 0; i < resultado.size(); i++) {
			Assert.assertEquals(nums[i], resultado.get(i).getNumero());
		}
	}
}
