package Class19;

public class Teacher {

/*

    Write a Java program called Teacher.  Identify features and 4 behaviour of that Class. Create 3 subclasses MathTeacher,
    ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. Test all 4 classes

*/


    String teacherName;
    int teacherID;

    public void  assignments  (){
        System.out.println("Assignments always important");

    }

public void  grade (){
    System.out.println("Grade does not matter");
}

public  void  classTasks (){
    System.out.println("Class Tasks are good practice for the students");

}

public void  homeWork(){
    System.out.println(" Home works improve student ability  ");
}

}

class MathTeacher extends Teacher{
    String subject;
    String test;

    void  best (){
        System.out.println("The Math class is a best ");
    }

}

class  MusicTeacher extends Teacher{

    String classic;
    String  popular;

    void  different (){
        System.out.println("Music class is  very interesting ");

    }

}

class  LanguageTeacher extends Teacher{

    String grade;
    String task;

    void  hard(){
        System.out.println("This class is  hard ");
    }
}



