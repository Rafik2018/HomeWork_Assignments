package Practice;

import java.util.Arrays;

public class Max_Min {
    public static void main(String[] args) {

/*

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);




*/





    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(numbers);
        System.out.println("Maximum number is: "+numbers[numbers.length-1]);
        System.out.println("Minimum number is: "+numbers[0]);


}
}

/*

    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int max1 = numbers[0];
    int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] > max1) {
        max2 = max1;
        max1 = numbers[i];
        } else if (numbers[i] > max2) {
        max2 = numbers[i];
        }
        }
        System.out.println("Second largest number is: " + max2);
        }
        }


*/
