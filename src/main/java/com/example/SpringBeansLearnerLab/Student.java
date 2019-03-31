package com.example.SpringBeansLearnerLab;

public class Student extends Person implements Learner {
    public double totalStudytime = 0;

    public Student(long id, String name) {
        super(id, name);
    }

    public double getTotalStudytime() {
        return totalStudytime;
    }

    public void setTotalStudytime(double totalStudytime) {
        this.totalStudytime = totalStudytime;
    }

    @Override
    public void learn(double numberOfHours) {
        this.totalStudytime += numberOfHours;
    }
}
