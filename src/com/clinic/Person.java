package com.clinic.entities;

public abstract class Person {
    protected String id;
    protected String fullName;
    protected String address;
    protected String phoneNumber;

    public Person(String id, String fullName, String address, String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }
}