package com.spring.mvc.practice.project.board.repository;

import com.spring.mvc.practice.project.board.domain.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface BoardMapper {

    //게시글 목록 가져오기
    List<Board> getArticles();

    //게시글 등록
    boolean insertArticle(Board article);

    //게시글 삭제
    boolean deleteArticle(int boardNo);

    //게시글 내용보기
    Board getContent(int boardNo);

    //게시글 수정
    boolean modifyArticle(Board article);

    //조회수 상승
    void upViewCount(int boardNo);


}
