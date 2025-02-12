package com.almat.stud_ms.studentapp.service;

import com.almat.stud_ms.studentapp.exception.ResourceNotFoundException;
import com.almat.stud_ms.studentapp.factory.AttendanceFactory;
import com.almat.stud_ms.studentapp.model.Attendance;
import com.almat.stud_ms.studentapp.model.Student;
import com.almat.stud_ms.studentapp.repository.AttendanceRepository;
import com.almat.stud_ms.studentapp.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AttendanceService {

    private final AttendanceRepository attendanceRepository;
    private final StudentRepository studentRepository;

    public AttendanceService(AttendanceRepository attendanceRepository, StudentRepository studentRepository) {
        this.attendanceRepository = attendanceRepository;
        this.studentRepository = studentRepository;
    }

    public void addAttendance(Long studentId, Attendance attendance) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));

        // Use the factory to create an Attendance object
        Attendance newAttendance = AttendanceFactory.createAttendance(student, attendance.isPresent());

        attendanceRepository.save(newAttendance);
    }

    public Map<String, Object> getAttendanceSummary(Long studentId) {
        List<Attendance> attendanceList = attendanceRepository.findAllByStudent_Id(studentId);
        long totalDays = attendanceList.size();
        long presentDays = attendanceList.stream().filter(Attendance::isPresent).count();
        double percentage = totalDays == 0 ? 0 : (presentDays * 100.0 / totalDays);

        Map<String, Object> summary = new HashMap<>();
        summary.put("attendancePercentage", percentage);
        summary.put("attendanceDetails", attendanceList);

        return summary;
    }
}
