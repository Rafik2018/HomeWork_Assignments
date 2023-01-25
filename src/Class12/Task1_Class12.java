package Class12;

public class Task1_Class12 {

    public static void main(String[] args) {


        String str = "World";
        if (!str.isEmpty()) {
            //str.length()%2!=0 checks if number of characters are odd
            if (str.length() % 2 != 0 && str.length() > 3) {
                int middle = str.length() / 2;
                System.out.println(str.charAt(middle));


            }

        }
    }
}
