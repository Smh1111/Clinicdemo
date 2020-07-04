package com.example.CustomApi.Clinic.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table( name = "appointment")
public class AppointmentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id")
    private Long id;


    private Long booking_no;



    @ManyToMany
    private List<PatientModel> patient ;



    @ManyToOne
    private DoctorModel doctor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<PatientModel> getPatient() {
        return patient;
    }

    public void setPatient(List<PatientModel> patient) {
        this.patient = patient;
    }

    public DoctorModel getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorModel doctor) {
        this.doctor = doctor;
    }

    public Long getBooking_no() {
        return booking_no;
    }

    public void setBooking_no(Long booking_no) {
        this.booking_no = booking_no;
    }
}
