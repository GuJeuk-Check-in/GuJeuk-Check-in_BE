package com.example.gujeukcheckin_be.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class AdminEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String password;
}
