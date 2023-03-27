package com.example.kakaoBean.member.application.dto;

import lombok.Getter;

@Getter
public class RegisterMemberRequestDto {

    private String username;
    private String password;

    public RegisterMemberRequestDto(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
