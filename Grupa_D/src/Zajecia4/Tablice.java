package Zajecia4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tablice {
    public static void main(String[] args) {

        int[] tabInt = new int[10];
        tabInt[0] = 1;
        tabInt[4] = 10;

        for (int i = 0; i < 10; i++) {
            tabInt[i] = i;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(tabInt[i]);
        }
        System.out.println("Długość tablicy int: " + tabInt.length);

        String[] tabString = new String[3];
        tabString[0] = "TO jest 1 i 0 element w tablicy";
        tabString[1] = "TO jest 2 element w tablicy";
        tabString[2] = "TO jest 3 element w tablicy";

        for (int i = 0; i < tabString.length; i++) {
            System.out.println(tabString[i]);
        }
        //inny rodzaj deklaracji z inicjalizacją tablicy
        char[] tabChar = new char[]{'d', '1', '2', '5'};

        // System.out.println(Arrays.binarySearch(tabInt,11));;
    }
}
