import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
    private Map<String,Student> students;

    public School() {
        this.students = new HashMap<>();
    }

    public void addStudent(String key, Student student) {
        this.students.put(key,student);
    }

    public void printStudents() {
        for (Map.Entry<String,Student> entry : students.entrySet()) {
            System.out.println(entry);
        }
    }

    public Student findStudentByID(String studentID) {
        return this.students.get(studentID);
    }

    public void removeStudent(String studentID) {
        this.students.remove(studentID);
    }

    public void showCoursesOfStudent(Student student) {
        System.out.println(student.getMyCourse());
    }
}