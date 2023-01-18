package Class9;

public class Task_2 {
    public static void main(String[] args) {
/*
        2) Create an array of names and store all names of your group.
        Then print your name from that array. (use 2 different ways of creating an array).

        */


       String[] names1 = {"Slava", "Savo", "Umut", "Rafik"};
        System.out.println("My name is " + names1[3]);

        System.out.println("------------------------------------------");


        String[] names2 = new String[]{"Slava", "Rafik","Savo", "Umut", };
        System.out.println("My name is " + names2[1]);



    }



}
