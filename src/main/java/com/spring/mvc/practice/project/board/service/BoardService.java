package com.spring.mvc.practice.project.board.service;

import com.spring.mvc.practice.project.board.domain.Board;
import com.spring.mvc.practice.project.board.repository.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BoardService {

    private final BoardMapper boardMapper;

    @Autowired
    public BoardService(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    public List<Board> getArticles(){
        List<Board> boardList = boardMapper.getArticles();

        return boardList;
    }

    public void insert(Board board){
        boardMapper.insertArticle(board);
    }

    public void deleteArticle(int boardNo){
        boardMapper.deleteArticle(boardNo);
    }

    public Board getContent(int boardNo){
        boardMapper.upViewCount(boardNo);
     return boardMapper.getContent(boardNo);
    }

    public void modifyArticle(Board board){
        boardMapper.modifyArticle(board);
    }

}