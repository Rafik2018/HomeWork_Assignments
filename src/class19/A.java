package class19;

public class A {


    //   Write program to inherit class A that has method printF which is static and call or reuse that method into class B


    static void printF() {
        System.out.println("Calling method F from class A");

    }
}

class B extends A {
    void printInfo() {
        System.out.println("Hello Java");

    }


    public static void main(String[] args) {

        B classB = new B();
        classB.printInfo();
        classB.printF();


    }
}

