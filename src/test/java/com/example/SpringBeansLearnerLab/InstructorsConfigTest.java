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
public class InstructorsConfigTest {

    @Autowired
    @Qualifier("usaInstructors")
    Instructors usInstructors;

    @Autowired
    @Qualifier("ukInstructors")
    Instructors ukInstructors;

    @Autowired
    @Qualifier("allInstructors")
    Instructors allInstructors;

    @Test
    public void tcUsaInstructorsTest() {
        //Given
        String expectedInstructor = "Dolio";
        //When
        String actualInstructor = usInstructors.findById(1L).getName();
        //Then
        Assert.assertEquals(expectedInstructor,actualInstructor);
    }

    @Test
    public void tcUsaInstructorsCountTest() {
        //Given
        int expectedCount = 5;
        //When
        int actualCount = usInstructors.size();
        //Then
        Assert.assertEquals(expectedCount,actualCount);
    }

    @Test
    public void tcUkInstructors() {
        //Given
        String expectedInstructor = "Bob";
        //When
        String actualInstructor = ukInstructors.findById(10L).getName();
        //Then
        Assert.assertEquals(expectedInstructor,actualInstructor);
    }

    @Test
    public void tcUkInstructorsCountTest() {
        //Given
        int expectedCount = 5;
        //When
        int actualCount = ukInstructors.size();
        //Then
        Assert.assertEquals(expectedCount,actualCount);
    }

    @Test
    public void allInstructorsTest() {
        //Given
        String expectedInstructor = "Bob";
        //When
        String actualInstructor = allInstructors.findById(10L).getName();
        //Then
        Assert.assertEquals(expectedInstructor,actualInstructor);
    }

    @Test
    public void allInstructorsCountTest() {
        //Given
        int expectedCount = 10;
        //When
        int actualCount = allInstructors.size();
        //Then
        Assert.assertEquals(expectedCount,actualCount);
    }
}