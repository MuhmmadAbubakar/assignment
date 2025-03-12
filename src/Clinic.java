package src;

import java.util.*;

public class Clinic {
    private List<Physiotherapist> physiotherapists;
    private List<Patient> patients;
    private List<Appointment> appointments;

    public Clinic() {
        this.physiotherapists = new ArrayList<>();
        this.patients = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

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
            if (Arrays.asList(physio.getExpertiseAreas()).contains(expertise)) {
                result.add(physio);
            }
        }
        return result;
    }

    public void generateReport() {
        System.out.println("\n--- Clinic Report ---");
        for (Appointment appt : appointments) {
            System.out.println(appt.getDetails());
        }
    }
}

