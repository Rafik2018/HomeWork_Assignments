package class9;

public class Task_4 {


    public static void main(String[] args) {

       /* 4) Create an array that can store names of cars and store 6 elements into it.
             Print all values from the array.
        */


        String[] car = new String[6];

        car[0] = "Audi";
        car[1] = "BMW";
        car[2] = "Mercedes";
        car[3] = "Toyota";
        car[4] = "Honda";
        car[5] = "Subaru";

        for (int i = 0; i < car.length; i++) {
            System.out.print(car[i] + "  ");
        }


        System.out.println();


String [] cars={"Toyota", "Honda", "Ford", "Nissan", "lexus", "Mazda"};
for (String vehicle:cars){
    System.out.print(vehicle +"  ");
    }


}
}


