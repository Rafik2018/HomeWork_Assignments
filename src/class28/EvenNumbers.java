package class28;

import java.util.ArrayList;

public class EvenNumbers {

    //  5)Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.

    public static void main(String[] args) {

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i = 2; i <= 500; i++) {
            evenNumbers.add(i);
        }
        for (int i = 0; i < evenNumbers.size(); i++) {

            int number = evenNumbers.get(i);
            if (number % 5 == 0) {
                evenNumbers.remove(i);
                i--;
            }
        }
        for (int number : evenNumbers) {
            System.out.println(number);
        }

    }
}


