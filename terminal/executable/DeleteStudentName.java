package terminal.executable;

import data.Student;
import service.StudentService;

public class DeleteStudentName extends DeleteStudentExecutable{
    private StudentService studentService;
    private Student student;

    public DeleteStudentName(StudentService studentService, Student student) {
        super(studentService, student);
    }
    @Override
    public void execute() {
        studentService.deleteStudentName(student);
    }
}
