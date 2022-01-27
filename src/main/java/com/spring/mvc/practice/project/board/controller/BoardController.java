package com.spring.mvc.practice.project.board.controller;


import com.spring.mvc.practice.project.board.domain.Board;
import com.spring.mvc.practice.project.board.domain.ModifyBoard;
import com.spring.mvc.practice.project.board.service.BoardService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@Log4j2
public class BoardController {

    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    //글 작성 화면 요청
    @GetMapping("/board/write")
    public String write(){
        return "/WEB-INF/views/board/write.jsp";
    }

    //글작성 처리 요청
    @PostMapping("/board/write")
    public String write(Board article){
        boardService.insert(article);
        return "redirect:/board/list";
    }

    //글 목록 요청
    @GetMapping("/board/list")
    public String list(Model model){
        List<Board> articles = boardService.getArticles();
        model.addAttribute("articles",articles);
        return "/WEB-INF/views/board/list.jsp";
    }

    //글 삭제 요청
    @GetMapping("/board/delete")
    public String delete(int boardNo){
        boardService.deleteArticle(boardNo);
        return "redirect:/board/list";
    }

    //글 상세보기 요청
    @GetMapping("/board/content")
    public String content(int boardNo,Model model){
        model.addAttribute("b",boardService.getContent(boardNo));
        return "/WEB-INF/views/board/content.jsp";
    }

    //글 수정하기 화면 요청
    @GetMapping("/board/modify")
    public String modify(int boardNo,Model model){
        model.addAttribute("board",boardService.getContent(boardNo));
        return "/WEB-INF/views/board/modify.jsp";
    }

    //글 수정 처리 요청
    @PostMapping("/board/modify")
    public String modify(ModifyBoard modArticle){
        Board board = boardService.getContent(modArticle.getBoardNo());
        board.setWriter(modArticle.getWriter());
        board.setTitle(modArticle.getTitle());
        board.setContent(modArticle.getContent());
        boardService.modifyArticle(board);
        return "redirect:/board/content?boardNo="+modArticle.getBoardNo();
    }
}
