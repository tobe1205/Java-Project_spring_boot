package com.spring.mvc.practice.project.board.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.ResultSet;
import java.sql.SQLException;
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
    private String account;

    public Board() {
        this. boardNo = ++sequence;
    }

    public Board(String writer, String title, String content) {
        this();
        this.writer = writer;
        this.title = title;
        this.content = content;
    }

    public Board(ResultSet rs) throws SQLException {

        this.boardNo = rs.getInt("board_no");
        this.writer = rs.getString("writer");
        this.title = rs.getString("title");
        this.content = rs.getString("content");
        this.viewCnt = rs.getInt("view_cnt");
        this.regDate = rs.getTimestamp("reg_date");
        this.account = rs.getString("account"); // ***
    }
}
