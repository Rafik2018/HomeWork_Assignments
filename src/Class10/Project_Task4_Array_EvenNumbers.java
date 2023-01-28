package Class10;

public class Project_Task4_Array_EvenNumbers {


    public static void main(String[] args) {

      /*  4) Create a 2D array or integer type where you will store odd and even numbers.
        Develop a program which will identify/print the even numbers only.*/


int [][] numbers = {{1,3,5,7,9},{2,4,6,8,10},
                             {11,13,15,17,19},
                             {12,14,16,18,20}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j] + " ");
                }
            }
        }
    }
}



