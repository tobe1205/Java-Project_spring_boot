package com.spring.mvc.practice.project.member.domain;

import lombok.*;

import java.sql.Timestamp;

@Setter @Getter @ToString
@NoArgsConstructor @AllArgsConstructor
public class Member {

    private String account; //계정명
    private String password; //비밀번호
    private String name; //이름
    private String email; //이메일
    private Timestamp regDate; //가입날짜
    private Auth auth; //관리자 권한 (관리자, 일반)
}
