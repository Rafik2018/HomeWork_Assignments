package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class SampleArroy {

    public static void main(String[] args) {


               Scanner scan = new Scanner(System.in);
                System.out.println("Please Enter 5 Numbers!");
                int[] numbers = new int[5];
                // Below code uses a normal for loop to ask the user for numbers and         store them in the array.

                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = scan.nextInt();
                }
                System.out.println(Arrays.toString(numbers));
            }
        }





