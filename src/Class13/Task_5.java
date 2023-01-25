package Class13;

public class Task_5 {
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






    }

}
