package com.example.gujeukcheckin_be.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 자동 생성 아이디
    @Column(name = "user_id", nullable = false, unique = true, length = 30)
    private String userMakeId;

    @Column(nullable = false, length = 30)
    private String name;

    @Column(nullable = false, length = 30)
    private String phone;

    @Column(nullable = false, length = 11, name = "birth_ymd")
    private int birthYMD;

    @Column(nullable = false)
    private Boolean privacyAgreed;

}
