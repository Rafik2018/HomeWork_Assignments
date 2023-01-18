package Class8;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
/*
2) Create a program that will be asking user to apply for a credit card 10 times.
 As soon you get an “yes” from a user program should stop asking.
*/

        Scanner scan = new Scanner(System.in);


        for (int NO = 0; NO < 10; NO++) {
            System.out.println("Would you like to apply for credit card?");
            String answer = scan.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
}








