package com.almat.stud_ms.studentapp.service;

import com.almat.stud_ms.studentapp.exception.ResourceNotFoundException;
import com.almat.stud_ms.studentapp.model.Attendance;
import com.almat.stud_ms.studentapp.model.Grade;
import com.almat.stud_ms.studentapp.model.Student;
import com.almat.stud_ms.studentapp.repository.AttendanceRepository;
import com.almat.stud_ms.studentapp.repository.GradeRepository;
import com.almat.stud_ms.studentapp.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}

