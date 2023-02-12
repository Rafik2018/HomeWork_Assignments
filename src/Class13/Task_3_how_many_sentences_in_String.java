package Class13;

public class Task_3_how_many_sentences_in_String {

    public static void main(String[] args) {


       /* 3) You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        How would you find out how many sentences are in that String?
*/


        String a = "Is is Saturday?  Is it raining? Do we have a Java class today?";

        String[] aArr = a.split("[?]");
        System.out.println(aArr.length);


    }
}

   /* String b = "Is is Saturday?  Is it raining? Do we have a Java class today?";

    String [] aArr1=b.split("[?]");
        System.out.println(aArr1.length);
        System.out.println(aArr1[2]);

}
*/