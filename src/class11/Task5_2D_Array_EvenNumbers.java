package class11;

public class Task5_2D_Array_EvenNumbers {

    public static void main(String[] args) {


        /*  Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
            Develop a program which will identify/print the even numbers only. /*
  */


    int [][] integers = {{1,2,3,4,},{5,6,7,8,},{9,10,11,12}};


    for (int i=0; i<integers.length; i++) {
        for (int j = 0; j < integers[i].length; j++) {
            if (integers[i][j] % 2 == 0) {
                System.out.print(integers[i][j] + " ");
            }


        }


    }







    }
}
