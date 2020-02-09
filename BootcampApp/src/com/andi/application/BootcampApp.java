package com.andi.application;

import java.util.Arrays;

public class BootcampApp {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp("Batch 4");
        bootcamp.addTrainee(new Trainee("Charles", "c", 20));
        bootcamp.addTrainee(new Trainee("Andi", "a", 20));
        for(Trainee trainee: bootcamp.getTrainees()) {
            System.out.println(trainee);
        }
    }
}
