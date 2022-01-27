package com.spring.mvc.practice.project.score;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@Log4j2
public class ScoreController {

    private final ScoreService scoreService;

    @Autowired
    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    //점수 입력화면 열기
    @GetMapping("/score/form")
    public String form() {
        return "/WEB-INF/views/score/score-list.jsp";
    }

    //점수 전체조회 요청처리
    @GetMapping("/score/list")
    public String list(Model model) {
        log.info("/score/list GET !");
        List<Score> scoreList = scoreService.findAll();
        model.addAttribute("scores", scoreList);
        return "/WEB-INF/views/score/score-list.jsp";
    }

    //점수 등록 요청처리
    @PostMapping("/score/register")
    public String register(Score score) {
        log.info("/score/register POST - " + score);
        scoreService.save(score);
        return "redirect:/score/list";
    }

    //점수 삭제 요청 처리
    @GetMapping("/score/delete")
    public String delete(int stuNum) {
        log.info("/score/delete GET - " + stuNum);
        scoreService.remove(stuNum); //삭제 명령 위임
        return "redirect:/score/list";
    }

    //점수 상세보기 요청
    @GetMapping("/score/detail")
    public String detail(int stuNum, Model model) {
        log.info("/score/detail GET! - " + stuNum);
        Score score = scoreService.findOne(stuNum);
        model.addAttribute("s", score);
        return "/WEB-INF/views/score/detail.jsp";
    }

}
