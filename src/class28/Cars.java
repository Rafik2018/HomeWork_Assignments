package class28;

import java.util.ArrayList;
public class Cars {
    public static void main(String[] args) {

        /* 2) Create an arraylist of cars and retrieve all the values using 3 different ways. */


        System.out.println("-----------------Method 1-----------------------");
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Mazda");
        cars.add("Subaru");

        // Method 1: Retrieve all values using a for loop
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("-----------------Method 2-----------------------");
        // Method 2: Retrieve all values using an enhanced for loop
        for (String value : cars) {
            System.out.println(value);
        }

        System.out.println("-----------------Method 3-----------------------");
        // Method 3: Retrieve all values using print ArrayList
        System.out.print(cars);



        }
    }















