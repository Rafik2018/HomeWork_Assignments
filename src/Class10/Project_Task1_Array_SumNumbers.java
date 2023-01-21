package Class10;

import java.util.Scanner;

public class Project_Task1_Array_SumNumbers {
    public static void main(String[] args) {

      //     1) Using Scanner create an array of integer values.
     //   After the array is created, calculate the sum of all stored elements in that array.

        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();


        int[] numbers = new int[5];
        numbers[0] = 66;
        numbers[1] = 44;
        numbers[2] = 55;
        numbers[3] = 35;
        numbers[4] = 20;



        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
                sum = sum + numbers[i];

            }
        System.out.println("The sum of the elements in the array is " + sum);
        }

    }



















