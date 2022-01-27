package com.spring.mvc.practice.project.score;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {

    private final ScoreMapper scoreMapper;

    @Autowired
    public ScoreService(ScoreMapper scoreMapper) {
        this.scoreMapper = scoreMapper;
    }
    //점수 전체조회 요청 중간처리
    public List<Score> findAll() {
        List<Score> scoreList = scoreMapper.findAll();

        //repo가 가져온 데이터 중간처리
        // .............

        return scoreList;
    }

    //점수 등록 요청 중간처리
    public void save(Score score) {
        score.calcTotal(); // 총점, 평균 계산
        score.changeMarkName(); //마킹 네임 저장
        scoreMapper.save(score);
    }

    //점수 삭제 요청 중간처리
    public void remove(int stuNum) {
        scoreMapper.remove(stuNum);
    }

    //점수 개별조회 요청 중간처리리
    public Score findOne(int stuNum) {
        Score score = scoreMapper.findOne(stuNum);
        //중간처리 ...........
        return score;
    }

}
