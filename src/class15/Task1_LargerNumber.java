package class15;

public class Task1_LargerNumber {

/*
1) Create a method that will take 2 parameters as a numbers
    and prints which number is larger.
*/

int largeNum (int num1, int num2){
    if (num1>num2){
        return num1;

        }else {
        return num2;
    }
}

    public static void main(String[] args) {
    Task1_LargerNumber mp = new Task1_LargerNumber();
        System.out.println("The largest number is "+mp.largeNum(5,10));



    }





}
