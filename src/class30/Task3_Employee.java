package class30;

import java.util.HashMap;
import java.util.Map;

public class Task3_Employee {

    public static void main(String[] args) {

       /* 3)Create a Map that will store Employee name and salary.
        Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
        John Smith=$100000*/


        Map<String, Integer> empinfo = new HashMap<>();

        empinfo.put("John Smith", 110000);
        empinfo.put("Mike Grey", 115000);
        empinfo.put("Jane Brown", 125000);


        var entrySet = empinfo.entrySet();
        int highest = 0;
        String employee = "";
        for (var e : entrySet) {
            if (e.getValue() > highest) {
                highest = e.getValue();
                employee = e.getKey();

            }
        }
        System.out.println(employee+" "+highest+"$");

    }
}