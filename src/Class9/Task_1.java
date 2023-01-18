package Class9;

public class Task_1 {

    public static void main(String[] args) {


      /*  1) Create an array of chars and store grades into it: A,B,C,D,E,F.
                Then print a grade B (use 2 different ways of creating an array).
*/


        char[] grade1 = {'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println("Grade B: " + grade1[1]);

        System.out.println("************************************");

        char[] grade2 = new char[]{'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println("Grade B: " + grade2[1]);

    }


}
