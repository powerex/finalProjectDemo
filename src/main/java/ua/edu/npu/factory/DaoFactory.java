package ua.edu.npu.factory;

import ua.edu.npu.dao.ExamDao;
import ua.edu.npu.dao.StudentDao;

public class DaoFactory {

    private static StudentDao studentDao;
    private static ExamDao examDao;

    static {
        studentDao = new StudentDao();
        examDao = new ExamDao();
    }

    public static StudentDao getStudentDao() {
        return studentDao;
    }

    public static ExamDao getExamDao() {
        return examDao;
    }
}
