package Zajecia5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Zadanka {
    public static void main(String[] args) throws IOException {
        int wylosowanaLiczba = 0;
        Random r = new Random();
        wylosowanaLiczba = r.nextInt(100);
        boolean graDalej = true;

        System.out.println("Odgadnij liczbę z przedziału 0..100");

        while (graDalej){
            System.out.println("Podaj liczbe");

            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String wczytanyTekst = bf.readLine();
            //zamieniamy typ String (tekst) na typ int (liczby)
            int podanaLiczba = Integer.parseInt(wczytanyTekst);

            if (podanaLiczba > wylosowanaLiczba) {
                System.out.println("Liczba jest za duża");
            } else if (podanaLiczba < wylosowanaLiczba) {
                System.out.println("Liczba jest za mała");
            } else {
                System.out.println("Barawo odgadłeś liczbę:" + wylosowanaLiczba);
                graDalej = false;
            }
//            ddd++; //ddd= ddd+1;
        }

        int[] tab = new int[]{1,3123,4,2,3,4};
    }
}
