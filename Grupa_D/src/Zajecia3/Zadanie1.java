package Zajecia3;

public class Zadanie1 {
    public static void main(String[] args) {
        //zadanie: zsumować wszystkie liczby całkowite od 1 do 1000000
        //zadanie2: dane liczby całkowite (int) a, b, c;
        // --> sprawdzić czy da się ułożyć trójkąt z bokami o długości a,b,c
        //zadanie3: z liczb z przedziału [1..100] znaleźć takie a,b,c:
        //  a*a + b*b == c*c

        //kod1:
        long suma = 0;
        for (int i = 0; i <= 1000000; i++) {
            suma += i;   //to samo co suma = suma + i
        }
        System.out.println(suma);

        //kod2:
        int a = 3;
        int b = 5;
        int c = 7;

        if (a > (b+c)) {
            System.out.println("NIE");
        } else if (b > (a + c)) {
            System.out.println("NIE");
        }  ///.....
        else {
            System.out.println("TAK");
        }



    }
}
