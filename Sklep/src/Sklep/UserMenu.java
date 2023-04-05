package Sklep;

import java.util.Scanner;

public class UserMenu {
	public static void pokazmenu() {
		System.out.println("\n Wybierz produkt ktorego chcesz kupic:");
		System.out.println("Kup Produkt:");
		System.out.println("\n Banan \n Orannada \n Arbuz \n Jablko");
		@SuppressWarnings("resource")
		Scanner produkty = new Scanner(System.in);
		String produkt = produkty.nextLine();
		produkt b = new produkt("Banan ", 3);
		produkt o = new produkt("Oranzada ", 4);
		produkt a = new produkt("Arbuz ", 5);
		produkt j = new produkt("Jablko ", 1);

		if ("Banan".equals(produkt)) {
			System.out.printf("Kupi�e�/a� " + b.getnazwa() + "o warto�ci " + b.getcena() + "zl");
		}
		// else if ("Tak".equals(produkt)) {
		// System.out.println("Kupiony");
		// }
		// else {
		// System.out.println("Nie kupiony");
		// }
		else if ("Oranzada".equals(produkt)) {
			System.out.printf("Kupi�e�/a� " + o.getnazwa() + "o wartosci " + o.getcena() + "zl");
		} else if ("Arbuz".equals(produkt)) {
			System.out.printf("Kupi�e�/a� " + a.getnazwa() + "o wartosci " + a.getcena() + "zl");
		} else if ("Jablko".equals(produkt)) {
			System.out.printf("Kupi�e�/a� " + j.getnazwa() + "o wartosci " + j.getcena() + "zl");
		} else {
			System.out.println("Nie posiadamy takiego produktu! Przepraszamy!");
		}

	}
}
