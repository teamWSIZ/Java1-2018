package Zajecia11;

public class Samochod {

    public String kolor;
    public int iloscDrzwi;
    public Silnik silnik;


    public void Info() {
        System.out.println("Kolor: " + kolor);
        System.out.println("Ilość drzwi: " + iloscDrzwi);

        if (silnik != null) {
            System.out.println("Silnik: " + silnik.pojemosc + " KM: " + silnik.km);
        } else {
            System.out.println("Brak silnika");
        }
    }

}
