package Class8;

import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {

/*


        4) Write a program to ask a user to enter item they want to buy and
          the price of that item.

          Every time user enters money accumulate the amount and tell the user how much is
         left to pay off.

          If user give more money program should return a change.

         Whenever a user done with payments program should say

        "Thank you for shopping!

       */


        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the item name");
        String item = s.nextLine();
        System.out.println("Please enter the item price");
        double itemPrice = s.nextDouble();

        double remaining = itemPrice;
        double amountPayed = 0;


        while (remaining > 0) {

            System.out.println("Enter the amount to pay");
            double payment = s.nextDouble();
            amountPayed += payment;
            remaining = itemPrice - amountPayed;

            if (remaining > 0) {
                System.out.println("Remaining amount to pay" + remaining);
            } else {
                double change = -remaining;
                System.out.println("Change" + change);
            }

            System.out.println("Thank you for shopping ");
    }

    }
}
