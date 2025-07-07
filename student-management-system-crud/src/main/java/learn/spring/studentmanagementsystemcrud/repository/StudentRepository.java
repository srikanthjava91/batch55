package learn.spring.studentmanagementsystemcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import learn.spring.studentmanagementsystemcrud.Entity.Student;

//@Repository // letting know its Repository rather than default // not needed on service layer
public interface StudentRepository extends JpaRepository<Student, Long> {
	// <entity name , typeof primary key> // type of primary key cannot be primitive
}
