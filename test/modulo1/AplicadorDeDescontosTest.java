package modulo1;

import java.util.ArrayList;
import java.util.List;

import modulo1.exercicio.desconto.AplicadorDeDescontos;
import modulo1.exercicio.desconto.Compra;
import modulo1.exercicio.desconto.Item;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AplicadorDeDescontosTest {

	private AplicadorDeDescontos a;
	private Compra c;

	@Before
	public void before() {
		a = new AplicadorDeDescontos();
	}

	// * descontoPorProduto
	// compra null
	// not xbox not macbook not iphone => not desconto
	// macbook ^ iphone => 0.15
	// notebook ^ windows phone => 0.12
	// xbox => 0.7

	@Test(expected = Exception.class)
	public void descontoPorProdutoNull() {
		a.aplica(c);
	}

	@Test
	public void descontoPorProdutoNotBoxNotMacbook() {

	}

	@Test
	public void descontoPorProdutoMacbookAndIphone() {
		c = new CompraBuilder().com("MACBOOK", 100).com("IPHONE", 100).build();

		a.aplica(c);

		Assert.assertEquals(200 - 200 * 0.15, c.getValorLiquido(), 0000.1);
	}

	@Test
	public void descontoPorProdutoNotebookAndWindowsPhone() {
		c = new CompraBuilder().com("NOTEBOOK", 100).com("WINDOWS PHONE", 100)
				.build();

		a.aplica(c);

		Assert.assertEquals(200 - 200 * 0.12, c.getValorLiquido(), 0000.1);
	}

	@Test
	public void descontoPorProdutoXbox() {
		c = new CompraBuilder().com("XBOX", 100).build();

		a.aplica(c);

		Assert.assertEquals(100 - 100 * 0.7, c.getValorLiquido(), 0000.1);
	}
}
