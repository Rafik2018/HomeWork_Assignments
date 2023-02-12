package Class23;

public class Computer {


   /* Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some of the methods in child classes
            Define some methods specific to child classes
            Create objects of child classes and store them into array. Loop through each object and execute available methods.*/

public void Hardware(){
    System.out.println(" Processor of Computers ");

}

    void  Software(){
        System.out.println("Operation Systems of Computers");

    }


    void  Application(){
        System.out.println("Accessible to the applications");


    }

}

class Apple extends Computer{
    @Override
    public void Hardware() {
        System.out.println(" Processing with 'M' type processors............Apple");
    }

    @Override
    void Software() {
        System.out.println("Operates on MacOs...........Apple");
    }

   @Override
    void Application() {
       System.out.println(" Limited accessibility to the applications...........Apple");
    }
}



class Lenovo extends Computer{
    @Override
    public void Hardware() {
        System.out.println("Durable hinges,can stand the test of time...........Lenovo");
    }

    }


class HP extends Computer{

    @Override
    void Software() {
        System.out.println("Operates on Windows Os............Lenovo");
    }


    }

class Dell extends Computer{
    @Override
    void Application() {
        System.out.println("Life tech/support application available...........Dell");
    }
}





