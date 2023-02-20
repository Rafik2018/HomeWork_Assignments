package Class28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class Insurance {


    public String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

     abstract double getQuote();
     abstract void cancelInsurance();

}

class Car extends Insurance {

    public String carModel;

    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }
    @Override
    public double getQuote() {
        return 1000.0;
    }

    public String CarModel(){
        return carModel;
    }
    @Override
    public void cancelInsurance() {

    }
}


class Pet extends Insurance {

    public String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }

    public String petType() {
        return petType;
    }

    public double getQuote() {
        return 500.0;
    }

    @Override
    public void cancelInsurance() {

    }
}


class Health extends Insurance {

    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    double getQuote() {
        return 0;
    }

    @Override
    public void cancelInsurance() {
    }


    public static class Card {

        public String cardType;
        public double interestRate;

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


        public static void main(String[] args) {


            ArrayList<Insurance> insuranceList = new ArrayList<>();


            Car carInsurance = new Car("Car Insurance AAA", "Toyota");
            Pet petInsurance = new Pet("Pet Insurance PPP", "Dog");
            Health healthInsurance = new Health("Health Insurance HHH ");
            insuranceList.add(carInsurance);
            insuranceList.add(petInsurance);
            insuranceList.add(healthInsurance);
            for (Insurance currentInsurance : insuranceList) {
                System.out.println(currentInsurance.insuranceName);
                System.out.println(currentInsurance.getQuote());
                currentInsurance.cancelInsurance();



            }

            System.out.println("---------------------------------------------");


            LinkedList<Card> cardList = new LinkedList<>();

            Card card1 = new Card("Visa", 22.00);
            Card card2 = new Card("MasterCard", 23.99);
            Card card3 = new Card("Amex", 24.99);
            cardList.add(card1);
            cardList.add(card2);
            cardList.add(card3);

            for (Card card : cardList) {
                System.out.println(card.cardType);
                System.out.println(card.interestRate);
            }

        }

    }
}































