package com.example.SpringBeansLearnerLab;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlumniTest {

    @Autowired
    @Qualifier("previousStudents")
    Students previousStudents;

    @Autowired
    @Qualifier("allInstructors")
    Instructors allInstructors;

    @Autowired
    Alumni alumni;


    @Test
    public void alumniTest() {
        //Given
        double expected = 1200.0;
        //When
        alumni.executeBootCamp();
        //Then
        previousStudents.forEach(student -> Assert.assertEquals(expected,student.getTotalStudytime(),0));
    }

    @Test
    public void alumniTeacherTest() {
        //Given
        double expected = 600.0;
        //When
        alumni.executeBootCamp();
        //Then
        allInstructors.forEach(instructor -> Assert.assertEquals(expected,instructor.getNumberOfHoursTaught(),0));
    }
}