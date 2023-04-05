package Sklep;

import java.util.Scanner;

public class options {

	public static void dodaj() {
		String nazwa;
		int cena;
		@SuppressWarnings("resource")
		Scanner odczytuj = new Scanner(System.in);
		System.out.println("Nazwa produktu:");
		nazwa = odczytuj.nextLine();
		System.out.println("Cena:");
		cena = odczytuj.nextInt();
		System.out.println(nazwa + " o wartosci " + cena + "zl" + " zostal dodany do bazy");

		/*
		 * while(options.dodaj()) {
		 * try {
		 * String nazwa;
		 * int cena;
		 * 
		 * @SuppressWarnings("resource")
		 * Scanner odczytuj = new Scanner(System.in);
		 * nazwa = odczytuj.nextLine();
		 * System.out.println("Nazwa produktu:");
		 * cena = odczytuj.nextInt();
		 * System.out.println("Cena:");
		 * if (nazwa != null) {
		 * //if (nazwa != ListyProdukty.PobierzProdukty()) {
		 * System.out.println(nazwa + " o warto�ci " + cena + "z�" +
		 * " zosta� dodany do bazy");
		 * } else {
		 * System.out.println("Istnieje taki produkt");
		 * }
		 * } finally {
		 * }
		 * }
		 * return false;
		 * }
		 */
	}

	public static void usun() {
		String nazwa;
		@SuppressWarnings("resource")
		Scanner odczytuj = new Scanner(System.in);
		System.out.println("Nazwa produktu:");
		nazwa = odczytuj.nextLine();
		System.out.println(nazwa + " zostal usuniuty z bazy");

	}
}
