package class13;

public class Task_6_swapping_String {


    public static void main(String[] args) {

        /* 6) How would you swap  2 strings without a temporary variable?*/


        String x = "IntelliJ";
        String  y =  "Eclipse";



       x=x+y;
       y=x.substring(0,x.length()-y.length());
       x=x.substring(y.length());

        System.out.println("swapping string x is "+x+" y is "+y);
        System.out.println("swapping string y is " +y+" x is  "+x);





    }




}
