package Project_2;

public interface Shape {

    /*Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
     Create 2 classes Circle &  Square that implements functionality defined in the Shape Interface. Test your code.*/


    double calculateArea();
   double calculatePerimeter();




      class Square implements Shape {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double calculateArea() {
            return side * side;
        }

        @Override
        public double calculatePerimeter() {
            return 4 * side;
        }
    }

         class Circle implements Shape {
            private double radius;

            public Circle(double radius) {
                this.radius = radius;
            }

            @Override
            public double calculateArea() {
                return Math.PI * radius * radius;
            }

            @Override
            public double calculatePerimeter() {
                return 2 * Math.PI * radius;
            }
        }



          public static void main(String[] args) {

            Shape circle = new Circle(9);
            System.out.println("Circle Area: " + circle.calculateArea());
            System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

            Shape square = new Square(6);
            System.out.println("Square Area: " + square.calculateArea());
            System.out.println("Square Perimeter: " + square.calculatePerimeter());
        }
    }













