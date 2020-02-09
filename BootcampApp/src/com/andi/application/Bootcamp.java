package com.andi.application;

public class Bootcamp {
    private String name;
    private Trainee[] trainees;

    public Bootcamp(String name, Trainee[] trainees) {
        this.name = name;
        this.trainees = trainees;
    }

    public Bootcamp(String name) {
        this.name = name;
        this.trainees = new Trainee[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trainee[] getTrainees() {
        return trainees;
    }

    public void setTrainees(Trainee[] trainees) {
        this.trainees = trainees;
    }

    public void addTrainee(Trainee newTrainee) {
        int oldLength = this.trainees.length;
        Trainee[] newTrainees = new Trainee[oldLength + 1];
//        System.arraycopy(this.trainees, 0, newTrainees, 0, oldLength);
        for(int i = 0; i < this.trainees.length; i++) {
            newTrainees[i] = this.trainees[i];
        }
        newTrainees[oldLength] = newTrainee;
        this.trainees = newTrainees;

    }
}
