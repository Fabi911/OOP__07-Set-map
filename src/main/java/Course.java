import java.util.Objects;

public class Course {
    private String courseName;
    private String instructor;
    private String room;

    public Course(String courseName, String instructor, String room) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.room = room;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseName, course.courseName) && Objects.equals(instructor, course.instructor) && Objects.equals(room, course.room);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, instructor, room);
    }

    @Override
    public String toString() {
        return "Course:" +
                "courseName='" + courseName + '\'' +
                ", instructor='" + instructor + '\'' +
                ", room='" + room + '\'';
    }
}
