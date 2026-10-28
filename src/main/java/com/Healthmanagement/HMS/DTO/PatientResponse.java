package com.Healthmanagement.HMS.DTO;
import com.Healthmanagement.HMS.Enum.Blood_Group;
import com.Healthmanagement.HMS.Enum.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PatientResponse {
    private Long id;
    private Long patient_code;
    private String first_name;
    private String last_name;
    private Integer age;
    private Gender gender;
    private Long phone_num;
    private String email;
    private Blood_Group Blood_group;
    private String Aadhar;
    private String address;
    private String emergency_contact;
    private String admit_date;
    private String Status;
}
