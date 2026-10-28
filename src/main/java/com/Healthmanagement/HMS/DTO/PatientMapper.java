package com.Healthmanagement.HMS.DTO;

import com.Healthmanagement.HMS.DTO.PatientRequest;
import com.Healthmanagement.HMS.DTO.PatientResponse;
import com.Healthmanagement.HMS.entity.Patient;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring",builder=@Builder(disableBuilder = true))
public interface PatientMapper {
    Patient toEntity(PatientRequest request);
    PatientResponse toResponse(Patient patient);
    void updatePatientFromRequest(PatientRequest Re, @MappingTarget Patient pt);
}