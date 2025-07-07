package learn.spring.studentmanagementsystemcrud.Service;

import java.util.List;

import learn.spring.studentmanagementsystemcrud.Entity.Student;

public interface StudentService {
    // a service interface layer to provide services to other for loose coupling
    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student addStudent(Student student);

    void deleteStudent(Long id);

    Student updateStudent(Student student);
}
