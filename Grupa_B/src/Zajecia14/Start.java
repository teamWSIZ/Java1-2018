package Zajecia14;

import Zajecia12.DataUsers;
import Zajecia12.User;

import java.lang.reflect.Array;
import java.util.*;

public class Start {
    public static void main(String[] args) {
        List<Integer> uzyt = new ArrayList<>();
        uzyt.add(10);
        uzyt.add(13);
        uzyt.add(17);
        uzyt.add(20);
        uzyt.add(30);
        uzyt.add(47);


        Random r = new Random();
        List<Integer> liczby = new ArrayList<>();
        int ilosc = 0;

        while (liczby.size() < 6) {
            ilosc++;
            int liczba = r.nextInt(48) + 1;
            if (!liczby.contains(liczba)) {
                liczby.add(liczba);
            }
        }

        System.out.println(ilosc);
        System.out.println(liczby);

        Collections.sort(liczby);
        System.out.println(liczby);

        for (int uL : uzyt) {
            if (liczby.contains(uL)) {
                System.out.println("Trafiłeś liczbę: " + uL);
            }
        }

        DataUsers du = new DataUsers();
        List<User> lu = du.getUserList();
        System.out.println(lu);
        Collections.sort(lu);
        System.out.println(lu);

//        Zakład = listę 6 liczby
//        Bilet = Liste zakładów
//        Automat - >
//            Losuj
//            Sprawdź zakład
    }
}
