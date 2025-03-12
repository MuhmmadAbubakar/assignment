package test;

import src.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

class ClinicTest {
    private Clinic clinic;
    private Patient patient;
    private Physiotherapist physiotherapist;
    private Treatment treatment;
    private Appointment appointment;

    @BeforeEach
    void setUp() {
        clinic = new Clinic();
        patient = new Patient("P001", "John Doe", "123 Street", "1234567890");
        physiotherapist = new Physiotherapist("T001", "Dr. Smith", "456 Avenue", "0987654321", new String[]{"Physiotherapy"});
        treatment = new Treatment("Massage", 60);
        appointment = new Appointment("A001", "1st May 2025, 10:00", patient, physiotherapist, treatment);

        clinic.addPatient(patient);
        clinic.addPhysiotherapist(physiotherapist);
    }

    @Test
    void testBookAppointment() {
        clinic.bookAppointment(appointment);
        assertTrue(clinic.searchByExpertise("Physiotherapy").contains(physiotherapist));
    }

    @Test
    void testCancelAppointment() {
        patient.bookAppointment(appointment);
        patient.cancelAppointment(appointment);
        assertFalse(patient.bookAppointment(appointment));  // Ensuring appointment is removed
    }

    @Test
    void testGenerateReport() {
        clinic.bookAppointment(appointment);
        assertDoesNotThrow(() -> clinic.generateReport());
    }

    @Test
    void testIncrementAttendedAppointments() {
        appointment.updateStatus("Attended");
        assertEquals(1, physiotherapist.getAttendedAppointments());
    }
}
