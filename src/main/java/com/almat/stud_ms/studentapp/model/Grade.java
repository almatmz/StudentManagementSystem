package com.almat.stud_ms.studentapp.model;

import jakarta.persistence.*;

@Entity
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;
    private String subject;
    private double score;


    public Grade() {
    }

    public Grade(Student student, String subject, double score) {
        this.student = student;
        this.subject = subject;
        this.score = score;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", student=" + (student != null ? student.getId() : "null") +
                ", subject='" + subject + '\'' +
                ", score=" + score +
                '}';
    }
}
