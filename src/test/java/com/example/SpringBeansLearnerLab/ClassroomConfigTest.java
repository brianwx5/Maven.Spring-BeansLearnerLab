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
public class ClassroomConfigTest {

    @Autowired
    @Qualifier("currentCohort")
    Classroom currentCohort;

    @Autowired
    @Qualifier("previousCohort")
    Classroom previousCohort;

    @Test
    public void currentCohortTest() {
        //Given
        String expectedName = "Cristina";
        //When
        String actualName = currentCohort.students.findById(5l).getName();
        //Then
        Assert.assertEquals(expectedName,actualName);
    }

    @Test
    public void currentCohortCountTest() {
        //Given
        int expectedStudentCount = 5;
        //When
        int actualStudentCount = currentCohort.students.size();
        //Then
        Assert.assertEquals(expectedStudentCount,actualStudentCount);
    }

    @Test
    public void previousCohortTest() {
        //Given
        String expectedName = "Joker";
        //When
        String actualName = previousCohort.students.findById(5l).getName();
        //Then
        Assert.assertEquals(expectedName,actualName);
    }

    @Test
    public void previousCohortCountTest() {
        //Given
        int expectedStudentCount = 5;
        //When
        int actualStudentCount = previousCohort.students.size();
        //Then
        Assert.assertEquals(expectedStudentCount,actualStudentCount);
    }
}