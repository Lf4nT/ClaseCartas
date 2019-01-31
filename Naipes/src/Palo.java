
public enum Palo {
	PICAS('\u2660'), TREBOLES('\u2663'), DIAMANTES('\u2665'), CORAZONES('\u2666');

	private char simbolo;

	private Palo(char simbolo) {
		this.simbolo = simbolo;
	}

	public char getSimbolo() {
		return simbolo;
	}
}
