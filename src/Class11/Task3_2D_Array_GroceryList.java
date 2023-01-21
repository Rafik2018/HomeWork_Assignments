package Class11;

public class Task3_2D_Array_GroceryList {

    public static void main(String[] args) {
/*


        Using 2D array create a grocery list.
        Inside you should have an array of veggies, fruits, dairy and sweets.
        Retrieve all values from that array using 2 different loops
*/


        String [][] GroceryList ={{"Vegetables:","Potato","Tomato","Union",""},{"Dairy:","Milk","Yogurt","Cheese"},
                                 {"Fruits:","Apple","Banana","Orange"},{"Sweets:","Chocolate","Cookies","Cake"}};


for (int i=0; i<GroceryList.length; i++){
    for ( int j=0; j<GroceryList[i].length; j++){
        System.out.print(GroceryList[i][j] + "  ");
    }
    System.out.println();


}
        System.out.println("----------------------------------------------------");

int i=0;
int j=0;

while (i<GroceryList.length){
    while (j<GroceryList[i].length){
        System.out.print(GroceryList[i][j]+" ");
        j++;
    }
    System.out.println();
    j=0;
    i++;

        }


    }

}
