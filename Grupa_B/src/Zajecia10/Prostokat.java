package Zajecia10;

public class Prostokat {
    private int a, b;

    public Prostokat() {
        System.out.println("To jest konstruktor domyślny");
    }

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double Pole() {
        return Math.round(a * b);
    }

    @Override
    public String toString() {
        return "Prostokat{" +
                "a = " + a +
                ", b = " + b +
                '}';
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
      if (a > 10 & a < 20){
          this.a = a;
      }else {
          System.out.println("Zły przedział!!!");
      }
    }
}
