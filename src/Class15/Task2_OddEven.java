package Class15;

public class Task2_OddEven {

    /*2) Create a method that will take a number and prints
        whether the number is even or odd.*/


    int evenOrOdd(int number) {
        boolean sigh;
        if (number % 2 == 0) {
           sigh = true;
            System.out.println("Output number is even");
        } else {
            sigh = false;
            System.out.println("Output number is odd");
        }

        return number;
    }

           public static void main (String[]args){
            Task2_OddEven mp = new Task2_OddEven();
            System.out.println( + mp.evenOrOdd(11));


        }

    }










