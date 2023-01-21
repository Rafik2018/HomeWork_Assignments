package Practice;

public class Initialize_2D_Array_of_integers_Sum {

        public static void main(String[] args) {



    // Initialize 2D array of integers

    int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    // Initialize variables to store sum of even and odd numbers

    int evenSum = 0, oddSum = 0;

    // Iterate through the 2D array

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            // Check if current number is even or odd and add to the appropriate sum
            if (arr[i][j] % 2 == 0) {
                evenSum += arr[i][j];
            } else {
                oddSum += arr[i][j];
            }
        }
    }

    // Print the sum of even and odd numbers

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
}


 /*       It will print out
        Sum of even numbers: 20
        Sum of odd numbers: 25
*/












        }
