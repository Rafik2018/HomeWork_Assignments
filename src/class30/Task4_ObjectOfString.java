package class30;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task4_ObjectOfString {


    public static void main(String[] args) {


      /*  4)Create the collection that will store single uniques Objects of a String type in which order is preserved.
        Write a logic to concatenate all string from the collection.
        */

        Set<String> s = new LinkedHashSet<>();

        s.add("Java");
        s.add("is a");
        s.add("Best");

        for (String j:s){
            System.out.println(j+" ");
        }


    }


}
