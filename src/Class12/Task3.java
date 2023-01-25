package Class12;

import java.util.Locale;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {


       /* Write a program that reads two people's first
        names and if they expecting boy or girl?
                Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY
*/
       /* Scanner scanner = new Scanner(System.in);

        System.out.println("Mom's first name?");
        String momname = scanner.next();
        System.out.println("Dad's first name?");
        String dadname = scanner.next();
        System.out.println("Boy or Girl?");
        String gender = scanner.next();
        String suggestedName = "";

        if (gender.equalsIgnoreCase("girl")) {
            suggestedName = dadname.substring(0, 1).toUpperCase() + momname.substring(1).toUpperCase();
        } else if (gender.equalsIgnoreCase("boy")) {
            suggestedName = momname.substring(0, 1).toUpperCase() + dadname.substring(1).toUpperCase();
        } else {
            System.out.println(suggestedName + "Other Genders not acceptable");
        }
        System.out.println("Suggested baby name " + suggestedName);
*/



        Scanner scanner = new Scanner(System.in);
        System.out.println("Mom's first name?");
        String momsName  = scanner.next();
        System.out.println("Dad's first name?");
        String dadsName = scanner.next();
        System.out.println("Boy or Girl?");
        String gender = scanner.next();
        String suggestedName = "";

         dadsName = "Zafar";
         momsName = "Maryum";
        String expectation = "girl";
        String firstHalf = "";
        String secondHalf = "";
        if (expectation.equalsIgnoreCase("boy")) {
            firstHalf = dadsName.substring(0, dadsName.length() / 2);
            secondHalf = momsName.substring(momsName.length() / 2);

        } else {
            firstHalf = momsName.substring(0, momsName.length() / 2);
            secondHalf = dadsName.substring(dadsName.length() / 2);
        }
        System.out.println(firstHalf + secondHalf);


    }

}


