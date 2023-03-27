package com.example.kakaoBean.member.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;



@SpringBootTest
@Transactional
class MemberTest {

    @Autowired
    //EntityManager em;
    MemberRepository memberRepository;


    @Test
    void test(){

        //given
        Member member = new Member(BaseStatus.ACTIVE, "whdusrua@naver.com", "password");
        memberRepository.save(member);
        //em.persist(member);

        //when
        Member findMember = memberRepository.findById(member.getId())
                .orElseThrow(()->new RuntimeException("예외발생"));
        //em.clear();
        //Member findMember = em.find(Member.class, member.getId());

        //then
        Assertions.assertThat(member).isSameAs(findMember);
        //Assertions.assertThat(member).isSameAs(findMember);
    }

}