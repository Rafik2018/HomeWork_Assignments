package class16;

public class Task1_sum_elements {

/*
    1) Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible by the creating an instance of the class
    */


    int sumArEl(int[] array){

        int sum=0;
        for (int number:array) {
            sum+=number;
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 20};
        Task1_sum_elements task1 = new Task1_sum_elements();

        System.out.println(task1.sumArEl(arr));



    }


}
