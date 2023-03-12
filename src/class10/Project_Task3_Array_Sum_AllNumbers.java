package class10;
public class Project_Task3_Array_Sum_AllNumbers {
    public static void main(String[] args) {

     //         3) Create a 2D array of integer values. Print the sum of all numbers.

int [][] numbers = {{11, 22, 33, 44, 55,},
                    {66, 77, 88, 99, 100}};
int sum=0;

    for (int i=0; i<numbers.length; i++){
    for (int j=0; j<numbers[i].length; j++){
        sum+=numbers[i][j];
    }
}
        System.out.println("The summary of all numbers in the 2D array is "+sum);

    }

}



