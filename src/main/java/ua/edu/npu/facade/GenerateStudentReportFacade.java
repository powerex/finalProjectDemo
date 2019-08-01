package ua.edu.npu.facade;

import ua.edu.npu.dto.StudentDTO;
import ua.edu.npu.factory.ServiceFactory;
import ua.edu.npu.model.Student;
import ua.edu.npu.service.StudentService;

import java.util.List;
import java.util.stream.Collectors;

public class GenerateStudentReportFacade {
    private StudentService studentService = ServiceFactory.getStudentService();


    public List<StudentDTO> getAllStudents() {
        List<Student> students = studentService.getAllStudentsWithExams();

        return getStudentDtoList(students);
    }

    private List<StudentDTO> getStudentDtoList(List<Student> students) {
        return students.stream().map(student -> {
            StudentDTO dto = new StudentDTO();
            dto.setName(student.getName());
            dto.setPhone(student.getPhone());
            dto.setAccepted(isAccepted(student));
            return dto;
        }).collect(Collectors.toList());
    }

    private boolean isAccepted(Student student) {
        return student.getExams()
                .stream()
                .filter(exam -> exam.getScore().getScoreValue() > 3)
                .count() > 1;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }
}
