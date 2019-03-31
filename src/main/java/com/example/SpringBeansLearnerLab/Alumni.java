package com.example.SpringBeansLearnerLab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class Alumni {

    private Students students;
    private Instructors instructors;

    @Autowired
    public Alumni(@Qualifier("previousStudents") Students students, @Qualifier("allInstructors") Instructors instructors) {
        this.students = students;
        this.instructors = instructors;
    }

    @PostConstruct
    public void executeBootCamp() {
        List<Student> studentList = students.findAll();
        List<Instructor> instructorList = instructors.findAll();
        int numberOfInstructors = instructors.size();
        int numberOfStudents = students.size();
        double numberOfHoursToTeachEachStudent = 1200;
        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
        double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;

        instructorList.forEach(instructor -> instructor.lecture(studentList,numberOfHoursPerInstructor));
    }

    public Students getPreviousStudents() {
        return students;
    }

    public Instructors getAllInstructors() {
        return instructors;
    }
}
