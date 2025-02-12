package com.almat.stud_ms.studentapp.factory;

import com.almat.stud_ms.studentapp.model.Attendance;
import com.almat.stud_ms.studentapp.model.Student;

public class AttendanceFactory {
    public static Attendance createAttendance(Student student, boolean isPresent) {
        Attendance attendance = new Attendance();
        attendance.setStudent(student);
        attendance.setPresent(isPresent);
        return attendance;
    }
}
