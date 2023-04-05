package Sklep;

import java.util.Scanner;

public class AdminMenu {
	/**
	 * 
	 */
	public static void pokazmenu() {
		System.out.println("Options:");
		System.out.println("1: Dodaj produkt:");
		System.out.println("2: Usun produkt:");
		System.out.println("3: Zmien produkt:");
		char wybor;
		Scanner wybory = new Scanner(System.in);
		wybor = wybory.nextLine().charAt(0);
		do {

			switch (wybor) {
				case '1':
					options.dodaj();
					break;

				case '2':
					options.usun();
					break;

				case '3':
					// options.zmien();
					break;
			}
		} while (wybor != '3');
		wybory.close();

	}
}
