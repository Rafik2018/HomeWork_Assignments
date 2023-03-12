package class10;

import java.util.Scanner;

public class Project_Task1_Array_SumNumbers {
    public static void main(String[] args) {

        //     1) Using Scanner create an array of integer values.
        //   After the array is created, calculate the sum of all stored elements in that array.




        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 numbers");

        int[] numbers = new int[5];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
            sum = sum + numbers[i];
        }
        System.out.println("Sum of elments is " + sum);


    }
}







 /*  Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();


        int[] numbers = new int[5];
        numbers[0] = 11;
        numbers[1] = 22;
        numbers[2] = 33;
        numbers[3] = 44;
        numbers[4] = 55;



        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
                sum = sum + numbers[i];

            }
        System.out.println("The sum of the elements in the array is " + sum);
        }

    }*/







