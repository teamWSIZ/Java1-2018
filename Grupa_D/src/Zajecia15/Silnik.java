package Zajecia15;

public class Silnik implements Comparable {
    private int km;

    public Silnik(int km) {
        this.km = km;
    }

    public int getKm() {
        return km;
    }

    @Override
    public String toString() {
        return "Silnik{" +
                "km=" + km +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Silnik s1 = (Silnik) o;
        if (s1.getKm() < this.km)
            return -1;
        else
            return 1;
    }
}
