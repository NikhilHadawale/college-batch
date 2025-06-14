package com.exponent.controller;

import com.exponent.config.AppConfig;
import com.exponent.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CollegeAutoController {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Student student1 = applicationContext.getBean(Student.class);
        Student student2 = applicationContext.getBean(Student.class);

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        System.out.println(student1);
    }
}
