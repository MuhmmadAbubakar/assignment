package com.clinic.models;

public class Treatment {
    private String name;
    private int duration; // in minutes

    public Treatment(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }
}