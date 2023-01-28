package Class11;

public class Task1_2D_Array_StudentsGrade {
    public static void main(String[] args) {

        /*1) Create a 2D array(shorter way) in which first array will consist of 4 names and
        second array will contain grades.Then your program should print name of the students
        that has A and B grade (edited)*/


        String[][] students = {{"Tom", "David", "John", "Steve"},
                {"A", "B", "C", "D"},};


        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                if (students[i][j].equals("A") || students[i][j].equals("B")) {
                    System.out.println(students[0][j]);
                }
            }


        }
    }

}