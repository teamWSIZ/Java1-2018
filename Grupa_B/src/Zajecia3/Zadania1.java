package Zajecia3;

public class Zadania1 {
    public static void main(String[] args) {
        //zadanie: zsumować wszystkie liczby całkowite od 1 do 1000000
        //zadanie2: dane liczby całkowite (int) a, b, c;
        // --> sprawdzić czy da się ułożyć trójkąt z bokami o długości a,b,c
        //zadanie3: z liczb z przedziału [1..100] znaleźć takie a,b,c:
        //  a*a + b*b == c*c
        //a = 4;
        //b = 10;
        // c=?
        //zadanie4: obecny czas zadany jest w postaci dwóch liczb całkowitych,
        // hh (godzina) i mm (minuta); np. int hh=17; int mm=15 odpowiadają 17:15;
        // podany jest tez odcinek czasu `int delta`; jest to liczba minut,
        // które chcemy dodać do obecnego czasu; proszę wyliczyć
        // godzinę i minutę chwili powstałej po dodaniu `delta` do obecnego czasu.
        int i = 1;
        i = i + 1; //= i++;
        i++; // 3

        long wynik = 0;
        for (int j = 0; j <= 1000000; j++) {
            wynik = wynik + j;
        }

        System.out.println(wynik);

//zad.2
        int a = 10, b = 5, c = 19;

        if ((a + b) > c) {
            System.out.println("tak");
        } else {
            System.out.println("nie");
        }

        //sprawdzenie wszytkich bokow
        if (a > (b + c)) {
            System.out.println("nie");
        } else if (b > (a + c)) {
            System.out.println("nie");
        } else {
            System.out.println("tak");
        }

        int d=3,e=4;
        for (int j = 0; j < 100; j++) {
            if ((d*d)+(e*e) == (j*j)){
                System.out.println("dla i = " + j);
            }
        }

    }
}
