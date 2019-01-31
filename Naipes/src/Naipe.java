
public class Naipe {
	private Palo palo;
	private int rango;
	private Id id;

	public Naipe(Palo palo, int rango, Id id) {
		this.palo = palo;
		this.rango = rango;
		this.id = id;
	}

	public Palo getPalo() {
		return palo;
	}

	public int getRango() {
		return rango;
	}

	public void setRango(int rango) {
		this.rango = rango;
	}

	public Id getId() {
		return id;
	}
}
