package com.example.gujeukcheckin_be.domain.repository;

import com.example.gujeukcheckin_be.domain.entity.CustomLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomLogRepository extends JpaRepository<CustomLogEntity, Long> {
}
