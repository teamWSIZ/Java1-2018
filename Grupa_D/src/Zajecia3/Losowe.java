package Zajecia3;

import java.util.Random;

public class Losowe {
    public static void main(String[] args) {

        Random r = new Random();

        for (int i = 0; i < 1000; i++) {
            System.out.println(1 + r.nextInt(6));
        }

    }
}
