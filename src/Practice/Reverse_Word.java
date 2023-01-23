package Practice;

public class Reverse_Word {

    public static void main(String[] args) {





        String str = "Sunday";
        String newStr = new StringBuilder(str).reverse().toString();
        System.out.println(newStr);




        System.out.println("-------------------------------------------");


        String str1 = "Sunday";
        String newStr1 = "";
        for(int i = str1.length()-1; i>=0; i--) {
            newStr1 += str1.charAt(i);
        }
        System.out.println(newStr1);


















        String originalStr = "Friday";
        String reverseStr = "";

        for (int i = originalStr.length() - 1; i >= 0; i--) {
            reverseStr += originalStr.charAt(i);
        }
        System.out.println("Original String: " + originalStr);
        System.out.println("Reverse String: " + reverseStr);

    }
}
