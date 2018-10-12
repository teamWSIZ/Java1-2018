package Zajecia1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadanie1 {
    public static void main(String[] args) throws Exception {
        String haslo = "0123";
        System.out.println("Podaj Hasło");

        for (int i = 0; i < 3; i++) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String wczytaneHaslo = br.readLine();

            if (haslo.equals(wczytaneHaslo)) {
                System.out.println("Hasło poprawne");
                break;
            } else {
                System.out.println("Błedne hasło, próba :" + (3 - (i + 1)) + ", podaj hasło:");
            }
        }

    }
}
