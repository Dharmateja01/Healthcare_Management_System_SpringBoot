package com.Healthmanagement.HMS.repository;

import com.Healthmanagement.HMS.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
public interface PatientRepo extends JpaRepository<Patient,Long> {
    @Query("SELECT p FROM Patient p WHERE p.patient_code = :pc")
    Optional<Patient> findByPatientCode(@Param("pc") Long pc);
    Optional<Patient> findByEmail(String em);
    @Query("SELECT p FROM Patient p WHERE p.phone_num = :pn")
    Optional<Patient> findByPhoneNum(@Param("pn") String pn);
    Optional<Patient> findByAadhar(String ad);
}

//    Optional<Patient> findByPatientCode (Long pc);
//    Optional<Patient> findByEmail(String em);
//    Optional<Patient> findByPhoneNum(Long pn);
//    Optional<Patient> findByAadhar(String ad);
//}
