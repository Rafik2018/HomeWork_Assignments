package class17;

public class Task_3 {
    /*


        3) Write a java class that have 4 constructors with 4 different access levels of constructors
                (private,public,default,protected)
        and create 4 objects of this class: 1 - inside same class;
    2 - from outside the class; 3 - from different class inside different package  and observe result.


    */


    private Task_3() {
        System.out.println("Constructor without any parameters");
    }

    Task_3(String name) {
        System.out.println("Constructor with a String as parameter");
    }


    protected Task_3(int number) {
        System.out.println("Constructor with an int as parameter");
    }


    public Task_3(char c) {
        System.out.println("Constructor with a char as parameter");
    }

    public static void main(String[] args) {
        Task_3  task1 = new Task_3();
        Task_3 task2 = new Task_3("Java");
        Task_3 task3= new Task_3(1000);
        Task_3 task4 = new Task_3('G');


    }
}




  /*  String name;
    int sn ;
    String province;
    String cellNumber;

    private Task_3(String name2,int sn2,String province2,String number){
        name=name2;
        sn=sn2;
        province=province2;
        cellNumber=number;

    }
    Task_3(String name2,String number,String province2) {
        name = name2;
        province = province2;
       cellNumber = number;
    }
    protected Task_3(String name2,int sn2,String number) {
        name = name2;
        sn = sn2;
        cellNumber = number;
    }
    public Task_3(int sn2,String province,String number,String name2) {
        sn = sn2;
        province = province;
        cellNumber = number;
        name=name2;
    }

    public void print(){
        System.out.println(name+sn+province+cellNumber);
    }

    public static void main(String[] args) {
        Task_3 pI = new Task_3("Mike ",96547880," Ontario "," (416)345-6660");
      pI.print();*/

















