package Zajecia8;

public class choinka {
    public static void main(String[] args) {

        String gwiazda = "*", odstep = "           ";
        for (int i = 0; i < 10; i++) {
            System.out.println(odstep + gwiazda);
            gwiazda += "**";
            odstep=odstep.substring(1,odstep.length());
        }
    }
}
