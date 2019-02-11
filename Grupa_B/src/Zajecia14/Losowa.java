package Zajecia14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Losowa {
    public static List<Integer> losujLiczby() {
        List<Integer> liczby = new ArrayList<>();
        Random r = new Random();

        while (liczby.size() < 6) {
            int liczba = r.nextInt(48) + 1;
            if (!liczby.contains(liczba)) {
                liczby.add(liczba);
            }
        }
        return liczby;
    }
}
