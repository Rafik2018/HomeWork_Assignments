package class28;

import java.util.Iterator;
import java.util.LinkedList;

public class Cards {

        /* Create a Card class that will have interest rate field and card type
            and a constructor that will initialize the fields.
            Create 3 objects of different card and store them into LinkedList.
            Using for loop/advanced for loop/ iterator access all methods of the class.*/

        public static void main(String[] args) {

            Card card1 = new Card("Visa", 12.5);
            Card card2 = new Card("Debit", 11.75);
            Card card3 = new Card("Saving", 15.0);

            LinkedList<Card> cards = new LinkedList<>();
            cards.add(card1);
            cards.add(card2);
            cards.add(card3);

            for (int i = 0; i < cards.size(); i++) {
                Card card = cards.get(i);
                card.approved();
                card.deposited();
            }
            System.out.println("*************************************************************");

            for (Card card : cards) {
                card.approved();
                card.deposited();
            }
            System.out.println("**************************************************************");

            Iterator<Card> iterator = cards.iterator();
            while (iterator.hasNext()) {
                Card cd = iterator.next();
                cd.approved();
                cd.deposited();
            }
        }
    }

    class Card {

        String cardType;
        double interestRate;

        public Card(String cardType, double interestRate) {
            this.cardType = cardType;
            this.interestRate = interestRate;

        }

        void approved() {
            System.out.println("Your credit limit increased in " + cardType + " and your interest is " + interestRate);
        }

        void deposited() {
            System.out.println("The amount has been deposited to your " + cardType + " account");
        }
    }


