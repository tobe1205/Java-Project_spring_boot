package com.spring.mvc.practice.project.basic.controller.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.*;

@Controller
public class BasicV1Controller {


    @GetMapping("/v1/hello")
    @ResponseBody
    public String hello(){
        System.out.println("/v1/hello GET!!! 가나다라마바사");
        return "방문하신걸 환영합니다~!!";
    }

    @GetMapping("/sign-in")
    @ResponseBody
    public String login(){
        System.out.println("/sing-in GET!! 요청!!");
        return "로그인 요청하셨어요~??";
    }

    @GetMapping("/food/menu")
    @ResponseBody
    public List<String> foodMenu(){
        ArrayList<String> foodList = new ArrayList<>();

        foodList.add("볶음밥");
        foodList.add("짜장면");
        foodList.add("짬뽕");
        return foodList;
    }

    @GetMapping("/user/info")
    @ResponseBody
    public UserInfo userInfo(){
        return new UserInfo("김철수","대전시 서구",30, Arrays.asList("청소","영화감상","만화"));
    }

    @GetMapping("/hobby")
    @ResponseBody
    public Map<String,String> hobby(){
        Map<String,String> hobbies = new HashMap<>();
        hobbies.put("activity","탁구");
        hobbies.put("study","코딩");
        hobbies.put("home","영화감상");

        return hobbies;
    }

    @GetMapping("/user/all")
    @ResponseBody
    public List<UserInfo> allUsers(){
        List<UserInfo> users = new ArrayList<>();
        users.add(new UserInfo("김철수","대전",24,null));
        users.add(new UserInfo("박영희","서울",25,null));
        users.add(new UserInfo("홍길동","부산",20,null));

        return users;
    }

}
