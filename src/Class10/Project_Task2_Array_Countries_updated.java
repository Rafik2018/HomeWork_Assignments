package Class10;

import java.util.Scanner;

public class Project_Task2_Array_Countries_updated {
    public static void main(String[] args) {
        /*

         2)Using Scanner create an array of countries. When an array is created,
         retrieve all values from it and while retrieving those values print capital
        for each country. (use 2 different loops).
*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of countries:");
        int numberOfCountries = scanner.nextInt();

        String[] countries = new String[numberOfCountries];
        System.out.println("Please enter the name of country");




        for (int i = 0; i < numberOfCountries; i++) {
            countries[i] = scanner.next();
        }
        int i = 0;
        while (i < numberOfCountries) {
            String country = countries[i];

            if (country.equals("USA")) {
                System.out.println("The capital of " + country + " is" + " Washington");
            } else if (country.equals("Canada")) {
                System.out.println("The capital of " + country + " is" + " Ottawa");
            } else if (country.equals("UK")) {
                System.out.println("The capital of " + country + " is" + " London");
            } else if (country.equals("Germany")) {
                System.out.println("The capital of " + country + " is" + " Berlin");
            } else if (country.equals("Japan")) {
                System.out.println("The capital of " + country + " is" + " Tokio");
            } else {
                System.out.println("The capital of " + country + " is" + " Unknown");
            }
            i++;
        }

        System.out.println("---------------------------------------------------------------");




        for (int j = 0; j < numberOfCountries; j++) {
            countries[j] = scanner.next();
        }
        for (String country : countries) {
            switch (country) {

                case "USA":
                    System.out.println("The capital of " + country + " is" + " Washington");
                    break;
                case "Canada":
                    System.out.println("The capital of " + country + " is" + " Ottawa");
                    break;
                case "UK":
                    System.out.println("The capital of " + country + " is" + " London");
                    break;
                case "Germany":
                    System.out.println("The capital of " + country + " is" + " Berlin");
                    break;
                case "Japan":
                    System.out.println("The capital of " + country + " is" + " Tokio");
                    break;
                default:
                    System.out.println("The capital of " + country + " is" + " Unknown");

            }

        }














    }

}






