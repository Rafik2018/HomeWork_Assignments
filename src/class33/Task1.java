package class33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    /* 1) How would handle InputMismatchException?
    Input Mismatch Exception when user enters mismatch value then programmer expected.*/

    public static void main(String[] args) throws NoSuchMethodException {

        handleStringInput();
        handleScannerInput();
    }
    public static void handleStringInput() {
        String userInput= "Java";
        int num;
        try {
            num = Integer.parseInt(userInput);
            System.out.println(" Entered number is  " + num);
        } catch (NumberFormatException e) {
            System.out.println("1) NumberFormatException: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: " + e.getMessage());
        }
        System.out.println("Another method of mismatchException ");
    }


    public static void handleScannerInput() {
        Scanner scanner = new Scanner(System.in);
        int num;
        try {
            System.out.print("2) Please enter the a number -->");
            num = scanner.nextInt();
            System.out.println("You entered number is  " + num);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException " + e.getMessage());
        }
    }
}