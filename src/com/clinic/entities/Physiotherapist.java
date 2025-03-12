package com.clinic.entities;

import com.clinic.models.Treatment;
import java.util.ArrayList;
import java.util.List;

public class Physiotherapist extends Person {
    private String[] expertiseAreas;
    private List<Treatment> treatments;
    private int attendedAppointments;

    public Physiotherapist(String id, String fullName, String address, String phoneNumber, String[] expertiseAreas) {
        super(id, fullName, address, phoneNumber);
        this.expertiseAreas = expertiseAreas;
        this.treatments = new ArrayList<>();
        this.attendedAppointments = 0;
    }

    public void addTreatment(Treatment treatment) {
        treatments.add(treatment);
    }

    public String[] getExpertiseAreas() {
        return expertiseAreas;
    }

    public void incrementAttendedAppointments() {
        attendedAppointments++;
    }

    public int getAttendedAppointments() {
        return attendedAppointments;
    }
}