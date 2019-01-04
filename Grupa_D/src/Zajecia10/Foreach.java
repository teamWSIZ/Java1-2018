package Zajecia10;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Iterator;

public class Foreach {
    public static void main(String[] args) {
        Pair<Double, Double> wartosci = new Pair<Double, Double>(10.0, 10.0);

        System.out.println(wartosci.getKey() + " " + wartosci.getValue());

        System.out.println(silnia(5));

        ArrayList<Double> lista = new ArrayList<>();

        lista.add(10.0);
        lista.add(9.12);

        System.out.println(lista.get(0));

        System.out.println(lista.size());
        System.out.println(lista.contains(9.12));
        System.out.println(lista.contains(9.22));
        lista.add(2.32);
//        for (int i = 0; i < 100; i++) {
//            lista.add(i * 21 * 0.32);
//        }

        System.out.println("====");

        for (int i = 0; i < lista.size(); i++) {
            //lista.add(12.3);
            System.out.println(lista.get(i));
        }
        System.out.println("====");

        Iterator<Double> tabIterator =  lista.iterator();

//       while (tabIterator.hasNext()){
//           System.out.println(tabIterator.next());
//       }

        for (int i = 0; i < 1; i++) {
            System.out.println(tabIterator.next());
        }
        System.out.println(tabIterator.next());

        lista.set(2,44.2);
        lista.add(2,222.2);
        lista.sort(Double::compareTo);
        System.out.println("=========");
        showList(lista);


        //Sprawdzenie ile czasu zajmuje wypisanie 100000 int'ów
        long tt = System.currentTimeMillis();
        int[] ddd = new int[100000];
        for (int i = 0; i < ddd.length; i++) {
            System.out.println(ddd[i]);
        }
        long tt2 = System.currentTimeMillis();
        System.out.println(tt2-tt);
    }

    static long silnia(int a) {
        if (a == 0) {
            return 1;
        } else {
            return a * silnia(a - 1);
        }
    }

    static void showList(ArrayList<Double> list){
        for(Double a : list){
            System.out.println(a);
        }
    }
}
