package Class16;

public class Task2_reverse {

/*

    2) Create a method that will take a String as a parameter and returns reversed String.
    Method should be availableto all classes within your project and accessible by class name.
*/


       public static String reverseStr (String input) {
        return new StringBuilder(input).reverse().toString();


    }


    public static void main(String[] args) {


        reverseStr("Monday");





    /*    public String reverse (String str) {


     StringBuilder stringBuilder = new StringBuilder(str);
     String reverce = stringBuilder.reverse().toString();

return reverce;
 }


    public static void main(String[] args) {
        Task2_reverse task2 = new Task2_reverse();
        System.out.println(task2.reverse("world"));

*/





    }


    }