package com.example.studentsdemo.repositories;

import com.example.studentsdemo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findStudentById(long kw);

}
