package class28;

import java.util.ArrayList;

public class Drinks {


    public static void main(String[] args) {

        //   4) Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.


        ArrayList<String> drinks = new ArrayList<>();

        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("juice");
        drinks.add("water");

        for (int i = 0; i < drinks.size(); i++) {
            String drink = drinks.get(i);
            if (drink.contains("a") || drink.contains("e")) {
                drinks.set(i, "Water");
            }
        }
        for (String drink : drinks) {
            System.out.println(drink);
        }
    }
}



