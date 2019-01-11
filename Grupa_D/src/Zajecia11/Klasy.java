package Zajecia11;

public class Klasy {
    public static double jakasWlasciwosc = 10.0;

    public static void main1(String[] args) {
        Krzeslo obiektKrzeslo = new Krzeslo();
        System.out.println(obiektKrzeslo);
        System.out.println(obiektKrzeslo.rodzajMaterialu);
        System.out.println(obiektKrzeslo.iloscNog);
        obiektKrzeslo.InfomacjaOKrzesle();

        System.out.println();
        Krzeslo drugieKrzeslo = new Krzeslo();
        drugieKrzeslo.iloscNog = 10;
        drugieKrzeslo.rodzajMaterialu = "Plastik";
        drugieKrzeslo.InfomacjaOKrzesle();


    }

    public static void main(String[] args) {
        main1(args);

        Silnik s1 = new Silnik();
        s1.km = 110;
        s1.pojemosc = 2.0;

        Samochod vw = new Samochod();
        vw.iloscDrzwi = 5;
        vw.kolor = "Czerwony";
        vw.silnik = s1;
        vw.Info();

        Samochod opel = new Samochod();
        opel.iloscDrzwi = 3;
        opel.kolor = "Zielony";
        opel.silnik = s1;
        opel.Info();
    }
}
