package Practice;

public class duplicate_elements {


    public static void main(String[] args) {


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



