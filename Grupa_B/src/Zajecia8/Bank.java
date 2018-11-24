package Zajecia8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bank {
    public static void main(String[] args) throws Exception {

        BufferedReader wczytanyTekst = new BufferedReader(
                new InputStreamReader(System.in));
        String haslo = "1234";

        System.out.println("Witaj w bankomacie podaj pin");
        String podanyPin = wczytanyTekst.readLine();

        boolean run = true;
        if (haslo.equals(podanyPin)) {
            System.out.println("Hasło poprawne");
            int stanKonta = 200;

            while (run) {
                System.out.println("Wybierz opcje:");
                System.out.println("Opcje:");
                System.out.println(" 1.Stan konta");
                System.out.println(" 2.Wpłać");
                System.out.println(" 3.Wypłać");
                System.out.println(" 4.Wyjscie");

                String opcja = wczytanyTekst.readLine();
                switch (opcja) {
                    case "1": {
                        System.out.println("Twój stan konta to: " + stanKonta);
                        break;
                    }
                    case "2": {
                        System.out.println("Podaj kwote do wypłacenia:");
                        int wyplata = Integer.parseInt(wczytanyTekst.readLine());

                        if (stanKonta < wyplata) {
                            System.out.println("Jesteś biedny");
                        } else {
                            stanKonta = stanKonta - wyplata;
                            System.out.println("Wypłacono pomyslnie");
                        }
                        break;
                    }
                    case "3": {
                        System.out.println("Podaj kwote: ");
                        int wplata = Integer.parseInt(wczytanyTekst.readLine());
                        stanKonta = stanKonta + wplata;
                        System.out.println("Pomyślnie wpłacono");
                        break;
                    }
                    case "4": {
                        System.out.println("Miłego dnia.");
                        run = false;
                        break;
                    }
                    default: {
                        System.out.println("Nie ma takiej opcji");
                    }
                }
                Thread.sleep(2000);
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); // to są entery

            }

        } else {
            System.out.println("Zły pin, do widzienia!");
        }

    }
}
