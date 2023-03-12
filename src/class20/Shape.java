package class20;

public class Shape {

/*

1. Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle. Test your code
*/

        double radius;

        Shape(double radius) {
        this.radius = radius;
    }
        void displayOfRadius() {
        System.out.println("The radius of shape is " + radius);
    }
}
         class Circle extends Shape {

         double dia;
       float pi;
         double area;

       Circle(double radius, double dia, float pi, double area) {

        super(radius);
        this.dia = dia;
        this.pi = pi;
        this.area = area;
    }
    void displayOfCircle() {
        System.out.println();
        System.out.println("The result of method how to calculate the area of circuit   " + dia + pi + area);
    }



    public static void main(String[] args) {

        Circle circle = new Circle(15, 55, 3.14f, 100);
        circle.displayOfRadius();
        circle.displayOfCircle();

    }
}










