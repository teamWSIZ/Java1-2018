package Zajecia7;

import java.util.Random;

public class TabliceZdania {
    public static void main(String[] args) {
        int[] tablica1; //deklaracja
        tablica1 = new int[10]; //inicjalizacja

        tablica1[9] = 10;
        System.out.println(tablica1[9]);

        int[] tab2 = new int[]{1,3,45,5,8,5,23,253};
        System.out.println("rzeczywista wielkość tablicy " + tab2.length
               + " wielkość - 2 "+(tab2.length - 2));

        Random random = new Random();
        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = random.nextInt();
        }

        for (int i = 0; i < 8; i++) {
            System.out.println(tab2[i]);
        }
    }
}
