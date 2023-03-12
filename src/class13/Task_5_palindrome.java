package class13;

public class Task_5_palindrome {
    public static void main(String[] args) {



      /*  5) How would you check if String is palindrome or not? aba=> true
        Abbc =>false
        */

       String str =  "rotator";
       String reverse = "";
       for (int i=str.length()-1; i>=0; i--){
           reverse=reverse+str.charAt(i);
       }
       if (reverse.equals(str)) {
           System.out.println(str+  " is a  palindrome word");
       }else {
           System.out.println(str+"   is not palindrome word");
       }


        System.out.println("------------------------------------------------------------------------------");


        String original = "rotator";
        String reverse1 = new StringBuilder(original).reverse().toString();
        if (original.equalsIgnoreCase(reverse1)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }







    }

}
