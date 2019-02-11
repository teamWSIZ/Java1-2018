package Zajecia15;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Start {
    public static void main(String[] args) {

        List<Integer> liczby = new ArrayList<>();

        for (int i = 30; i < 70; i++) {
            liczby.add(i);
        }
        System.out.println(liczby);

        liczby.remove((Object) 57);
        System.out.println(liczby);


        Random r = new Random();

        List<Silnik> silniki = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            silniki.add(new Silnik(r.nextInt(180) + 1));
        }

        System.out.println(silniki);
        Silnik[] ddd = silniki.toArray(new Silnik[10]);
        Arrays.sort(ddd);

        for (Silnik s : ddd){
            System.out.println(s);
        }

    }
}
