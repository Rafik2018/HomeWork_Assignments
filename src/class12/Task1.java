package class12;

public class Task1 {

    public static void main(String[] args) {

/*

        1) Create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characters,
 print the character in the middle of the String.
For Example String str=hello =>l


*/

        String str = "World";
        if (!str.isEmpty()) {
            //str.length()%2!=0 checks if number of characters are odd
            if (str.length() % 2 != 0 && str.length() > 3) {
                int middle = str.length() / 2;
                System.out.println(str.charAt(middle));


            }
        }






        String str1 = "World";

        if (!str1.isEmpty()) {
            if (str1.length() % 2 == 1 && str1.length() >= 3) {
                int middleIndex = str1.length() / 2;
                System.out.println(str1.charAt(middleIndex));
            }
        }
    }
}






















/*


    String str = "1357 Hello World &^%%%^";
    String newStr =str.substring(4,16);
        System.out.println(newStr);



        */



