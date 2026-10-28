package com.Healthmanagement.HMS.entity;
import com.Healthmanagement.HMS.Enum.Doctor_status;
import com.Healthmanagement.HMS.Enum.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private Long doctor_code;
    @Column(nullable = false)
    private String first_name;
    @Column(nullable = false)
    private String last_name;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(nullable = false)
    private String specialization;
    @Column(nullable = false)
    private String phone_num;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String qualification;
    @Column(nullable = false)
    private int experience_years;
    @Column(nullable = false)
    private String department;
    @Column(nullable = false)
    private BigDecimal consultation_fee;
    @Column(nullable = false)
    private LocalDate joining_date;
    @Column(nullable = false)
    private Doctor_status Status;
}
