package Sklep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sklep {
    public static void main(String[] args) {
        Passy passy = new Passy("tomek", "tomek");
        Passy admin = new Passy("admin", "admin");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        String login, haslo;
        while (true) {
            try {
                System.out.println("\nPodaj login: ");
                login = bf.readLine();
                System.out.println("Podaj has�o: ");
                haslo = bf.readLine();
                if (login.equals(passy.login) && haslo.equals(passy.haslo)) {
                    System.out.println("Poprawne dane. Zostales zalogowany.");
                    UserMenu.pokazmenu();
                    continue;
                } else if (login.equals(admin.login) && haslo.equals(admin.haslo)) {
                    System.out.println("Poprawne dane:");
                    AdminMenu.pokazmenu();
                    continue;

                } else {
                    System.out.println("Login lub haslo jest bledne. Sprubuj jeszcze raz!\n");
                    continue;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}