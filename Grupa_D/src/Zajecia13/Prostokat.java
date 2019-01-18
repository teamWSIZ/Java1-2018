package Zajecia13;

public class Prostokat  {
    private int a, b;

    public Prostokat() {
        System.out.println("To ja konstruktor domyślny");
    }

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {

            this.a = a;

    }

    public float Pole() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Prostokat{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public Prostokat Kopia(){
        return new Prostokat(this.a,this.b);
    }
}
