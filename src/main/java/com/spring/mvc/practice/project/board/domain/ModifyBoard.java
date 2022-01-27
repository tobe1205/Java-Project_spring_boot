package com.spring.mvc.practice.project.board.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString
public class ModifyBoard {

    private int boardNo;
    private String writer;
    private String title;
    private String content;

}
