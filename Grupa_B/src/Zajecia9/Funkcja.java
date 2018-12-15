package Zajecia9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Funkcja {
    public static void main(String[] args) {
        String jakisNapis = "Marek";

        System.out.println(jakisNapis);
        pierwszaFunkcja(jakisNapis);
        System.out.println(jakisNapis);


        String imie = "Staszek";
        String napis = drugaFunkcja(imie,13);
//
        System.out.println(napis);
//        System.out.println(drugaFunkcja("dasd", 12));
//
        int[] tablica = {123, 235, 568, 234, 2, 4, 6, 3, 212};
        wyswietlTablice(tablica);
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }

        System.out.println("+++++++++++");
        //System.out.println(Silnia(20));
        System.out.println(Silnia1(20));
       //wyswietlTablice(tablica);
    }

    private static void pierwszaFunkcja(String napis) {
        napis = "Andrzej";
        System.out.println(napis);
    }

    private static String drugaFunkcja(String imie) {
        String napis = "Witaj...";
        return napis + imie;
    }

    private static String drugaFunkcja(String imie, int wiek) {
        String napis = "Witaj...";
        return napis + imie + " Twój wiek: " + wiek;
    }

    //Typy złożone są przekazywane prze referencje czyli adres w pamięci
    //a nie kopie wartość
    private static void wyswietlTablice(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

//        for (int i = 0; i < tab.length; i++) {
//            tab[i] = i;
//        }
    }

    private static long Silnia(int ile){
        long wynik = 1;

        for (int i = 1; i <= ile; i++) {
            wynik *= i;
        }

        return wynik;
    }

    private static long Silnia1(int ile){
        if (ile == 1){
            return  1;
        }else
        {
          return ile * Silnia1(ile-1);
        }
    }
}
