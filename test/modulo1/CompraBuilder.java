package modulo1;

import java.util.ArrayList;
import java.util.List;

import modulo1.exercicio.desconto.Compra;
import modulo1.exercicio.desconto.Item;

public class CompraBuilder {

	private List<Item> items;

	public CompraBuilder() {
		items = new ArrayList<Item>();
	}

	public CompraBuilder com(String name, double price) {
		items.add(new Item(name, 1, price));

		return this;
	}

	public Compra build() {
		return new Compra(items);
	}
}
