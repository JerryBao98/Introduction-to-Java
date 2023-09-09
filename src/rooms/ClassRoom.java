package rooms;

import people.Student;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {

    // has a list of students
    // also has a teacher
    // might? have a jr. teacher

 
    private final List<Student> students;

    public ClassRoom(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
}
