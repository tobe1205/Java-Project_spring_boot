package com.spring.mvc.practice.project.basic.controller.v1;

import lombok.*;

import java.util.*;

@Setter @Getter
@ToString @NoArgsConstructor
@AllArgsConstructor
public class UserInfo {

    private String userName;
    private String address;
    private int age;
    private List<String> hobby;


}
