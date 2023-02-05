package Class19;

public class ClassA {


    //  Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.


    String Java;

    void displayA() {
        System.out.println("  Java Class A  ");
    }

}

class ClassB extends ClassA {
    String Python;

    void displayB() {
        System.out.println("  Python Class B");
    }

}

class ClassC extends ClassB {
    String Ruby;

    void displayC() {
        System.out.println("  Ruby  Class C");


    }

    public static void main(String[] args) {


        ClassA classA = new ClassA();
        classA.Java = "Hello Java";
        classA.displayA();
        System.out.println(classA.Java);


        ClassB classB = new ClassB();
        classB.Python = "Hello Python";
        classB.displayA();
        classB.displayB();
        System.out.println(classB.Python);


        ClassC classC = new ClassC();
        classC.Ruby = "Hello Ruby";
        classC.displayB();
        classC.displayC();
        System.out.println(classC.Ruby);


    }
}



