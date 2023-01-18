package Class8;

public class Task_6 {

    public static void main(String[] args) {

/*
        6) Print the following pattern:
       *

       *

       *
       **
       *
       **
       *
*/

        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 1; j++) {
                System.out.println("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 1; j++) {
                System.out.println("*");

            }
            System.out.println("**");

        }
        System.out.println("*");

    }
}




