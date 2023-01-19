package terminal.executable;

import data.Student;
import service.StudentService;

public class DeleteStudentAge extends DeleteStudentExecutable{
    private StudentService studentService;
    private Student student;

    public DeleteStudentAge(StudentService studentService, Student student) {
        super(studentService, student);
    }

    @Override
    public void execute() {
        studentService.deleteStudentAge(student);
    }
}