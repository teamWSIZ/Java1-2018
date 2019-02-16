package Zajecia16;

public class Start {

    public static void main(String[] args) {

        int[][] tab2W = new int[10][2];

        tab2W[0][0] = 10;
        tab2W[9][1] = 100;

        for (int i = 0; i < tab2W.length; i++) {
            for (int j = 0; j < tab2W[i].length; j++) {
                System.out.print(tab2W[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
