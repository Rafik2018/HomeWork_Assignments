package Class10;

public class Project_Task11_Array_Duplicate_Element {
    public static void main(String[] args) {


     //   11)Write a program to print out duplicate elements from an Array of Strings?


        String[] input = {"hello", "world", "hello", "java", "python", "java"};
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i].equals(input[j])) {
                    System.out.println(input[i]);


                }


            }
        }
    }
}
