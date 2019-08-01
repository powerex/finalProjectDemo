package ua.edu.npu.command;

import ua.edu.npu.dto.StudentDTO;
import ua.edu.npu.facade.GenerateStudentReportFacade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class GenerateStudentsReportCommand extends AbstractCommand {
    private GenerateStudentReportFacade facade = new GenerateStudentReportFacade();

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        List<StudentDTO> studentDTOList = facade.getAllStudents();
        request.setAttribute("students", studentDTOList);

        return "students";
    }
}
