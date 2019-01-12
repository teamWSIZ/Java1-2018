package Zajecia10;

import java.util.Random;

public class Jar {
    public static void main(String[] args) throws InterruptedException {

        for (String a : args) {
            System.out.println(a);
        }

        Prostokat p1;
        p1 = new Prostokat(5, 10);
        System.out.println(p1.Pole());

        Prostokat p2 = new Prostokat(5, 5);
        System.out.println(p2.Pole());

        Prostokat p3 = new Prostokat(51, 5);
        System.out.println(p3.Pole());

        System.out.println(p3);
        System.out.println();

        p3.setA(11);
        System.out.println(p3.getA());


        Prostokat[] tabProst = new Prostokat[10];

        tabProst[0] = new Prostokat(1,3);
        tabProst[1] = new Prostokat(2,3);
        tabProst[2] = new Prostokat(3,3);

        Random r = new Random();
        for (int i = 0; i < tabProst.length; i++) {
            if (tabProst[i] instanceof Prostokat){
                System.out.println(tabProst[i]);
                System.out.println(tabProst[i].Pole());
            }else {
                System.out.println("Nie ma zaincjalizowanej klasy");
            }
           // tabProst[i] = new Prostokat(r.nextInt(100),r.nextInt(50));
        }
    }
}

