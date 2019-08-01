package ua.edu.npu.dao;

import ua.edu.npu.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "AZbest", 23, "11122333"));
        students.add(new Student(2, "Bob", 23, "11122333"));
        students.add(new Student(3, "Martin", 23, "11122333"));
        return students;
    }

}
