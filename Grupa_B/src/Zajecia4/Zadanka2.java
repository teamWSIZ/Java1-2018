package Zajecia4;

import com.sun.xml.internal.ws.commons.xmlutil.Converter;
import org.omg.CORBA.INTERNAL;

public class Zadanka2 {
    public static void main(String[] args) {
        String napis = "Ala ma kota";

        char znak = napis.charAt(1);
        System.out.println(znak);

        for (int i = napis.length() - 1; i >= 0; i--) {
            System.out.print(napis.charAt(i));
        }
        System.out.println("");
        // a = <10
        //b = <10

        //2 3 = 8
        //3 3 = 7 //27

        //3 4 = ?
        double wynik = Math.pow(3, 4);

        int tmpWynik = (int) wynik;
        String tmpWynikNapis = Integer.toString(tmpWynik);
        System.out.println(tmpWynikNapis.charAt(tmpWynikNapis.length() - 1));
    }
}
