package Zajecia3;

import java.util.Random;

public class Chinczyk {
    public static void main(String[] args) {


        Random r = new Random();
        int a = 0, b = 0;
        int koniec = 100;

        for (int i = 0; i < 1000; i++) {
            //ruch pinka "A"
            a = a + (1 + r.nextInt(6)); //A się posuwa
            if (a==b) {
                b = 0;  //pionek A zbił pionek B
            }
            if (a>=koniec) {
                System.out.println("Wygrał gracz A; B jest teraz na " + b);
                break;
            }

            //ruch pionka "B"
            b = b + (1 + r.nextInt(6));
            if (b==a) {
                a = 0;
            }
            if (b>=koniec) {
                System.out.println("Wygrał gracz B; A jest teraz na " + a);
                break;
            }
            System.out.println("{" + a + ", " + b + "}");
        }
    }
}
