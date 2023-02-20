package Class28;

import java.util.ArrayList;

public class ArrayList_isEmpty {

  /* 1) Create an ArrayList that will store 5 names into it.
    Find out whether the given ArrayList is empty or not?
    Check whether the specific name is present in an ArrayList or not?
    Find the size of your arrayList and print all values from that */

    public static void main(String[] args) {


       ArrayList<String> names = new ArrayList<>();


        names.add("John");
        names.add("Jane");
        names.add("Jessica");
        names.add("Mike");
        names.add("Anna");


        //    Find out whether the given ArrayList is empty or not?
        System.out.println("The ArrayList is not empty:  " + names.isEmpty());

        //   Check whether the specific name is present in an ArrayList or not?
        System.out.println("The specific name John is present in ArrayList:  " + names.contains("John"));

        //  Find the size of your arrayList and print all values from that
        int size = names.size();
        System.out.println("The size of the ArrayList is: " + size);
        for (String value : names) {
            System.out.println(value);

        }
    }
}
















