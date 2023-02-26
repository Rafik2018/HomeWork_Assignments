package Class29;

import java.util.HashMap;
import java.util.HashMap;
import java.util.Objects;


public class Task_2 {
    public static void main(String[] args) {
        /*
        Create a Set collection that will hold Objects of Student Type.
         In this set we do not care about the insertion order.
         Each student object should have name and studentID.
          Display name of each student.
         */

        HashMap<Integer, String> students=new HashMap<>();
        students.put(1," Adam");
        students.put(2," Brain");
        students.put(3," Clare");
        students.put(4," Daniel");
        students.put(5," Ethan");
        students.put(6," Frank");

        System.out.println(students.keySet());

        for(Object st :students.keySet()){
            System.out.print(students.get(st));
        }
    }
}


