package Zajecia2;

public class Petle {
    public static void main(String[] args) {

        int ii = 0;
        while (ii < 10){
            //System.out.println("To jest pętla: " + ii);
            ii = ii + 1;
        }

        ii = 0;
        do {
            ii++;
            //System.out.println("Do...while: " + ii);
        }while (false);

        for(int i = 0; i<10;i++){
            if (i==3){
                System.out.println("I jest równe 3");
                //break;
                continue;
            }
//            break;
            System.out.println("Pętla for..:" + i);
        }
    }
}
