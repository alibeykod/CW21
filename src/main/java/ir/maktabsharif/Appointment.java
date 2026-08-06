package ir.maktabsharif;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
@Column( nullable = false)
    private String patientName;
@Column(unique = true , nullable = false)
    private String patientNationalCode;
@Column(unique = true , nullable = false)
    private String phoneNumber;
@Column( nullable = false)
    private String doctorName;
@Column( nullable = false)
    private Date appointmentDate;
@Column( nullable = false)
    private Time appointmentTime;
@Column(nullable = false)
    private double visitPrice;
@Column(unique = true , nullable = false)
    private String trackingCode;
@Column(nullable = false)
    private AppointmentStatus status;

    @Embedded
    private AuditInformation auditInformation ;


    public Appointment() {
    }


    /*    • id
• patientName
• patientNationalCode
• patientPhoneNumber
• doctorName
• appointmentDate
• appointmentTime
• visitPrice
• trackingCode
• status
• createdAt*/

}
