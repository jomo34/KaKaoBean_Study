package com.example.kakaoBean.member.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Member {

    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private BaseStatus status;


    private String email;
    private String password;

    public Member(BaseStatus status, String email, String password) {
        this.status = status;
        this.email = email;
        this.password = password;
    }

}
