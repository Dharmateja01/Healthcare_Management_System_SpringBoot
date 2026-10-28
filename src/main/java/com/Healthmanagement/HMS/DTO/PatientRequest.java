package com.Healthmanagement.HMS.DTO;

import com.Healthmanagement.HMS.Enum.Blood_Group;
import com.Healthmanagement.HMS.Enum.Gender;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PatientRequest {
    @NotNull(message = "Patient code is required")
    private Long patient_code;

    @NotBlank(message = "First name is required")
    @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters")
    private String first_name;

    @NotBlank(message = "Last name is required")
    @Size(min = 2, max = 50, message = "Last name must be between 2 and 50 characters")
    private String last_name;

    @NotNull(message = "Age is required")
    @Min(value = 0, message = "Age cannot be negative")
    private Integer age;

    @NotNull(message = "Gender is required")
    private Gender gender;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Enter a valid 10-digit mobile number")
    private String phone_num;
//    @NotNull(message = "Phone number is required")
//    @Pattern(regexp = "(6_9)\\d{9}",message = "Enter a valid 10-digit mobile number")
//    private Long phone_num;
    @NotBlank(message = "Email is required")
    @Email(message = "Enter a valid email")
    private String email;

    @NotNull(message = "Blood group is required")
    private Blood_Group Blood_group;

    @NotBlank(message = "Aadhar is required")
    @Pattern(regexp = "\\d{12}", message = "Aadhar must contain exactly 12 digits")
    private String Aadhar;

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "Emergency contact is required")
    private String emergency_contact;

    @NotBlank(message = "Admit date is required")
    private String admit_date;

    @NotBlank(message = "Status is required")
    private String Status;
}

