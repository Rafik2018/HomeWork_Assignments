package Class12;

public class Task1 {

    public static void main(String[] args) {

/*

        1) Create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characters,
 print the character in the middle of the String.
For Example String str=hello =>l


*/
        String str = "World" ;

       if (!str.isEmpty()) {
            if (str.length() % 2 == 1 && str.length() >= 3) {
                int middleIndex = str.length() / 2;
                System.out.println(str.charAt(middleIndex));
            }
        }

    }
}





































/*


    String str = "1357 Hello World &^%%%^";
    String newStr =str.substring(4,16);
        System.out.println(newStr);



        */



