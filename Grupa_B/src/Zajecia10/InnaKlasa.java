package Zajecia10;

import java.io.FileInputStream;
import java.io.FileWriter;

public class InnaKlasa {
    public static String jakasWartosc = "Cosss";

    public static void main2(String[] args) {
        Okno okno1 = new Okno();
        Okno okno2; //Deklaracja
        okno2 = new Okno(); //Inicjalizacja

        System.out.println(okno1.material);
        System.out.println(okno1.iloscKlame);

        okno2.iloscKlame = 2;
        okno2.material = "Drewno";
        System.out.println(okno2.material);
        System.out.println(okno2.iloscKlame);

        okno1.OtworzOkno();
        okno2.OtworzOkno();
        System.out.println(jakasWartosc);


    }

    public static void main(String[] args) {
        //main2(args);
        Silnik s2 = new Silnik();
        s2.pojemnosc = 1.4;
        s2.KM = 140;

        Samochod vw = new Samochod();
        vw.kolor = "Zielony";
        vw.IloscDrzwi = 5;
        //vw.silnik = s2;
        vw.Info();

        Samochod seat = new Samochod();
        seat.kolor = "Czerwony";
        seat.IloscDrzwi = 3;
        seat.silnik = s2;
        seat.Info2();

    }

}
