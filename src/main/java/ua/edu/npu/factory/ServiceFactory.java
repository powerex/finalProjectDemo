package ua.edu.npu.factory;

import ua.edu.npu.service.StudentService;

public class ServiceFactory {
    private static StudentService studentService = new StudentService();

    private ServiceFactory(){

    }

    public static StudentService getStudentService() {
        return studentService;
    }
}
