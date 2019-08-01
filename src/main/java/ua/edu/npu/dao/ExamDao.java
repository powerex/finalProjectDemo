package ua.edu.npu.dao;

import ua.edu.npu.model.Exam;
import ua.edu.npu.model.Student;
import ua.edu.npu.model.Teacher;
import ua.edu.npu.enums.Score;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ExamDao {
    public List<Exam> getExamsByStudent(int id) {
        List<Exam> exams = new ArrayList<>();
        if (id == 1) {
            exams.add(new Exam(1, new Teacher(1), new Student(1), LocalDateTime.now(), Score.A));
            exams.add(new Exam(2, new Teacher(1), new Student(1), LocalDateTime.now(), Score.B));
        } else if (id == 2) {
            exams.add(new Exam(2, new Teacher(1), new Student(2), LocalDateTime.now(), Score.D));
        } else {
            exams.add(new Exam(2, new Teacher(1), new Student(3), LocalDateTime.now(), Score.A));
        }
        return exams;
    }
}
