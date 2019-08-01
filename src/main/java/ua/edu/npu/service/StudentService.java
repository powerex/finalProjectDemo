package ua.edu.npu.service;

import ua.edu.npu.dao.StudentDao;
import ua.edu.npu.dao.ExamDao;
import ua.edu.npu.factory.DaoFactory;
import ua.edu.npu.model.Exam;
import ua.edu.npu.model.Student;

import java.util.List;

public class StudentService {
    private StudentDao studentDao = DaoFactory.getStudentDao();
    private ExamDao examDao = DaoFactory.getExamDao();

    public List<Student> getAllStudentsWithExams() {

        List<Student> students = studentDao.getStudents();
        students.forEach(student -> {
                    List<Exam> exams = examDao.getExamsByStudent(student.getId());
                    student.setExams(exams);
                });

        return students;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void setExamDao(ExamDao examDao) {
        this.examDao = examDao;
    }
}
