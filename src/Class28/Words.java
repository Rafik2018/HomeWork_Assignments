package Class28;

import java.util.ArrayList;

public class Words {


    public static void main(String[] args) {


        //  3)Create an arrayList of words. Remove every word that ends with “e”.


        ArrayList<String> words = new ArrayList<>();

        words.add("apple");
        words.add("banana");
        words.add("corvette");
        words.add("melon");
        words.add("kiwi");

       words.removeIf(s -> s.endsWith("e"));
        System.out.println(words);
    }


}
