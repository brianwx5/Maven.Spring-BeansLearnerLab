package com.example.SpringBeansLearnerLab;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentConfigTest {

    @Autowired
    @Qualifier("students")
    Students students;

    @Autowired
    @Qualifier("previousStudents")
    Students previousStudents;

    @Test
    public void currentStudentsTest() {
        //Given
        String expectedStudent = "Eric";
        //When
        Student actualStudent = students.findById(1l);
        //Then
        Assert.assertEquals(expectedStudent,actualStudent.name);
    }

    @Test
    public void currentStudentsCountTest() {
        //Given
        int expectedCount = 5;
        //When
        int actualCount = students.size();
        //Then
        Assert.assertEquals(expectedCount,actualCount);
    }

    @Test
    public void previousStudents() {
        //Given
        String expectedStudent = "Nafis";
        //When
        Student actualStudent = previousStudents.findById(1l);
        //Then
        Assert.assertEquals(expectedStudent,actualStudent.name);
    }

    @Test
    public void previousStudentsCount() {
        //Given
        int expectedCount = 5;
        //When
        int actualCount = previousStudents.size();
        //Then
        Assert.assertEquals(expectedCount,actualCount);
    }
}