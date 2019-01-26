package Zajecia10;

import java.util.*;

public class Listy {
    public static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList<>();

        lista1.add(10);
        lista1.add(12);
        lista1.add(40);
        lista1.add(12);
        lista1.add(40);

        System.out.println(lista1.get(2));
        System.out.println(lista1.size());

        System.out.println();
        for (int i = 0; i < lista1.size(); i++) {
            System.out.println(lista1.get(i));
        }
        System.out.println();

        boolean jest = lista1.contains(12);
        System.out.println(jest);

        List<String> lista2 = new ArrayList<>();

        lista2.add("Napis1");
        lista2.add("napis 2");
        lista2.add("napis 3");
        lista2.add("napis 4");

        lista2.add(1, "napis 5");
        System.out.println(lista2);
        System.out.println();

        for (String i : lista2) {
            System.out.println(i);
        }

        Set<Integer> lista3 = new HashSet<>();
//        for(Integer a : lista1){
//            lista3.add(a);
//        }

        lista3.addAll(lista1);
        System.out.println(lista3);
        lista1.sort(Integer::compareTo);
        System.out.println(lista1);
        lista2.forEach(d -> System.out.println(d));

    }
}
