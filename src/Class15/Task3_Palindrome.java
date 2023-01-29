package Class15;

public class Task3_Palindrome {

    /*3) Create a method that will print whether given String is palindrome or not.*/



            Boolean palindrome(String word) {
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


    }


}







