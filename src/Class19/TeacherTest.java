package Class19;

public class TeacherTest {

    public static void main(String[] args) {


        Teacher teacher = new Teacher();
        teacher.teacherName = "Mary";
        teacher.teacherID = 111;

        System.out.println("This is head of all Teachers her name is " + teacher.teacherName);
        teacher.assignments();
        teacher.grade();

        MathTeacher mt = new MathTeacher();
       mt.teacherName="Jane";
       mt.teacherID=222;
       mt.subject="Math";
        System.out.println(mt.subject+"teacher is "+mt.teacherName);
        mt.best();
        mt.classTasks();


        MusicTeacher mu = new MusicTeacher();
        mu.teacherName="Anna";
        mu.teacherID=333;
        System.out.println("Students love to study music with teacher " +mu.teacherName);
        mu.different();
        mu.homeWork();
        mu.grade();


        LanguageTeacher lg = new LanguageTeacher();
        lg.teacherName="Jason";
        lg.teacherID=444;
        System.out.println("Teacher "+lg.teacherName +"  speaks in many different languages");
        lg.hard();




    }
}





