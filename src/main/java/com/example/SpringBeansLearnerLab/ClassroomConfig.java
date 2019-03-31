package com.example.SpringBeansLearnerLab;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Bean (name = "currentCohort")
    @DependsOn({"students", "allInstructors"})
    public Classroom currentCohort(@Qualifier("students") Students students, @Qualifier("allInstructors") Instructors instructors) {
        return new Classroom(students,instructors);
    }


    @DependsOn({"previousStudents", "allInstructors"})
    @Bean (name = "previousCohort")
    public Classroom previousCohort(@Qualifier("previousStudents") Students students, @Qualifier("allInstructors") Instructors instructors) {
        return new Classroom(students,instructors);
    }
}
