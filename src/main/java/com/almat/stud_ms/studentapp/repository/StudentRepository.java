package com.almat.stud_ms.studentapp.repository;

import com.almat.stud_ms.studentapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
