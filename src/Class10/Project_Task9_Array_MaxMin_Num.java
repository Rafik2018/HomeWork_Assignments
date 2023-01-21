package Class10;

public class Project_Task9_Array_MaxMin_Num {


    public static void main(String[] args) {

   //     9) Maximum and minimum number in the array?


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













    }
}

