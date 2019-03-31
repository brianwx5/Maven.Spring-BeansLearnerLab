package com.example.SpringBeansLearnerLab;

import java.util.Arrays;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {

    //Fields
    public List<PersonType> personList;



    //Constructor
    public People (List<PersonType> personList) {
        this.personList = personList;
    }

    //Methods
    public void add (PersonType person) {
        personList.add(person);
    }

    public void remove (PersonType person) {
        personList.remove(person);
    }

    public int size () {
        return this.personList.size();
    }

    public void clear () {
        this.personList.clear();
    }

    public void addAll (Iterable<PersonType> iterableList) {
        for (PersonType person: iterableList) {
            this.personList.add(person);
        }
    }

    public PersonType findById (long id) {
        for (PersonType person: personList) {
            if(person.getId() == id) {
                return person;
            }
        } return null;
    }

    public List<PersonType> findAll () {
        return personList;
    }
}
