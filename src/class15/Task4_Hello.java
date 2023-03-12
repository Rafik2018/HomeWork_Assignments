package class15;

public class Task4_Hello {

   /* 4)Create a method that will say Hello in different language
    based on the country that will passed when method is executed

    */

    String Hello(String country){
switch (country){
    case  "Turkey":
        return "Selam";
    case  "Spain":
        return "Hola";
    case  "Italy":
        return "Ciao";
    case  "Germany":
        return  "Hallo";
    default:
        return "Hello";

        }
    }

    public static void main(String[] args) {
        Task4_Hello task4 = new  Task4_Hello();
        System.out.println(task4.Hello("Italy"));


        }




    }







