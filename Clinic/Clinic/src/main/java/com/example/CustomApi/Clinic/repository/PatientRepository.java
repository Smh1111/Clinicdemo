package com.example.CustomApi.Clinic.repository;

import com.example.CustomApi.Clinic.model.PatientModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<PatientModel, Long> {
}
