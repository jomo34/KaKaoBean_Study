package com.example.kakaoBean.member.application.dto;

import lombok.Getter;

@Getter
public class RegisterMemberResponseDto {

    private final Long memberId;

    public RegisterMemberResponseDto(Long memberId){
        this.memberId = memberId;
    }
}
