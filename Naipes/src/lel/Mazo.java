package lel;

import java.util.ArrayList;
import java.util.Random;

public class Mazo {

	private static final Random r = new Random();

	protected ArrayList<Naipe> naipes = new ArrayList<Naipe>();

	public void add(Naipe n) {
		naipes.add(n);
	}

	public void add(Mazo m) {
		naipes.addAll(m.naipes);
	}

	public int numeroNaipes() {
		return naipes.size();
	}

	public Naipe getNaipe() {
		if (naipes.isEmpty())
			return null;
		int i = r.nextInt(naipes.size());
		Naipe n = naipes.get(i);
		naipes.remove(i);
		return n;
	}
}