package com.Healthmanagement.HMS.service;

import com.Healthmanagement.HMS.DTO.DoctorMapper;
import com.Healthmanagement.HMS.DTO.DoctorRequest;
import com.Healthmanagement.HMS.ExceptionHandling.ResourceNotFound;
import com.Healthmanagement.HMS.entity.Doctor;
import com.Healthmanagement.HMS.repository.DoctorRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {
    private final DoctorRepo dr;
    private final DoctorMapper dm;

    public List<Doctor> all(){
        return dr.findAll();
    }
    public Doctor getSingle(Long id){
        return dr.findById(id).orElseThrow(()->new RuntimeException("id not found"));
    }
    public Doctor add(Doctor dt){

//        if(dr.findBydoctor_code(dt.getDoctor_code()).isPresent()){
//            throw new ResourceNotFound("id already exists");
//        }

        return dr.save(dt);
    }
    public Doctor update(DoctorRequest dreq,Long id){
        Doctor oldDoctor=dr.findById(id).orElseThrow(()->new RuntimeException("id not found"));
        dm.updateDoctorFromRequest(dreq,oldDoctor);
        return dr.save(oldDoctor);
    }
    public void delete(Long id){
        dr.findById(id).orElseThrow(()->new RuntimeException("id not found"));
        dr.deleteById(id);
    }
}
