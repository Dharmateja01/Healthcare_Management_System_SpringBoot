package com.Healthmanagement.HMS.DTO;

import com.Healthmanagement.HMS.Enum.Gender;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DoctorRequest {

    @NotNull(message = "Doctor code is required")
    private Long doctor_code;

    @NotBlank(message = "First name is required")
    @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters")
    private String first_name;

    @NotBlank(message = "Last name is required")
    @Size(min = 2, max = 50, message = "Last name must be between 2 and 50 characters")
    private String last_name;

    @NotNull(message = "Gender is required")
    private Gender gender;

    @NotBlank(message = "Specialization is required")
    private String specialization;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Enter a valid 10-digit mobile number")
    private String phone_num;

    @NotBlank(message = "Email is required")
    @Email(message = "Enter a valid email")
    private String email;

    @NotBlank(message = "Qualification is required")
    private String qualification;

    @NotNull(message = "Experience is required")
    @Min(value = 0, message = "Experience cannot be negative")
    private Integer experience_years;

    @NotBlank(message = "Department is required")
    private String department;

    @NotNull(message = "Consultation fee is required")
    @Min(value = 0, message = "Consultation fee cannot be negative")
    private BigDecimal consultation_fee;

    @NotNull(message = "Joining date is required")
    private LocalDate joining_date;

    @NotBlank(message = "Status is required")
    private String Status;
}