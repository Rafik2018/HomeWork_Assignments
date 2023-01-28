package Class12;

import java.util.Locale;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

/*
        3) Write a program that reads two people's first
        names and if they expecting boy or girl?
        Based on the input suggests a name for a baby:

        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL
                */


        Scanner input = new Scanner(System.in);

        System.out.println("What is the first name of the father?");
        String dadName = input.nextLine();


        System.out.println("What is the first name of the mother?");
        String momName = input.nextLine();

        System.out.println("Are you expecting a boy or a girl?");
        String expectation = input.nextLine();


        String firstHalf;
        String secondHalf;
        if (expectation.equalsIgnoreCase("girl")) {
            firstHalf = dadName.substring(0, dadName.length() / 2);
            secondHalf = momName.substring(momName.length() / 2);
        } else {
            firstHalf = momName.substring(0, momName.length() / 2);
            secondHalf = dadName.substring(dadName.length() / 2);
        }

        System.out.println(firstHalf + secondHalf);

        input.close();
















    }

}


