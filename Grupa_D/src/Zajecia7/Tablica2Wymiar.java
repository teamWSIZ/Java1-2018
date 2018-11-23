package Zajecia7;

public class Tablica2Wymiar {
    public static void main(String[] args) {
        int[][] tab3 = new int[][]{ {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        System.out.println(tab3[2][1]); // 8
        for (int i = 0; i < tab3.length; i++) {
            for (int j = 0; j < tab3[i].length; j++) {
                System.out.println(tab3[i][j]);
            }
        }
    }
}
