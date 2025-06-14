package com.exponent.config;

import com.exponent.entity.Batch;
import com.exponent.entity.Course;
import com.exponent.entity.Faculty;
import com.exponent.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name="course1")
    public Course getCourse1() {
        Course course = new Course();
        course.setCourseId(1);
        course.setCourseName("Bsc");
        return course;
    }
    @Bean
    @Primary
    public Course getCourse2() {
        Course course = new Course();
        course.setCourseId(2);
        course.setCourseName("Msc");
        return course;
    }

    @Bean(name="faculty1")
    public Faculty getFaculty() {
        Faculty faculty = new Faculty();
        faculty.setFacultyId(1);
        faculty.setFacultyName("John Doe");
        return faculty;
    }

    @Bean(name="batch")
    public Batch getBatch() {
        Batch batch = new Batch();
        batch.setBatchId(1);
        batch.setBatchName("Batch-58");
        return batch;
    }

    @Bean(name = "student")
    @Scope(value = "prototype")
    public Student getStudent() {
        Student student = new Student();
        student.setStudentId(1);
        student.setStudentName("Donald Tatya");
        return student;
    }


}
