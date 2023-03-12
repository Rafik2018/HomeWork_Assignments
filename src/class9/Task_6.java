package class9;

public class Task_6 {
    public static void main(String[] args) {


     /*  6)Create an array of countries. While retrieving all values from an array
        print capital for each country choose any five countries.
*/
        String[] countries = {"USA", "Canada", "UK", "Germany", "Japan"};
        String[] capitals = {"Washington", "Ottawa", "London", "Berlin", "Tokio"};
        for (int i = 0; i < countries.length; i++) {
            System.out.println("The capital of " + countries[i] + " is " + capitals[i] + " ");
        }


    }

}
