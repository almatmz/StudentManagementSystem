package com.almat.stud_ms.studentapp.controller;

import com.almat.stud_ms.studentapp.model.Attendance;
import com.almat.stud_ms.studentapp.service.AttendanceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/students")
public class AttendanceController {

    private final AttendanceService attendanceService;

    public AttendanceController(AttendanceService attendanceService) {
        this.attendanceService = attendanceService;
    }

    @PostMapping("/{studentId}/attendance")
    public ResponseEntity<String> addAttendance(@PathVariable Long studentId, @RequestBody Attendance attendance) {
        attendanceService.addAttendance(studentId, attendance);
        return ResponseEntity.ok("Attendance added successfully!");
    }

    @GetMapping("/{studentId}/attendance-summary")
    public ResponseEntity<Map<String, Object>> getAttendanceSummary(@PathVariable Long studentId) {
        return ResponseEntity.ok(attendanceService.getAttendanceSummary(studentId));
    }

}