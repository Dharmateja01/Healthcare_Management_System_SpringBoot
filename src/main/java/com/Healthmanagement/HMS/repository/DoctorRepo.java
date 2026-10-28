package com.Healthmanagement.HMS.repository;

import com.Healthmanagement.HMS.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DoctorRepo extends JpaRepository<Doctor,Long>{
//    Optional<Doctor> findBydoctor_code(Long DocC);
}
