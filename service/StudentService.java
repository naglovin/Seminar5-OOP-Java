package service;

import data.Student;
import data.comparators.UserComparator;
import repository.StudentRepository;

import java.util.Collections;
import java.util.List;

public class StudentService implements DataService<Student> {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public Student createUser(Student user) {
        return studentRepository.save(user);
    }

    @Override
    public Student findById(Integer id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student findByLastName(String lastName) {
        return studentRepository.findByLastName(lastName);
    }

    @Override
    public void sortUsers(List<Student> users) {
        Collections.sort(users);
    }

    @Override
    public void sortUsersByName(List<Student> users) {
        Collections.sort(users, new UserComparator());
    }

    public void saveStudent(Student student) {
    }

    public void deleteStudent(Student student) {
    }

    public void deleteStudentName(Student student) {
    }

    public void deleteStudentIdGroup(Student student) {
    }

    public void deleteStudentAge(Student student) {
    }
}
