package com.example.gujeukcheckin_be.domain.service;

import com.example.gujeukcheckin_be.domain.entity.CustomLogEntity;
import com.example.gujeukcheckin_be.domain.repository.CustomLogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserListCreate {
    private CustomLogRepository customLogRepository;

    public void createUserList(CustomLogEntity list) {
        CustomLogEntity customLogEntity = new CustomLogEntity();

        customLogEntity.setName(list.getName());
        customLogEntity.setPhone(list.getPhone());
        customLogEntity.setBirthYMD(list.getBirthYMD());
        customLogEntity.setPrivacyAgreed(list.getPrivacyAgreed());
        customLogEntity.setPurpose(list.getPurpose());
        customLogEntity.setMaleCount(list.getMaleCount());
        customLogEntity.setFemaleCount(list.getFemaleCount());
        customLogEntity.setVisitDate(list.getVisitDate());

        customLogRepository.save(customLogEntity);
    }
}
