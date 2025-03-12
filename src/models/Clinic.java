package com.clinic.models;

import com.clinic.entities.Patient;
import com.clinic.entities.Physiotherapist;
import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private List<Patient> patients = new ArrayList<>();
    private List<Physiotherapist> physiotherapists = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addPhysiotherapist(Physiotherapist physiotherapist) {
        physiotherapists.add(physiotherapist);
    }

    public void bookAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public List<Physiotherapist> searchByExpertise(String expertise) {
        List<Physiotherapist> result = new ArrayList<>();
        for (Physiotherapist physio : physiotherapists) {
            for (String area : physio.getExpertiseAreas()) {
                if (area.equals(expertise)) {
                    result.add(physio);
                    break;
                }
            }
        }
        return result;
    }

    public void generateReport() {
        System.out.println("Clinic Report:");
        System.out.println("Patients: " + patients.size());
        System.out.println("Physiotherapists: " + physiotherapists.size());
        System.out.println("Appointments: " + appointments.size());
    }
}