package com.example.kakaoBean.member.application;

import com.example.kakaoBean.member.application.dto.RegisterMemberRequestDto;
import com.example.kakaoBean.member.application.dto.RegisterMemberResponseDto;
import com.example.kakaoBean.member.domain.BaseStatus;
import com.example.kakaoBean.member.domain.MemberRepository;
import com.example.kakaoBean.member.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public RegisterMemberResponseDto registerMember(RegisterMemberRequestDto dto){
        Member member = new Member(BaseStatus.ACTIVE, dto.getUsername(), dto.getPassword());
        memberRepository.save(member);
        return new RegisterMemberResponseDto(member.getId());


    }
}
