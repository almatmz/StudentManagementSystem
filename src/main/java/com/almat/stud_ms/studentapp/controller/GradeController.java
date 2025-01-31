package com.almat.stud_ms.studentapp.controller;

import com.almat.stud_ms.studentapp.model.Grade;
import com.almat.stud_ms.studentapp.service.GradeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class GradeController {

    private final GradeService gradeService;

    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @PostMapping("/{studentId}/grades")
    public ResponseEntity<String> addGrade(@PathVariable Long studentId, @RequestBody Grade grade) {
        gradeService.addGrade(studentId, grade);
        return ResponseEntity.ok("Grade added successfully!");
    }

    @GetMapping("/{studentId}/grades")
    public ResponseEntity<List<Grade>> getGrades(@PathVariable Long studentId) {
        return ResponseEntity.ok(gradeService.getGradesByStudentId(studentId));
    }
}
