package class15;

public class Task3_Palindrome {

    /*3) Create a method that will print whether given String is palindrome or not.*/


        void palindrome(String str) {
        StringBuilder st = new StringBuilder(str);
        st.reverse();
        String reversedStr = st.toString();
        if (str.equals(reversedStr)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " not is palindrome");
        }
    }

    public static void main(String[] args) {
        Task3_Palindrome task3 = new Task3_Palindrome();
        task3.palindrome("rotator");



    }


}
      //   This code is ok but not correct one



      /*  Boolean palindrome(String word) {
        StringBuilder str = new StringBuilder(word);
        if (word.equals(str.reverse().toString())) {
        return true;
        } else {
        return false;

        }
        }
public static void main(String[] args) {
        Task3_Palindrome task3 = new Task3_Palindrome();
        String word = "rotator";
        System.out.println("Is "+word+ " word  palindrome? "+task3.palindrome(word));
*/