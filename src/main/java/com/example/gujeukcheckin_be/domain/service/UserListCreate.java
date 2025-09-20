package com.example.gujeukcheckin_be.domain.service;

import com.example.gujeukcheckin_be.domain.entity.CustomLogEntity;
import com.example.gujeukcheckin_be.domain.repository.CustomLogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserListCreate {
    private CustomLogRepository customLogRepository;

    public void createUserList(CustomLogEntity listEntity) {
        CustomLogEntity customLogEntity = new CustomLogEntity();

        customLogEntity.setName(listEntity.getName());
        customLogEntity.setPhone(listEntity.getPhone());
        customLogEntity.setBirthYMD(listEntity.getBirthYMD());
        customLogEntity.setPrivacyAgreed(listEntity.getPrivacyAgreed());
        customLogEntity.setPurpose(listEntity.getPurpose());
        customLogEntity.setMaleCount(listEntity.getMaleCount());
        customLogEntity.setFemaleCount(listEntity.getFemaleCount());
        customLogEntity.setVisitDate(listEntity.getVisitDate());

        customLogRepository.save(customLogEntity);
    }
}
