package Zajecia13;


public class Zajecia13 {
    public static void main(String[] args) {
        Prostokat p1;
        p1 = new Prostokat(5, 5);

        System.out.println(p1.getA());
        p1.setA(10);
        p1.setA(3);
        System.out.println(p1.getA());
        System.out.println(p1.Pole());

        System.out.println(p1.toString());

        System.out.println("===================");
        Prostokat[] tabProstokatow = new Prostokat[10];
        tabProstokatow[0] = new Prostokat(10, 5);
        tabProstokatow[1] = new Prostokat(2, 5);

        for (int i = 0; i < tabProstokatow.length; i++) {

            if (tabProstokatow[i] instanceof Prostokat) {
                System.out.println(tabProstokatow[i].Pole());
            } else {
                System.out.println("Obiekt jest pusty");
            }
        }

        System.out.println("===========\n");

        int d = 5;
        int c;
        c = d;
        System.out.println(c + " " + d);
        c = 10;
        System.out.println(c + " " + d);

        Prostokat p2 = new Prostokat(12, 12);
        Prostokat p3 = null;
        System.out.println(p2 + " " + p3);
        p3 = p2.Kopia();
        System.out.println(p2 + " " + p3);
        p3.setA(100);
        System.out.println(p2 + " " + p3);

        p2.setA(50);
        System.out.println(p2 + " " + p3);

    }
}
