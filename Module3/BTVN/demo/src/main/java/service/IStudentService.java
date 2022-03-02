package service;

import model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAllStudent();

    void saveStudent(Student student);

    Student findByCodeStudent(int codeStudent);

    void updateStudent(Student student);

}
