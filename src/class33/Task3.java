package class33;

public class Task3 {

/*3) Create a method to check age eligibility that will throw a runtime exception.
    Method should throw an exception age is less than 16.*/

    public static void checkAgeEligibility(int age) {
        if (age < 16) {
            throw new RuntimeException("Age is less than 16 is not eligible ");
        } else {
            throw new RuntimeException("Age 16 and over is eligible ");
        }
    }

    public static void main(String[] args) {
        int age = 15;
        try {
            checkAgeEligibility(age);
        } catch (RuntimeException rte) {
            System.out.println("RuntimeException --> " + rte.getMessage());
        }
    }
}
