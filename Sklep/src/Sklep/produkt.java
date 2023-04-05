package Sklep;

public class produkt {
	String nazwa;
	// String opis;
	int cena;

	public produkt(String nazwa, int cena) {
		this.nazwa = nazwa;
		// this.opis = opis;
		this.cena = cena;

	}

	public String getnazwa() {
		return nazwa;
	}

	/*
	 * public String getopis() {
	 * return opis;
	 * }
	 */
	public int getcena() {
		return cena;
	}
}