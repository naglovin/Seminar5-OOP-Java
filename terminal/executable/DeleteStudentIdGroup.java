package terminal.executable;

import data.Student;
import service.StudentService;

public class DeleteStudentIdGroup extends DeleteStudentExecutable{
    private StudentService studentService;
    private Student student;

    public DeleteStudentIdGroup(StudentService studentService, Student student) {
        super(studentService, student);
    }

    @Override
    public void execute() {
        studentService.deleteStudentIdGroup(student);
    }
}