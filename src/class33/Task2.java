package class33;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    /*
         2) Create a static method that will return a List of Exceptions.
           Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
           Call your method inside main and print name and details of all Exception objects.
   */

    public static void main(String[] args) {



        List<Exception> exceptions = new ArrayList<>();

        try {
            double[] arr = new double [3];
            double x = arr[4];
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            Class.forName("com.python nonexistent class");
        } catch (ClassNotFoundException e) {
            exceptions.add(e);
        }
        try {
            String s = "Hello";
            Method m = s.getClass().getMethod("nonexistent Method");
        } catch (NoSuchMethodException e) {
            exceptions.add(e);
        }
        try {
            String s = "name";
            s.charAt(-1);
        } catch ( IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        for (Exception e : exceptions) {
            System.out.println(e.getClass().getSimpleName() + " -->  " + e.getMessage());

            System.out.println(".....................................................................");




        }
    }
}























