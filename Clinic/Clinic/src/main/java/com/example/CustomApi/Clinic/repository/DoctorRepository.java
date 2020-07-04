package com.example.CustomApi.Clinic.repository;

import com.example.CustomApi.Clinic.model.DoctorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<DoctorModel, Long> {
}
