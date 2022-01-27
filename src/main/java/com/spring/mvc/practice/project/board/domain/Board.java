package com.spring.mvc.practice.project.board.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Setter
@Getter @ToString
@AllArgsConstructor
public class Board {

    private static int sequence;

    private int boardNo; //글번호
    private String writer;
    private String title;
    private String content;
    private int viewCnt;
    private Timestamp regDate;

    public Board() {
        this. boardNo = ++sequence;
    }

    public Board(String writer, String title, String content) {
        this();
        this.writer = writer;
        this.title = title;
        this.content = content;
    }
}
