package com.example.gujeukcheckin_be.domain.controller;

import com.example.gujeukcheckin_be.domain.entity.CustomLogEntity;
import com.example.gujeukcheckin_be.domain.service.UserListCreate;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {
    private final UserListCreate userListCreate;

    @PostMapping("/create")
    public void createUserList(CustomLogEntity list){
        userListCreate.createUserList(list);
    }
}
