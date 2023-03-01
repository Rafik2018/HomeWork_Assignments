package class30;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task1_BestBuyStore {
    public static void main(String[] args) {


/*
    1) Create a map of Best Buy store. Place
    item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
    Retrieve all keys and values from a Best Buy map using EntrySet.*/


        Map<Integer, String> bestbuy = new TreeMap<>();

        bestbuy.put(11111, "laptop");
        bestbuy.put(11112, "TV");
        bestbuy.put(11113, "Screen");
        bestbuy.put(11114, "Phone");
        bestbuy.put(11115, "Printer");

        Set<Map.Entry<Integer,String>>entrySet = bestbuy.entrySet();
        for (Map.Entry<Integer, String> entry : bestbuy.entrySet()) {
            System.out.println("Item ID is " + entry.getKey() + " item name is " + entry.getValue());
        }


    }
}
