package Class29;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class Task_3 {
    public static void main(String[] args) {
       /*
        Create a Set collection that will hold Objects of Student Type.
        In this set we do not care about the insertion order.
        Each student object should have name and studentID. Display name of each student.
         */

        //HashSet<Student> students2=new HashSet<>();
        Set<Student> students=new HashSet<>(); // we can achieve polymorphism
        students.add(new Student("Fifa",123));
        students.add(new Student("Lilia L", 456));
        students.add(new Student("Sofia S", 567));
        students.add(new Student("Maya M", 555));

        // Display the name of each student
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
class Student{
    private String name;
    private int studentID;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }



}




      /*  HashMap<Integer, String> students=new HashMap<>();
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


*/