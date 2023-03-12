package class17;

public class Students {

/*
2)Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.

NOTE: please use different names for instance and local variables.

*/

    String name;
    int grade1;
    int grade2;
    int grade3;

    Students(String name, int grade1, int grade2, int grade3) {

        this.name   =  name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3.0;
    }

    public static void main(String[] args) {

        Students student1 = new Students("John", 80, 70, 90);
        Students student2 = new Students("Mike", 90, 70, 90);
        Students student3 = new Students("Anna", 85, 75, 95);
        Students student4 = new Students("Tina", 75, 55, 85);
        Students student5 = new Students("Bob", 65, 85, 80);

        System.out.println(student1.name + "'s average grade is : " + student1.calculateAverage());
        System.out.println(student2.name + "'s average grade is : " + student2.calculateAverage());
        System.out.println(student3.name + "'s average grade is : " + student3.calculateAverage());
        System.out.println(student4.name + "'s average grade is : " + student4.calculateAverage());
        System.out.println(student5.name + "'s average grade is : " + student5.calculateAverage());
    }

}















