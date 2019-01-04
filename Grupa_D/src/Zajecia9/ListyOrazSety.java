package Zajecia9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListyOrazSety {
    public static void main(String[] args) {
        List<Integer> w = new ArrayList();

        w.add(12);
        w.add(67);
        w.add(61);
        w.add(12);
        w.add(67);
        w.add(5);

        System.out.println(w);
        System.out.println(w.size());
        System.out.println(w.get(2));

        List<String> ww = new ArrayList();
        ww.add("Abra kadabra");
        ww.add("Sentinel");

        System.out.println(ww);

        ///treści z *
        //unikalne liczby z listy `w`
        Set<Integer> s = new HashSet<Integer>();
//    for (int i = 0; i < w.size(); i++) {
//      s.add(w.get(i));
//    }

        for (Integer i : w) {
            s.add(i);
        }

        System.out.println("W set-cie jest:" + s);
    }
}
