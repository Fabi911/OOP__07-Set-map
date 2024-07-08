import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Course> myCourse;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.myCourse = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Course> getMyCourse() {
        return myCourse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(myCourse, student.myCourse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, myCourse);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", myCourse=" + myCourse +
                '}';
    }

    // Bonus Task
    public void addCourse(Course course) {
        this.myCourse.add(course);
    }
}



