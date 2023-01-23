import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//   %d=for integers     %s=for Strings      %f=for float

String name = "Rafik is %d years old";

        System.out.println(name.length());

        System.out.println(name.toUpperCase());


        System.out.println(name.indexOf("bob"));
        System.out.println(name.indexOf("18"));


    int age =18;
        System.out.printf(name,age);



    }


}