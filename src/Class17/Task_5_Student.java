package Class17;

public class Task_5_Student {
/*

5) Write a Student class   that have instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.
*/

    String name;
    String address;

    Task_5_Student(String stName, String stAddress) {

        name = stName;
        address = stAddress;

    }

    void displayInfo() {
        System.out.println("Name" + name + " and address is" + address);


    }

}
