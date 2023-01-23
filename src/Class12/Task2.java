package Class12;

public class Task2 {
    public static void main(String[] args) {

        //    2) Create a String and print it in reverse order (Sunday → yadnuS).

        String str1 = "Sunday";
        String newStr1 = "";
        for(int i = str1.length()-1; i>=0; i--) {
            newStr1 += str1.charAt(i);
        }
             System.out.println(newStr1);




    }



}



















    /*   String str = "Sunday";
    String newStr = new StringBuilder(str).reverse().toString();
        System.out.println(newStr);

*/







