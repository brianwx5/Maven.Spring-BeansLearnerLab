package com.example.SpringBeansLearnerLab;

public class Instructor extends Person implements Teacher {

    double numberOfHoursTaught = 0.0;

    public Instructor(long id, String name) {
        super(id, name);
    }

    public Double getNumberOfHoursTaught() {
        return numberOfHoursTaught;
    }

    public void setNumberOfHoursTaught(Double numberOfHoursTaught) {
        this.numberOfHoursTaught = numberOfHoursTaught;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        numberOfHoursTaught += numberOfHours;
        for (Learner learner: learners) {
            learner.learn(numberOfHours);
        }
    }
}
