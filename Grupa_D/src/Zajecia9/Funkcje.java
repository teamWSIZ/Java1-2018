package Zajecia9;

public class Funkcje {

    private static String PierwszaFunkcja(String imie) {
        String przywitanie = "Witaj... ";

        return przywitanie + imie; //Funkcja zwraca nam wartość w zmiennej
    }

    public static void main(String[] args) {
        String napisZFunkcji = PierwszaFunkcja("Staszek");

        System.out.println(napisZFunkcji);

        int[] tablica1 = {12,312,53,34,321,1,123,31,564};
        //wyswietlTablice(tablica1);
//        //tablica1[1] = 1100000;
//        //tablica1[0] = 111111;
        //wyswietlTablice(tablica1);

        System.out.println(lenght(tablica1));
    }

    private static void wyswietlTablice(int[] tab){
        System.out.println("Wiekość tablicy " + tab.length);
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
            tab[i]=i;
        }
    }

    private static int lenght(int[] tab){
        int wielkosc=0;
        for (int i = 0; i < tab.length; i++) {
            wielkosc++;
        }
        return  wielkosc;
    }
}
