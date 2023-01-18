package Class8;

public class Task_5 {

    public static void main(String[] args) {

/*
        5) Print the following pattern:
        55555
        4444
        333
        22
        1
        */


        for (int i = 5; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();



        }


    }
}