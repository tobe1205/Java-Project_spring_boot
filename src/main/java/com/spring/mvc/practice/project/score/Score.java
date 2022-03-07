package com.spring.mvc.practice.project.score;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.ResultSet;
import java.sql.SQLException;

@Setter @Getter
@ToString
public class Score {

    private static int seq;

    private String name;
    private String markName;
    private int kor, eng, math;


    //자체 생성 데이터
    private int stuNum;
    private int total;
    private double average;

    private Grade grade;

    public Score() {
        this.stuNum = ++seq;
    }

    public Score(String name, int kor, int eng, int math) {
        this();
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        calcTotal();
        changeMarkName();
    }
    //DB조회데이터 처리 생성자
    public Score(ResultSet rs) throws SQLException {

        this.stuNum = rs.getInt("stu_num");
        this.name = rs.getString("stu_name");
        this.kor = rs.getInt("kor");
        this.eng = rs.getInt("eng");
        this.math = rs.getInt("math");
        this.total = rs.getInt("total");
        this.average = rs.getDouble("average");
        this.grade = Grade.valueOf(rs.getString("grade"));

    }
    //총점과 평균을 구하는 메서드
    public void calcTotal() {
        this.total = this.kor + this.eng + this.math;
        this.average = Math.round(this.total / 3.0 * 100) / 100.0;

        if (average >= 90){
            grade = Grade.A;
        } else if(average >= 80){
            grade = Grade.B;
        } else if (average >= 70) {
            grade = Grade.C;
        } else if (average >= 60){
            grade = Grade.D;
        } else {
            grade = Grade.F;
        }

    }

    //이름 마킹 처리
    public void changeMarkName() {
        //성 추출
        String familyName = String.valueOf(this.name.charAt(0));
        //성을 제외한 이름 수
        int nameCount = name.length() - 1;
        for (int i = 0; i < nameCount; i++) {
            familyName += "*";
        }
        this.markName = familyName;

    }
}
