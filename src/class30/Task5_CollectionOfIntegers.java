package class30;

import java.util.ArrayList;
import java.util.Collection;

public class Task5_CollectionOfIntegers {

    public static void main(String[] args) {



       /* 5)Create a collection of integers in which you can keep duplicates.
                Write a logic to find sum of all integers*/

       Collection<Integer> intList = new ArrayList<>();

       intList.add(5);
       intList.add(10);
       intList.add(15);
       intList.add(20);
       intList.add(25);
       intList.add(30);

       var sum = 0;

       for (var num :intList){
           sum+=num;
       }
        System.out.println("The summary of all Integers is "+sum);



    }


}
