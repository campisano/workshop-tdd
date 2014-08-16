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

	@Test
	public void descontoPorProdutoNull() {

	}

	@Test
	public void descontoPorProdutoNotBoxNotMacbook() {

	}

	@Test
	public void descontoPorProdutoMacbookAndIphone() {

	}

	@Test
	public void descontoPorProdutoNotebookAndWindows() {

	}

	@Test
	public void descontoPorProdutoXbox() {
		List<Item> l = new ArrayList<Item>();
		l.add(new Item("XBOX", 1, 100.0));
		c = new Compra(l);

		a.aplica(c);

		Assert.assertEquals(100 - 100 * 0.7, c.getValorLiquido(), 0000.1);
	}
}
