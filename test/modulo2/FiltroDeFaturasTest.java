package modulo2;

import java.util.List;

import modulo2.exercicio.mocks.Fatura;
import modulo2.exercicio.mocks.FiltroDeFaturas;
import modulo2.exercicio.mocks.RepositorioDeFaturas;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class FiltroDeFaturasTest {

	private RepositorioDeFaturas repo;
	private FiltroDeFaturas filtro;
	private List<Fatura> faturas;

	@Before
	public void begin() {
		repo = Mockito.mock(RepositorioDeFaturas.class);
		filtro = new FiltroDeFaturas(repo);
		faturas = null;
	}

	/*
	 * 
	 * if (fatura.getValor() > 2000) filtradas.add(fatura); else if
	 * (fatura.getValor() < 2000 && fatura.getCliente().equals("MICROSOFT"))
	 * filtradas.add(fatura); else if (fatura.getData().get(Calendar.YEAR) <
	 * 1999) filtradas.add(fatura);
	 */

	@Test
	public void filtraValoresMaioresQue2000() {
		Mockito.when(repo.todas()).thenReturn(
				new FaturaBuilder().add(1000).add(2000).add(3000).all());

		faturas = filtro.filtra();

		Assert.assertEquals(1, faturas.size());
		Assert.assertEquals(3000, faturas.get(0).getValor(), 0.001);
	}
}
