package Class11;

public class Task4_2D_Array_SumNumbers {

    public static void main(String[] args) {

/*

            Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
            Print the sum of all numbers.
*/

        int[][] numbers = {{10, 20, 30,}, {40, 50, 60}, {70, 80, 90,}};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];

            }
        }
        System.out.println("The summary of all numbers is " + sum);





        System.out.println("--------------------------------------");





        int i=0;
        int j=0;

        while ( i<numbers.length){
            while (j<numbers[i].length){
                sum+=numbers[i][j];
                j++;
            }
            i++;
            j=0;
        }
        System.out.println("The summary of all numbers is "+sum);



    }


}










