package class10;

public class Project_Task11_Array_Duplicate_Element {
    public static void main(String[] args) {


        //   11)Write a program to print out duplicate elements from an Array of Strings?

        String str = "beautiful beach";
        char[] carray = str.toCharArray();

        System.out.println("The string is:" + str);
        System.out.print("Duplicate Characters in above string are: ");

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (carray[i] == carray[j]) {
                    System.out.print(carray[j] + " ");
                    break;
                }
            }
        }
    }
}