package Zajecia2;

public class Petle {
    //psvm
    public static void main(String[] args) {

        int interator = 0;
        while (interator <= 10) {
            //System.out.println("To jest pętla: " + interator);
            interator = interator + 1;
        }

        int ii = 0;
        do {
            //System.out.println("Petla do...while: "+ ii);
            ii++;
        } while (ii < 10);


        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                System.out.println("i jest równe 3");
                //continue; - przeskakuje na początek pętli
            }
            System.out.println("Petla for..: " + i);
            //break; - przerywa wykonywanie pętli
        }

        //ctrl+alt+l
        //12345678910
        //246810
        //3
        //4
        //5
        //6
        //7
        //8
        //9
        //10
    }
}
