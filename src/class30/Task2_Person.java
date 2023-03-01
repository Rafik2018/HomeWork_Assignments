package class30;

import java.util.Map;
import java.util.TreeMap;

public class Task2_Person {

/*2) Create a Person class with following private fields: name, lastName, age, salary.
    Variables should be initialized through constructor.
    Inside the class also create a method to print user details.
    In Test Class create a Map that will store key in ascending order.
    In that map store personId and a Person Object. Print each object details.*/


    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Task2_Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println(name +" "+ lastName +" "+ age +" "+ salary);
    }


    public class PersonTest {

    }

    public static void main(String[] args) {


        Map<Integer, Task2_Person> personinfo = new TreeMap<>();

        Task2_Person person1 = new Task2_Person("Mike", "Bold", 35, 65000.0);
        Task2_Person person2 = new Task2_Person("Bob", "Johnson", 42, 75000.0);
        Task2_Person person3 = new Task2_Person("Jane", "Smith", 28, 60000.0);

        personinfo.put(1, person1);
        personinfo.put(2, person2);
         personinfo.put(3,person3);

        for (Task2_Person person : personinfo.values()) {
            person.printDetails();
            System.out.println();
    }}



}







