//Создать класc CommandExecutableFactory
//        - Реализовать в нём метод CommandExecutable create (String[] input),
//        где в зависимости от переданных параметров создается тот или иной класс
//        - Использовать этот класс и метод в классе TerminalReader


package terminal;

import data.Student;
import service.StudentService;
import terminal.executable.*;

public class CommandExecutableFactor {
    StudentService studentService;
    public CommandExecutable create (String[] input){
        if (input[0].equals("/add")){
            return new CreateStudentExecutable(
                    studentService, new Student(input[1]));

        }
        if (input[0].equals("/delName")){
                return new DeleteStudentName(
                        studentService, new Student(input[1]));
        }
        if (input[0].equals("/delIdGr")) {
            return new DeleteStudentIdGroup(
                    studentService, new Student(input[1]));
        }
        if (input[0].equals("/delAge")){
            return new DeleteStudentAge(
                    studentService, new Student(input[1]));
        else{
            return new DeleteStudentExecutable(
                    studentService, new Student(input[1]));
        }
            return null;

    }
}
