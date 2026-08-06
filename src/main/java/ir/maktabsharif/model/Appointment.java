package ir.maktabsharif.model;

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
@Enumerated(EnumType.STRING)
    private AppointmentStatus status;

    @Embedded
    private AuditInformation auditInformation ;


    public Appointment() {
    }

    public Appointment(String patientName, String patientNationalCode, String phoneNumber, String doctorName, Date appointmentDate, Time appointmentTime, double visitPrice, String trackingCode, AppointmentStatus status, AuditInformation auditInformation) {
        this.patientName = patientName;
        this.patientNationalCode = patientNationalCode;
        this.phoneNumber = phoneNumber;
        this.doctorName = doctorName;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.visitPrice = visitPrice;
        this.trackingCode = trackingCode;
        this.status = status;
        this.auditInformation = auditInformation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientNationalCode() {
        return patientNationalCode;
    }

    public void setPatientNationalCode(String patientNationalCode) {
        this.patientNationalCode = patientNationalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Time getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Time appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public double getVisitPrice() {
        return visitPrice;
    }

    public void setVisitPrice(double visitPrice) {
        this.visitPrice = visitPrice;
    }

    public String getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }

    public AuditInformation getAuditInformation() {
        return auditInformation;
    }

    public void setAuditInformation(AuditInformation auditInformation) {
        this.auditInformation = auditInformation;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", patientName='" + patientName + '\'' +
                ", patientNationalCode='" + patientNationalCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", appointmentDate=" + appointmentDate +
                ", appointmentTime=" + appointmentTime +
                ", visitPrice=" + visitPrice +
                ", trackingCode='" + trackingCode + '\'' +
                ", status=" + status +
                ", auditInformation=" + auditInformation +
                '}';
    }
}
