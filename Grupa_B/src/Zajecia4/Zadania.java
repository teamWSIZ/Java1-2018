package Zajecia4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Zadania {
    public static void main(String[] args) throws IOException {

        Random r = new Random();
        int wylos = r.nextInt(100);//0..100

        System.out.println("Odgadnij wylosowaną liczbę");
        boolean graDalej = true;

        int proby = 0;
        while (graDalej) {

            System.out.println("Podaj liczbę: ");

            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String wczytanyNapis = bf.readLine();
            int podanaLiczba = Integer.parseInt(wczytanyNapis); //zamiana napisu na typ liczbowy

            if (wylos == podanaLiczba) {
                System.out.println("Brawo!, wylosowana liczba to:" + podanaLiczba);
                graDalej = false;
            } else if (podanaLiczba > wylos) {
                System.out.println("Liczba jest za duża");
            } else {
                System.out.println("Liczba jest za mała");
            }
            System.out.println("Proba: " + proby);
            proby++; //proby = proby + 1;
        }
    }
}
