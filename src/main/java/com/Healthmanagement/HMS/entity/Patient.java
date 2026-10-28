package com.Healthmanagement.HMS.entity;

import com.Healthmanagement.HMS.Enum.Blood_Group;
import com.Healthmanagement.HMS.Enum.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long patient_code;
    @Column(nullable = false)
    private String first_name;
    @Column(nullable = false)
    private String last_name;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(nullable = false)
    private Long phone_num;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Blood_Group Blood_group;
    @Column(nullable = false)
    private String Aadhar;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String emergency_contact;
    @Column(nullable = false)
    private String admit_date;
    @Column(nullable = false)
    private String Status;
}
