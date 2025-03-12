package com.clinic.models;

import com.clinic.entities.Patient;
import com.clinic.entities.Physiotherapist;

public class Appointment {
    private String appointmentId;
    private String dateTime;
    private String status;
    private Patient patient;
    private Physiotherapist physiotherapist;
    private Treatment treatment;

    public Appointment(String appointmentId, String dateTime, Patient patient, Physiotherapist physiotherapist, Treatment treatment) {
        this.appointmentId = appointmentId;
        this.dateTime = dateTime;
        this.status = "Booked";
        this.patient = patient;
        this.physiotherapist = physiotherapist;
        this.treatment = treatment;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        if (newStatus.equals("Attended")) {
            physiotherapist.incrementAttendedAppointments();
        }
    }

    public String getDetails() {
        return "Appointment: " + appointmentId + ", Date: " + dateTime + ", Status: " + status +
                ", Patient: " + patient.getFullName() + ", Physiotherapist: " + physiotherapist.getFullName() +
                ", Treatment: " + treatment.getName();
    }
}