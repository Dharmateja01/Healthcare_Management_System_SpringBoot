package com.Healthmanagement.HMS.controller;

import com.Healthmanagement.HMS.entity.Doctor;
import com.Healthmanagement.HMS.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/doctor")
public class DoctorController {
    private final DoctorService ds;
    @GetMapping("/all")
    public List<Doctor> getall(){
       return ds.all();
    }
}

