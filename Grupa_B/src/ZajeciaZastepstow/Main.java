package ZajeciaZastepstow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SalaWykladowa{
    float powierzchnia;
    int liczbaOkien;

    ArrayList<Komputer> komputery;

    public SalaWykladowa(float powierzchnia, int liczbaOkien) {
        this.powierzchnia = powierzchnia;
        this.liczbaOkien = liczbaOkien;

        komputery = new ArrayList<>();

        for(int i=0;i<10;i++)
            komputery.add(new Komputer(i,"Ubuntu","18.04","intel",(int)(1+99*Math.random()),(int)(12+12*Math.random())));

    }

    public void wyswietl(){
        for(Komputer k : komputery){
            k.wyswietl();
        }

        System.out.println("Największa moc obliczeniowa: "+ Collections.max(komputery).id);
    }

    public void sortujKomputeryPoMocyObliczeniowej(){
        Collections.sort(komputery, new Comparator<Komputer>() {
            @Override
            public int compare(Komputer o1, Komputer o2) {

                if(o1.getMocObliczeniowa()>o2.getMocObliczeniowa())
                    return 1;

                if(o1.getMocObliczeniowa()<o2.getMocObliczeniowa())
                    return -1;

                if(o1.getMocObliczeniowa()==o2.getMocObliczeniowa())
                    return 0;

                return 0;
            }
        });
    }

    public void sortujKomputeryPoPrzekatnej(){
        Collections.sort(komputery, new Comparator<Komputer>() {
            @Override
            public int compare(Komputer o1, Komputer o2) {

                if(o1.getPrzekatnaEkranu()>o2.getPrzekatnaEkranu())
                    return 1;

                if(o1.getPrzekatnaEkranu()<o2.getPrzekatnaEkranu())
                    return -1;

                if(o1.getPrzekatnaEkranu()==o2.getPrzekatnaEkranu())
                    return 0;

                return 0;
            }
        });
    }

    public void sortuj(){
        Collections.sort(komputery);
    }
}

class Komputer implements Comparable<Komputer>{
    int id;
    String systemOperacyjny;
    String wersjaSystemu;
    String procesor;
    private int mocObliczeniowa;
    private int przekatnaEkranu;

    public double getMocObliczeniowa() {
        return mocObliczeniowa;
    }

    public float getPrzekatnaEkranu() {
        return przekatnaEkranu;
    }

    public Komputer(int id, String systemOperacyjny, String wersjaSystemu, String procesor, int mocObliczeniowa, int przekatnaEkranu) {
        this.id = id;
        this.systemOperacyjny = systemOperacyjny;
        this.wersjaSystemu = wersjaSystemu;
        this.procesor = procesor;
        this.mocObliczeniowa = mocObliczeniowa;
        this.przekatnaEkranu = przekatnaEkranu;
    }

    public void wyswietl(){
        System.out.println("id: "+id+" procesor: "+procesor+" moc obliczeniowa: "+mocObliczeniowa+" przekątna ekranu: "+przekatnaEkranu);
    }

    @Override
    public int compareTo(Komputer o) {
        if(mocObliczeniowa>o.mocObliczeniowa)
            return 1;

        if(mocObliczeniowa<o.mocObliczeniowa)
            return -1;

        if(mocObliczeniowa==o.mocObliczeniowa)
            return 0;

        return 0;
    }
}


public class Main {

    public static void cwiczenie1(){
        ArrayList<Integer> liczby = new ArrayList<>();

        for(int i=0;i<10;i++)
            liczby.add((int)(Math.random()*10));

        for(Integer liczba : liczby){
            System.out.println(liczba);
        }

        System.out.println("________________________");

        Collections.sort(liczby, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2)
                    return -1;
                if(o1<o2)
                    return 1;
                if(o1==o2)
                    return 0;

                return 0;
            }
        });

        System.out.println("________________________");

        liczby.forEach(x->System.out.println(x));
    }

    public static void main(String[] args) {

        cwiczenie1();

        SalaWykladowa salaWykladowa = new SalaWykladowa(50,4);

        salaWykladowa.wyswietl();

        salaWykladowa.sortujKomputeryPoMocyObliczeniowej();

        System.out.println("________________________");

        salaWykladowa.wyswietl();

        System.out.println("________________________");

        salaWykladowa.sortujKomputeryPoPrzekatnej();

        salaWykladowa.wyswietl();

        System.out.println("________________________");

        salaWykladowa.sortuj();

        salaWykladowa.wyswietl();

    }
}
