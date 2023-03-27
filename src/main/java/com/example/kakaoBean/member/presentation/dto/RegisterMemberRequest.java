package com.example.kakaoBean.member.presentation.dto;

import com.example.kakaoBean.member.application.dto.RegisterMemberRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RegisterMemberRequest {

    private String username;
    private String password;

    public RegisterMemberRequestDto toServiceDto(){
        return new RegisterMemberRequestDto(username, password);
    }
}
