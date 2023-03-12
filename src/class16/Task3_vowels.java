package class16;

public class Task3_vowels {

/*3) Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name.
    */



    private static String getOnlyVowels (String inputStr){
        return inputStr.replaceAll("[^aeiou]","");


    }


    public static void main(String[] args) {
        System.out.println(getOnlyVowels("Java"));









     /*   private String vowels(String str){

    System.out.println(str.replaceAll("[^aeiou]",""));
    return str;
}


    public static void main(String[] args) {
    Task3_vowels tk = new Task3_vowels();
        System.out.println(tk.vowels("Assignment "));


        */




    }



}
