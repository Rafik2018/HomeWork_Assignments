package Practice;

public class Sum_Num {

    public static void main(String[] args) {


        int[][] arr = {{1, 3, 5, 7, 9, 11, 13, 15, 17, 19},
                {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}};

        int evenSum = 0;
        int oddSum = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    evenSum += arr[i][j];
                } else {
                    oddSum += arr[i][j];
                }
            }


            System.out.println("********************************************************");






            int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            int sum = 0;

            for (int k = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers[i].length; j++) {
                    sum += numbers[i][j];
                }
            }
            System.out.println("The sum of all numbers in the 2D array is: " + sum);


        }

    }
}
