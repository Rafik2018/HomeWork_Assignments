package Class13;

public class Task_4 {
    public static void main(String[] args) {



        /*4) How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever

*/

    StringBuilder str =  new StringBuilder("This is sentence I want reverse");
        System.out.println(str.reverse());


        System.out.println("--------------------------------------------");


        String s = "level";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if (rev.equals(s)) {
            System.out.println("This is palindrome :" + s);
        } else {
            System.out.println("This is not palindrome");

        }




    }



}
