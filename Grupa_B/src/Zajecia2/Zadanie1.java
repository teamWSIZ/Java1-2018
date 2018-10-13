package Zajecia2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie1 {
    public static void main(String[] args) throws IOException {
        String haslo = "1249";

        System.out.println("Podaj hasło");
        for (int i = 0; i < 3; i++) {
            BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
            String hasloUzytkownika = rb.readLine();

            if (haslo.equals(hasloUzytkownika)){
                System.out.println("Hasło poprawne");
                break;
            }else {
                System.out.println("Złe hasło, spróbuj jeszcze raz:");
            }
        }
    }
}
