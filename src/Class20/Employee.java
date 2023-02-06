package Class20;

public class Employee {
/*

      2. Create an Employee class that will have variables and methods. Constructor that should initialize instance variables
    Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
    Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
    Test your code!*/

         String fullName;
         String iD;

        Employee(String fullName, String iD) {
        this.fullName=fullName;
        this.iD = iD;
    }
        void  infoEmp () {
        System.out.println(  "Full Name is "  +  fullName  + "  ID number is  "  + iD);
  }
  }


           class   FullTime extends Employee {

            float salary;
            int entryboNus;

      FullTime(String fullName, String iD, float salary, int entryboNus) {
          super(fullName, iD);
          this.salary = salary;
          this.entryboNus = entryboNus;
      }
           void infoFtime() {
          System.out.println("Full Name is  "  +  fullName  +  "  ID number is  "  + iD + "  bonus amount is  "  + entryboNus  + "  and salary is  "  + salary);

      }
  }



         class PartTime extends Employee {

         int overTime ;

         PartTime (String fullName, String iD, float salary, int entryboNus, int overTime){
         super(fullName,iD);
         this.overTime=overTime;
    }
           void  infoPtime(){
          System.out.println("Full Name is  "  +  fullName  +  "  ID number is  "  + iD + " overtime available for  " +  " part time work " + overTime);
      }

  }

  class  TesterSubClass extends FullTime {

      String benefits;

      TesterSubClass(String fullName, String iD, float salary, int entryboNus, String benefits) {
          super(fullName, iD, salary, entryboNus);
          this.benefits = benefits;

      }
      void testerSubclassInfo() {
          System.out.println("Full Name is  "  +  fullName  +  "  ID number is  "  + iD + "  bonus amount is  "  + entryboNus  + "  and salary is  "  + salary + " benefits of full time work is " +benefits);
      }





      public static void main(String[] args) {

          TesterSubClass testSub = new TesterSubClass(" Richard Miles "," E11 ", 125000f , 5000 ," Insurance ");
         testSub.infoEmp();
         testSub.infoFtime();
         testSub.testerSubclassInfo();

      }

}




















