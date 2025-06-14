package com.exponent.controller;

import com.exponent.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollegeController {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student student = applicationContext.getBean(Student.class);
        System.out.println(student);
    }
}
