package com.almat.stud_ms.studentapp.repository;

import com.almat.stud_ms.studentapp.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
    List<Attendance> findAllByStudent_Id(Long studentId);
}

