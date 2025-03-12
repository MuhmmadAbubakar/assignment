package src;

import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {
    private List<Appointment> appointments;

    public Patient(String id, String fullName, String address, String phoneNumber) {
        super(id, fullName, address, phoneNumber);
        this.appointments = new ArrayList<>();
    }

    public void bookAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void cancelAppointment(Appointment appointment) {
        appointments.remove(appointment);
    }
}
