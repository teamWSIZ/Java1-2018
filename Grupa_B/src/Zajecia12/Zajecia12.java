package Zajecia12;

import Zajecia10.Prostokat;

public class Zajecia12{
    public static void main(String[] args) {
        int a = 1000;
        int b;
        b = a;
        System.out.println(a + " " + b);
        b = 20;
        System.out.println(a + " " + b);

        Prostokat p1 = new Prostokat(2, 10);
        Prostokat p2 = null;
        System.out.println(p1 + ", " + p2);
        p2 = p1.Kopia();
        System.out.println(p1 + ", " + p2);
        p2.setB(100);
        System.out.println(p1 + ", " + p2);

        byte c = 10;
        //a = c;
        c = (byte)a;
        double dd = 10.12345678901234567890;
        float ff =  12.12f;

        //dd = ff;
        ff = (float) dd;
        System.out.println(dd);

    }

}
