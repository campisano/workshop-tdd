package modulo2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import modulo2.exercicio.mocks.Fatura;

public class FaturaBuilder {

	private List<Fatura> faturas;

	public FaturaBuilder() {
		faturas = new ArrayList<Fatura>();
	}

	public FaturaBuilder add(double valor) {
		faturas.add(new Fatura(Calendar.getInstance(), "", valor));

		return this;
	}

	public FaturaBuilder add(String cliente) {
		faturas.add(new Fatura(Calendar.getInstance(), cliente, 100));

		return this;
	}

	public FaturaBuilder add(String cliente, double valor) {
		faturas.add(new Fatura(Calendar.getInstance(), cliente, valor));

		return this;
	}

	public List<Fatura> all() {
		return faturas;
	}
}
