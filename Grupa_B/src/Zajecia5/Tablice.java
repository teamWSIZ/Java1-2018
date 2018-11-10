package Zajecia5;

public class Tablice {
    public static void main(String[] args) {
       int[] tablica = new int[100];

       tablica[0] = 10;
       tablica[99] = 1234;

        System.out.println(tablica[0]); //pobieranie wartość na pierwszym miejscu w tablcy
        System.out.println(tablica[1]);
        System.out.println(tablica[99]); //ostatni lement jest na wielkość tablicy - 1;

        for (int i = 0; i < 100; i++) {
            tablica[i] = i;
        }
        System.out.println(tablica.length);
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
    }
}
