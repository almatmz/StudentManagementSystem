package com.almat.stud_ms.studentapp.service;

import com.almat.stud_ms.studentapp.exception.ResourceNotFoundException;
import com.almat.stud_ms.studentapp.model.Grade;
import com.almat.stud_ms.studentapp.model.Student;
import com.almat.stud_ms.studentapp.repository.GradeRepository;
import com.almat.stud_ms.studentapp.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService {

    private final GradeRepository gradeRepository;
    private final StudentRepository studentRepository;

    public GradeService(GradeRepository gradeRepository, StudentRepository studentRepository) {
        this.gradeRepository = gradeRepository;
        this.studentRepository = studentRepository;
    }

    public void addGrade(Long studentId, Grade grade) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));
        grade.setStudent(student);
        gradeRepository.save(grade);
    }

    public List<Grade> getGradesByStudentId(Long studentId) {
        return gradeRepository.findAllByStudent_Id(studentId);
    }
}
