import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        School mySchool = new School();
        mySchool.addStudent("5501",new Student("John", "Doe"));
        mySchool.addStudent( "5502",new Student("Jane", "Smith"));
        mySchool.addStudent( "5503",new Student("Joe", "Miller"));
        mySchool.addStudent("5504",new Student("Carl", "Meyer"));
        mySchool.printStudents();
        mySchool.removeStudent("5503");
        mySchool.printStudents();
        Student searchStudent = mySchool.findStudentByID("5502");
        if (searchStudent != null) {
            searchStudent.addCourse(new Course("Math","Mr. Müller","102"));
            searchStudent.addCourse(new Course("English","Mr. Schwartz","106"));
            mySchool.showCoursesOfStudent(searchStudent);
        }

        mySchool.printStudents();

    }

}
