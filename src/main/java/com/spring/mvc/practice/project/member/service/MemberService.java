package com.spring.mvc.practice.project.member.service;

import com.spring.mvc.practice.project.member.domain.Member;
import com.spring.mvc.practice.project.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import static com.spring.mvc.practice.project.member.service.LoginFlag.*;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //회원가입
    public void register(Member member) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodePassword = encoder.encode(member.getPassword());
        member.setPassword(encodePassword);
        memberRepository.register(member);
    }

    //아이디 중복확인
    public boolean isDuplicateId(String account) {
        return memberRepository.isDuplicateId(account) == 1;
    }

    //이메일 중복확인
    public boolean isDuplicateEmail(String email) {
        return memberRepository.isDuplicateEmail(email) == 1;
    }

    // 단일 회원정보 확인
    public Member getMember(String account) {
        return memberRepository.findMember(account);
    }

    // 로그인 중간 처리
    public LoginFlag login(String inputId, String inputPw) {
        Member member = memberRepository.findMember(inputId);
        if (member != null) {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            return encoder.matches(inputPw, member.getPassword()) ? SUCCESS : NO_PW;
        } else {
            return NO_ID;
        }
    }
}
