package com.clinic;

import com.clinic.models.Clinic;
import com.clinic.entities.Patient;
import com.clinic.entities.Physiotherapist;
import com.clinic.models.Treatment;
import com.clinic.models.Appointment;

public class Main {
    public static void main(String[] args) {
        Clinic clinic = new Clinic();

        Patient patient1 = new Patient("P001", "John Doe", "123 Street", "1234567890");
        Physiotherapist physio1 = new Physiotherapist("T001", "Dr. Smith", "456 Avenue", "0987654321",
                new String[] { "Physiotherapy" });
        Treatment treatment1 = new Treatment("Massage", 60);
        Appointment appointment1 = new Appointment("A001", "1st May 2025, 10:00", patient1, physio1, treatment1);

        clinic.addPatient(patient1);
        clinic.addPhysiotherapist(physio1);
        clinic.bookAppointment(appointment1);

        System.out.println("Clinic system initialized.");
        clinic.generateReport();
    }
}