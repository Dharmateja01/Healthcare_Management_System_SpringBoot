package com.Healthmanagement.HMS.DTO;

import com.Healthmanagement.HMS.entity.Doctor;
import com.Healthmanagement.HMS.entity.Patient;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring",builder=@Builder(disableBuilder = true))
public interface DoctorMapper {
    Doctor toEntity(DoctorRequest request);
    DoctorResponse toResponse(Doctor doctor);
    void updateDoctorFromRequest(DoctorRequest dr, @MappingTarget Doctor dt);
}
