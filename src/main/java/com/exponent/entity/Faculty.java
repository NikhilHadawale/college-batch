package com.exponent.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Faculty
{
    private int facultyId;
    private String facultyName;
    @Autowired
    @Qualifier("course1")
    private Course course1;
    //private Course course2;

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyId=" + facultyId +
                ", facultyName='" + facultyName + '\'' +
                ", course1=" + course1 +
                '}';
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public Course getCourse1() {
        return course1;
    }

    public void setCourse1(Course course1) {
        this.course1 = course1;
    }

}
