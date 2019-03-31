package com.example.SpringBeansLearnerLab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1l,"Eric"));
        studentList.add(new Student(2l,"Kate"));
        studentList.add(new Student(3l,"Charlie"));
        studentList.add(new Student(4l,"Julian"));
        studentList.add(new Student(5l,"Cristina"));

        return new Students(studentList);
    }

    @Bean(name = "previousStudents")
    public Students previousStudents() {
        List<Student> previousList = new ArrayList<>();
        previousList.add(new Student(1l,"Nafis"));
        previousList.add(new Student(2l,"Troy"));
        previousList.add(new Student(3l,"Brofist"));
        previousList.add(new Student(4l,"Conner"));
        previousList.add(new Student(5l,"Joker"));

        return new Students(previousList);
    }
}
