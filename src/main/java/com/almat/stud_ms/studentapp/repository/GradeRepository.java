package com.almat.stud_ms.studentapp.repository;

import com.almat.stud_ms.studentapp.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GradeRepository extends JpaRepository<Grade, Long> {
    List<Grade> findAllByStudent_Id(Long studentId);
}

