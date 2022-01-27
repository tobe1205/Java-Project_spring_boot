package com.spring.mvc.practice.project.member.repository;

import com.spring.mvc.practice.project.member.domain.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberRepository {

    //회원가입 기능
    boolean register(Member member);

    //단일 회원정보 조회 기능
    Member findMember(String account);

    //아이디 중복체크 기능
    int isDuplicateId(String inputKeyword);

    //이메일 중복체크
    int isDuplicateEmail(String inputKeyword);

}
