package class10;

public class Project_Task10_Array_Second_LargestNum {

    public static void main(String[] args) {

   // 10) Write a java program to find the second largest number in the array?

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max1 = numbers[0];
        int max2 =Integer.MIN_VALUE;
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



