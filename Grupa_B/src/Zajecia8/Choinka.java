package Zajecia8;

public class Choinka {
    public static void main(String[] args) {
        //        String dd = "123456789";
//        System.out.println(dd.substring(4,6)); //wycina znaki od do
//        System.out.println("     4     4");
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print(" ");
//        }
//        System.out.println("*");

        String spacja = "           ";
        String gwiazda = "*";
        for (int i = 0; i < 10; i++) {
            System.out.println(spacja + gwiazda);
            gwiazda+="**";
            spacja = spacja.substring(0,spacja.length()-1);
        }
    }
}
