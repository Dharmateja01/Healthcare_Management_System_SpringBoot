package com.Healthmanagement.HMS.DTO;

import com.Healthmanagement.HMS.Enum.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DoctorResponse {

    private Long id;
    private Long doctor_code;
    private String first_name;
    private String last_name;
    private Gender gender;
    private String specialization;
    private String phone_num;
    private String email;
    private String qualification;
    private Integer experience_years;
    private String department;
    private BigDecimal consultation_fee;
    private LocalDate joining_date;
    private String Status;
}