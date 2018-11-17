package Zajecia7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Zadania {
    //1) wypisanie tablicy
    //2) wypisać tablice od tyłu
    //3) znaleźć największy element w tablicy
    //4)* posortować tablice*
    //5) wpisać do tablicy 0 - liczba jest parzysta index%2==0 - parzysta
    // 1-jeżeli jest nieparzysta - 20
    //6 {1,2,3,4,6,1,5,3,5,2}
    //7. Wyswietlić tablice od tylu co 2 element
    //8. tablica[10] policzyc srednia
    //ctrl + alt + l
    public static void main(String[] args) {
        int[] zad = new int[]{6, 15, 5, 7, 8, 9, 10, 123, 3, 5, 7, 8};
        System.out.println(zad.length + "\n");
        //Ad.1
        for (int i = 0; i < 7; i++) {
            System.out.println(zad[i]);
        }

        //Ad.2
        System.out.println();
        for (int i = zad.length - 1; i > -1; i--) {
            System.out.println(zad[i]);
        }

        //Ad.3
        int tmp = 0;

        for (int i = 0; i < zad.length; i++) {
            if (tmp < zad[i]) {
                tmp = zad[i];
            }
        }
        System.out.println();
        System.out.println(tmp);
        System.out.println();

        //Ad.4
        Arrays.sort(zad);
        for (int i = 0; i < zad.length; i++) {
            System.out.println(zad[i]);
        }

        int[] parzyste = new int[21];
        //Ad.5
        for (int i = 0; i < 21; i++) {
            if (i % 3 == 0) {
                parzyste[i] = i;
            } else {
                parzyste[i] = 1;
            }
        }
        System.out.println("\nParzyste, nieparzyste");
        for (int i = 0; i < parzyste.length; i++) {
            System.out.println(parzyste[i]);
        }

        System.out.println("\n+++++++++++++++++");
        //Ad.6
        int[] unikat = {1, 2, 3, 4, 6, 1, 5, 3, 5, 2};
        int[] powt = {1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000};

        int un = 1;
        for (int i = 0; i < unikat.length; i++) {
            for (int j = 0; j < unikat.length; j++) {
                if (i == j) continue;
                if (unikat[i] == unikat[j]){
                    powt[i]=unikat[j];
                }
            }
        }

        for (int i = 0; i < powt.length; i++) {
            System.out.println(powt[i]);
        }
        System.out.println("================");
        for (int i = 0; i < unikat.length; i++) {
            if (unikat[i]!= powt[i] && powt[i]!=1000){
                System.out.println(powt[i]);
                //break;
            }
        }
        System.out.println(un);
    }
}
