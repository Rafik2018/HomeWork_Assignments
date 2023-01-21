package Class10;

public class Project_Task6_Array_SwapTempNum {

    public static void swapNumbers(int[] arr) {

  //      6)Write a program to swap 2 numbers without a temporary variable?



        arr[0] = arr[0] + arr[1];
        arr[1] = arr[0] - arr[1];
        arr[0] = arr[0] - arr[1];
    }

    public static void main(String[] args) {
        int[] arr = {5, 10};
        swapNumbers(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}