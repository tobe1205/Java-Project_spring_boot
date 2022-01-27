package com.spring.mvc.practice.project.basic.controller.v2;

import lombok.*;

import java.util.List;

@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor
public class PetInfo {

    private String kind;
    private String name;
    private int age;
    private boolean injection; // 예방접종
    private List<String> hobby; //좋아하는것
}
