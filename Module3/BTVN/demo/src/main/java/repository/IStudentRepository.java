package repository;

import model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAllStudent();

    void saveStudent(Student student);

    Student findByCodeStudent(int codeStudent);

    void updateStudent(Student student);
}
