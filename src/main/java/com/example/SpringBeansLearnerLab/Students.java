package com.example.SpringBeansLearnerLab;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Students extends People<Student> {
    public Students(List<Student> personList) {
        super(personList);
    }

    @Override
    public Iterator<Student> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Student> action) {

    }

    @Override
    public Spliterator<Student> spliterator() {
        return null;
    }
}
