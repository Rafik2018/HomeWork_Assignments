package Class17;

public class Task_6_Book {

/*
6) Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed

    */

    String name;
    String author;
    int year;


   Task_6_Book (String name1,String author1, int year1){
        name=name1;
        author=author1;
        year=year1;

    }
   Task_6_Book (String name1, int year1, String author1){
        name=name1;
        author=author1;
        year=year1;

    }


    void print(){
        System.out.println("name of the book: "+name+", author of the book: "+author+", publication year: "+year);

    }

}







