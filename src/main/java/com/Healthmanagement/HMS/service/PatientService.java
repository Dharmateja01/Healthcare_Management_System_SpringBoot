package com.Healthmanagement.HMS.service;

import com.Healthmanagement.HMS.DTO.PatientMapper;
import com.Healthmanagement.HMS.DTO.PatientResponse;
import com.Healthmanagement.HMS.ExceptionHandling.ResourceNotFound;
import com.Healthmanagement.HMS.entity.Patient;
import com.Healthmanagement.HMS.repository.PatientRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.Healthmanagement.HMS.DTO.PatientRequest;

import java.util.List;
@Slf4j
@Service
@RequiredArgsConstructor

public class PatientService {
    private final PatientRepo pr;
    private final PatientMapper pm;
//    private Patient list;
    public List<PatientResponse> getall(){
        log.info("Displaying all the Entities");
        return pr.findAll().stream().map(pm::toResponse).toList();
    }
    public PatientResponse single(Long id){
        log.info("displaying "+id+" id Details");
         Patient p= pr.findById(id).orElseThrow(()->new ResourceNotFound("Id not found"));
         return pm.toResponse(p);
    }
    public PatientResponse add(PatientRequest pt){
        if(pr.findByPatientCode(pt.getPatient_code()).isPresent()){
            log.warn("Duplicate Patient code");
            throw new ResourceNotFound("Patient Already Exists");
        }
        if(pr.findByEmail(pt.getEmail()).isPresent()){
            log.warn("Duplicate Patient Email");
            throw new ResourceNotFound("Patient Already Exists");
        }
        if(pr.findByPhoneNum(pt.getPhone_num()).isPresent()){
            log.warn("Duplicate Patient Phone Nuber");
            throw new ResourceNotFound("Patient Already Exists");
        }
        if(pr.findByAadhar(pt.getAadhar()).isPresent()){
            log.warn("Duplicate Patient AAdhar");
            throw new ResourceNotFound("Patient Already Exists");
        }
        Patient p=pm.toEntity(pt);
        Patient save=pr.save(p);
        return pm.toResponse(save);
    }
    public PatientResponse update(PatientRequest request, Long id) {
        Patient oldpatient = pr.findById(id).orElseThrow(() -> new ResourceNotFound("Id not Found"));
        pm.updatePatientFromRequest(request, oldpatient);
        Patient update=pr.save(oldpatient);
        log.debug("Patient Details Updatde");
        return pm.toResponse(update);
    }
//    public Patient update(Patient pt,Long id){
//        Patient oldpatient=pr.findById(id).orElseThrow(()->new RuntimeException("Id not Founf"));
//        oldId.setPatient_code(pt.getPatient_code());
//        oldId.setFirst_name(pt.getFirst_name());
//        oldId.setLast_name(pt.getLast_name());
//        oldId.setAge(pt.getAge());
//        oldId.setGender(pt.getGender());
//        oldId.setPhone_num(pt.getPhone_num());
//        oldId.setEmail(pt.getEmail());
//        oldId.setBlood_group(pt.getBlood_group());
//        oldId.setAadhar(pt.getAadhar());
//        oldId.setAddress(pt.getAddress());
//        oldId.setEmergency_contact(pt.getEmergency_contact());
//        oldId.setAdmit_date(pt.getAdmit_date());
//        oldId.setStatus(pt.getStatus());
//        return pr.save(oldpatient);
//    }
    public Patient delete(Long id) {
        pr.findById(id).orElseThrow(() -> new ResourceNotFound("Id not found"));
        pr.deleteById(id);
//        System.out.println("deleted Successfully");
        log.info("Deleted Patient Successfully");
        return null;
    }
}
