package Zajecia14;

import Zajecia11.Klasy;

public class Klasa {
    public static void main(String[] args) {
        int a = 1000;
        byte b = (byte) 257;

        a = b;
        System.out.println(a);
        b = (byte) a;

        double d = 10.123456789101;
        float f = 123.0f;

        //d = f;
        f = (float) d;
        System.out.println(d);


    }
}
