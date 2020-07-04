package com.example.CustomApi.Clinic.repository;


import com.example.CustomApi.Clinic.model.AppointmentModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AppointmentRepository extends JpaRepository<AppointmentModel, Long>{

}
