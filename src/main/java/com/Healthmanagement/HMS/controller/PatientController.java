package com.Healthmanagement.HMS.controller;

import com.Healthmanagement.HMS.APIres.ApiResponse;
import com.Healthmanagement.HMS.DTO.PatientResponse;
import com.Healthmanagement.HMS.entity.Patient;
import com.Healthmanagement.HMS.service.PatientService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.Healthmanagement.HMS.DTO.PatientRequest;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/home")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService ps;
    @GetMapping("/all")
    public ResponseEntity<ApiResponse<List<PatientResponse>>> all() {
        List<PatientResponse> patients = ps.getall();
        ApiResponse<List<PatientResponse>> api = new ApiResponse<>(
                HttpStatus.OK.value(), true, "Patients retrieved successfully",
                LocalDateTime.now(),
                patients);
        return ResponseEntity.status(HttpStatus.OK).body(api);
    }
    @GetMapping("/single/{id}")
    public ResponseEntity<ApiResponse<PatientResponse>> getByID(@PathVariable Long id) {
        PatientResponse patient = ps.single(id);
        ApiResponse<PatientResponse> api = new ApiResponse<>(
                HttpStatus.OK.value(),
                true,
                "Patient retrieved successfully",
                LocalDateTime.now(),
                patient);
        return ResponseEntity.status(HttpStatus.OK).body(api);
    }
    @PostMapping("/add")
    public ResponseEntity<ApiResponse<PatientResponse>> add(@Valid @RequestBody PatientRequest request) {
        PatientResponse patient = ps.add(request);
        ApiResponse<PatientResponse> api = new ApiResponse<>(
                HttpStatus.CREATED.value(),
                true,
                "Patient added successfully",
                LocalDateTime.now(),
                patient);
        return ResponseEntity.status(HttpStatus.CREATED).body(api);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<ApiResponse<PatientResponse>> update(@Valid @RequestBody PatientRequest request, @PathVariable Long id) {
        PatientResponse patient = ps.update(request, id);
        ApiResponse<PatientResponse> api = new ApiResponse<>(HttpStatus.OK.value(), true, "Patient updated successfully",
                LocalDateTime.now(), patient);
        return ResponseEntity.status(HttpStatus.OK).body(api);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ApiResponse<Void>> delete(@PathVariable Long id) {
        ps.delete(id);
        ApiResponse<Void> api = new ApiResponse<>(
                HttpStatus.OK.value(),
                true,
                "Patient deleted successfully",
                LocalDateTime.now(),
                null);
        return ResponseEntity.status(HttpStatus.OK).body(api);
    }
}
//    @GetMapping("/all")
//    public List<Patient> all(){
//        return ps.getall();
//    }
//    @GetMapping("/single/{id}")
//    public Patient getbyID(@PathVariable Long id){
//        return ps.single(id);
//    }
//    @PostMapping("/add")
//    public ResponseEntity<ApiResponse<PatientResponse>> add(@RequestBody PatientRequest pt){
//        PatientResponse pr=ps.add(pt);
//        ApiResponse api=new ApiResponse(HttpStatus.CREATED.value(), true,"Patient is added successsfully", LocalDateTime.now(),pr);
//        return ResponseEntity.status(HttpStatus.CREATED).body(api);
//    }
////    @PutMapping("/update/{id}")
////    public Patient update (@RequestBody Patient pt ,@PathVariable Long id){
////        return ps.update(pt,id);
////    }
//    @PutMapping("/update/{id}")
//    public Patient update(@RequestBody PatientRequest request, @PathVariable Long id) {
//        return ps.update(request, id);
//    }
//    @DeleteMapping("delete/{id}")
//    public void delete(@PathVariable Long id){
//        ps.delete(id);
//    }
//}
