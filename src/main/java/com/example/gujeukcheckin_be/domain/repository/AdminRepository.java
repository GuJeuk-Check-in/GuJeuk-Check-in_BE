package com.example.gujeukcheckin_be.domain.repository;

import com.example.gujeukcheckin_be.domain.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity,Long> {

}
