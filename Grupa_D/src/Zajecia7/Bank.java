package Zajecia7;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bank {
    public static void main(String[] args) throws Exception {
        BufferedReader konsola = new BufferedReader(new InputStreamReader(System.in));
        String pin = "5432";

        System.out.println("Witaj w bankomacie, podaj pin:");
        String podanyPin = konsola.readLine();

        if (pin.equals(podanyPin)) {
            /*
            1.Stan konta
            2.Wpłać
            3.Wypłać
            4.Wyjście
             */
            boolean wyjsice = true;
            int stanKonta = 100;
            while (wyjsice) {
                System.out.println("*************************");
                System.out.println("*Opcje:\t\t\t\t\t*");
                System.out.println("*\t1)Stan konta\t\t*\n*\t2)Wpłać\t\t\t\t*");
                System.out.println("*\t3)Wypłać\t\t    *\n*\t4)Wyjście   \t\t*");
                System.out.println("*************************");

                System.out.print("Wybierz opcje: ");
                String opcja = konsola.readLine();

                switch (opcja) {
                    case "1": {
                        System.out.println("Twój stan konta :" + stanKonta);
                        break;
                    }
                    case "2": {
                        System.out.println("Podaj kwote ile chcesz wpłacić:");
                        String wplataNapis = konsola.readLine();

                        if (wplataNapis.isEmpty()) {
                            System.out.println("Błędna ilość");
                        } else {
                            int wplata = Integer.parseInt(wplataNapis);
                            stanKonta += wplata;
                            System.out.println("Wpłacono pomyślnie");
                        }
                        break;
                    }
                    case "3": {
                        System.out.println("Podaj kwote ile chcesz wypłacić:");
                        String wyplataNapis = konsola.readLine();

                        if (wyplataNapis.isEmpty()) {
                            System.out.println("Błędna ilość");
                        } else {
                            int wyplata = Integer.parseInt(wyplataNapis);

                            if (wyplata > stanKonta) {
                                System.out.println("Nie masz tyle pieniędz");
                            } else {
                                stanKonta -= wyplata;
                                System.out.println("Wypłacono pomyślnie");
                            }
                        }
                        break;
                    }
                    case "4": {
                        System.out.println("Miłego dnia");
                        wyjsice = false;
                        break;
                    }
                    default: {
                        System.out.println("Nie ma takiej opcji");
                    }
                }

                Thread.sleep(2000);//zatrzymanie programu na 2 sekundy
                System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n");
            }

        } else {
            System.out.println("Zły pin, Do widzenia");
        }
    }


}
