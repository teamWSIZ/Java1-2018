package Zajecia3;

public class Zadanie1 {
    public static void main(String[] args) {
        //zadanie: zsumować wszystkie liczby całkowite od 1 do 1000000
        //zadanie2: dane liczby całkowite (int) a, b, c;
        // --> sprawdzić czy da się ułożyć trójkąt z bokami o długości a,b,c
        //zadanie3: z liczb z przedziału [1..100] znaleźć takie a,b,c:
        //  a*a + b*b == c*c
        //zadanie4: obecny czas zadany jest w postaci dwóch liczb całkowitych,
        // hh (godzina) i mm (minuta); np. int hh=17; int mm=15 odpowiadają 17:15;
        // podany jest tez odcinek czasu `int delta`; jest to liczba minut,
        // które chcemy dodać do obecnego czasu; proszę wyliczyć
        // godzinę i minutę chwili powstałej po dodaniu `delta` do obecnego czasu.


        //kod1:
        long suma = 0;
        for (int i = 0; i <= 1000000; i++) {
            suma += i;   //to samo co suma = suma + i
        }
        System.out.println(suma);

        //kod2:
        int a = 3;
        int b = 5;
        int c = 7;

        if (a > (b+c)) {
            System.out.println("NIE");
        } else if (b > (a + c)) {
            System.out.println("NIE");
        }  ///.....
        else {
            System.out.println("TAK");
        }



    }
}
