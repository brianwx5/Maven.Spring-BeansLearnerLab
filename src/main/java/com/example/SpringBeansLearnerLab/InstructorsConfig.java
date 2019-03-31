package com.example.SpringBeansLearnerLab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Configuration
public class InstructorsConfig {

    @Bean (name = "usaInstructors")
    public Instructors tcUsaInstructors() {
        List<Instructor> tcUsaInstructors = new ArrayList<>();
        tcUsaInstructors.add(new Instructor(1l,"Dolio"));
        tcUsaInstructors.add(new Instructor(2l,"Kris"));
        tcUsaInstructors.add(new Instructor(3l,"Nhu"));
        tcUsaInstructors.add(new Instructor(4l,"Leon"));
        tcUsaInstructors.add(new Instructor(5l,"Wilhem"));

        return new Instructors(tcUsaInstructors);
    }

    @Bean (name = "ukInstructors")
    public Instructors tcUkInstructors() {
        List<Instructor> tcUkInstructors = new ArrayList<>();
        tcUkInstructors.add(new Instructor(6l,"Froilan"));
        tcUkInstructors.add(new Instructor(7l,"Kristina"));
        tcUkInstructors.add(new Instructor(8l,"Nhuena"));
        tcUkInstructors.add(new Instructor(9l,"Leona"));
        tcUkInstructors.add(new Instructor(10l,"Bob"));

        return new Instructors(tcUkInstructors);
    }

    @Primary
    @Bean (name = "allInstructors")
    public Instructors instructors() {
//        com.example.SpringBeansLearnerLab.Instructors usa = tcUsaInstructors();
//        List<com.example.SpringBeansLearnerLab.Instructor> usaInstructor = usa.personList;
//        com.example.SpringBeansLearnerLab.Instructors uk = tcUkInstructors();
//        List<com.example.SpringBeansLearnerLab.Instructor> ukInstructor = uk.personList;
//        List<com.example.SpringBeansLearnerLab.Instructor> allInstructor = new ArrayList<>();
//        allInstructor.add(usaInstructor.listIterator().next());
//        allInstructor.add(ukInstructor.listIterator().next());
//        return new com.example.SpringBeansLearnerLab.Instructors(allInstructor);

        List<Instructor> allInstructor = Stream.concat(tcUkInstructors().findAll().stream(),
                tcUsaInstructors().findAll().stream()).
                collect(Collectors.toCollection(ArrayList::new));

        return new Instructors(allInstructor);
    }


}
