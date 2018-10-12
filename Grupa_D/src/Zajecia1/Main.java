package Zajecia1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("sdfsdfsdf");
        //zmienna napis
        String napis1 = "to jest jaki� napis";
        System.out.println(napis1);

        String haslo1 = "0123";

        //kolejna zmienna z napisem
        String napis2 = " Kolejny napis";
        System.out.println(napis2);
        String napisRazem = napis1 + napis2;
        System.out.println(napisRazem);

        int liczba0;
        int liczba1 = 10, liczba2 = 20;

        System.out.println(liczba1 + liczba2);
        System.out.println("byle co " + napis1 + " " + (liczba1 + liczba2));
/*
komentarz
wielolinijkowy
 */
        boolean czyZawiera = napis1.contains("asdasd");
        boolean czyWieksze = 10 >= 7;
        //boolean czylibczyrowne = 10 == 110;

        if (czyWieksze) {
            System.out.println("Jest wieksze");
        } else {
            System.out.printf("Jest mniejsze");
        }

        //warunek logiczny if ( jest warunek)
        //! - negacja czyli odwr�cenie warunku
        //&& - AND - obie strony musz� by� prawdziwe
        //|| - OR - jeden z warunk�w musi by� prawdziwy

        if (!(2 == 2) && napis2.equals(" Kolejny napis")) {
            System.out.println("tak to jest prawda");

        } else if (czyWieksze || 10 < 5) {
            System.out.println("Wykonanie Or'a logicznego");
        } else {
            System.out.println("To nie jest prawda");
        }

        //Stworzenie strumienia do wczytania tekstu z konsoli
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // odbieranie wpisanego tekstu
        String napis3 = br.readLine();
        System.out.println(napis1 + " " + napis2 + " " + napis3);

    }
}
