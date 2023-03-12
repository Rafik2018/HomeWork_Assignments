package class22;

public class CC {
    /*

            Create a class CreditCard and define variable balance and interest.
            Create an instance method that will calculate interest based on the given balance.
            Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
            Call the method by creating an object of each of the three classes.
    */
    double balance;
    double inetrest;

    double intCal(double balance, double interest) {
        balance = 270000;
        interest = 2.5;
        return (interest * balance / 100);
    }
}

class Visa extends CC {

}


class AX extends CC {

    @Override
    double intCal(double balance, double interest) {
        balance = 370000;
        interest = 1.5;
        return (interest * balance / 100);
    }
}

class CCTester {
    public static void main(String[] args) {

        CC cc = new CC();
        System.out.println("Credit Card annual interest amount is " + cc.intCal(370000, 1.5));

        Visa visa = new Visa();
        System.out.println("Visa annual interest amount is " + visa.intCal(100000, 3.5));

        AX ax = new AX();
        System.out.println("AX annual interest amount is " + ax.intCal(270000, 2.5));

    }

}








































  /*



    double balance;
    double interest;

    double calculateInterest(double balance,double interest){
        return balance *(interest/1000);
    }
}
class Visa extends CC{

}
class AX extends CC{
    @Override
    double calculateInterest(double balance, double interest) {
        return super.calculateInterest(balance,interest)+15;
    }
}
class CreditCardTester{

    public static void main(String[] args) {

        CC creditCard=new CC();
        System.out.println(creditCard.calculateInterest(15000,5));

        Visa visa=new Visa();
        System.out.println(visa.calculateInterest(15000,5));

        AX ax=new AX();
        System.out.println(ax.calculateInterest(15000,5));
            }
        }*/




