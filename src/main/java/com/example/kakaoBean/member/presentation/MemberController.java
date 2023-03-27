package com.example.kakaoBean.member.presentation;

import com.example.kakaoBean.member.application.MemberService;
import com.example.kakaoBean.member.application.dto.RegisterMemberResponseDto;
import com.example.kakaoBean.member.presentation.dto.RegisterMemberRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;


    @PostMapping("/members")
    public ResponseEntity registerMember(@RequestBody @Validated RegisterMemberRequest request){
        RegisterMemberResponseDto res = memberService.registerMember(request.toServiceDto());
        return new ResponseEntity(res, HttpStatus.OK);
    }
}
