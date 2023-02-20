package Class28;

/*port java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;


*//*
6) Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
        Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
        Create 3 objects of the sub classes and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.
        Create a Card class that will have interest rate field and card type
        and a constructor that will initialize the fields.
        Create 3 objects of different card and store them into LinkedList.
        Using for loop/advanced for loop/ iterator access all methods of the class

*/


import java.util.ArrayList;
import java.util.LinkedList;

abstract class Insurance {
    protected String insuranceName;

    public abstract void getQuote();
    public abstract void cancelInsurance();
}

class Car extends Insurance {
    private String carModel;

    public Car(String insuranceName, String carModel) {
        this.insuranceName = insuranceName;
        this.carModel = carModel;
    }

    public void getQuote() {
        System.out.println("AutoInsurance Quote is "+ 1000.00);
    }

    public void cancelInsurance() {
        System.out.println("Car Model is"+carModel);
    }
}



class Pet extends Insurance {
    private String petType;

    public Pet(String insuranceName, String petType) {
        this.insuranceName = insuranceName;
        this.petType = petType;
    }

    public void getQuote() {
        System.out.println("PetInsurance Quote is "+ 500.00);
    }

    public void cancelInsurance() {
        System.out.println("Pet Type is"+ petType);
    }
}

class Health extends Insurance {
    public Health(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public void getQuote() {
        System.out.println(0.00);
    }

    public void cancelInsurance() {
        System.out.println("Health Insurance cancelled ");

        System.out.println("---------------------------------");
    }






    public static void main(String[] args) {
        ArrayList<Insurance> insuranceList = new ArrayList<>();
        insuranceList.add(new Car("Car Insurance", " Honda Civic"));
        insuranceList.add(new Pet("Pet Insurance", " Dog"));
        insuranceList.add(new Health("Health Insurance"));

        for (Insurance insurance : insuranceList) {
            insurance.getQuote();
            insurance.cancelInsurance();

        }

        LinkedList<Card> cardList = new LinkedList<>();
        cardList.add(new Card("Visa", 12.5));
        cardList.add(new Card("MasterCard", 11.75));
        cardList.add(new Card("Amex", 15.0));

        for (Card card : cardList) {
            System.out.println("Card type: " + card.getCardType());
            System.out.println("Interest rate: " + card.getInterestRate());
        }
    }
}

class Card {
    private String cardType;
    private double interestRate;

    public Card(String cardType, double interestRate) {
        this.cardType = cardType;
        this.interestRate = interestRate;
    }

    public String getCardType() {
        return cardType;
    }

    public double getInterestRate() {
        return interestRate;
    }
}



















































