package class23;

 class StudentTester {

    public static void main(String[] args) {


        Student [] students={new CollegeStudent(), new SyntaxStudent(),new SchoolStudent()};

        for (Student student:students){
            student.HomeWorkActivity();
            student.practiceActivity();
            student.studyActivity();
        }
    }
}