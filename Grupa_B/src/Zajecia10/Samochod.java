package Zajecia10;

public class Samochod {
    public String kolor;
    public int IloscDrzwi;

    public Silnik silnik;

    public void Info() {
        System.out.println("Kolor: " + kolor);
        System.out.println("Ilość drzwi: " + IloscDrzwi);

        if (silnik != null) {
            silnik.InfoSilnik();
        } else {
            System.out.println("Brak silnika");
        }
    }

    public void Info2() {
        System.out.println("Kolor: " + kolor);
        System.out.println("Ilość drzwi: " + IloscDrzwi);

        if (silnik != null) {
            System.out.println("Silnik km: " + silnik.KM + " poj.: " + silnik.pojemnosc);
        }else{
            System.out.println("Brak silnika");
        }
    }

}
