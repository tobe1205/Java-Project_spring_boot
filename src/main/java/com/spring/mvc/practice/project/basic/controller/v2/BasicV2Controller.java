package com.spring.mvc.practice.project.basic.controller.v2;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BasicV2Controller {

    @GetMapping("/join11")
    public String join(){
        return "/common/register.html";
    }

    @GetMapping("/gugudan")
    public String gugudan(){
        return "/common/gugu3.html";
    }

    @GetMapping("/gugu7")
    public String gugu7(){
        return "/WEB-INF/views/gugu7.jsp";
    }

    @GetMapping("/v2/hello")
    public String hello(@RequestParam("p") String pet, int age) {
        System.out.println("/v2/hello 요청이 들어옴~!!");
        System.out.println("pet = " + pet);
        System.out.println("age = " + age);
        return "";
    }

    @GetMapping("/pet/form")
    public String petForm() {
        return "/WEB-INF/views/pet-form.jsp";
    }

    @PostMapping("/pet/info")
    public String pet(PetInfo petInfo, Model model){
        model.addAttribute("pi",petInfo);
        System.out.println(petInfo);
        return "/WEB-INF/views/pet-result.jsp";
    }
//============== 실습 문제 =====================//

    /*
        1. 우선 resgister.jsp를 열어주는 요청 메서드를 작성하세요.
        URL: /user/form 입니다.

        2. 사용자가 form에 등록한 회원정보를 받아서 처리하는 요청 메서드를 작성하세요.
        URL: /user/join 입니다.

        3. 2번 요청이 끝난 후 user-result.jsp로 이동시키시고 해당 파일에서는 회원의 정보를 출력해보세요
            ex> 아이디는 ??이고 비밀번호는 ?? 입니다 어쩌고~~

     */


    @GetMapping("/user/form")
    public String register(){
        return "/WEB-INF/views/register.jsp";
    }

    @PostMapping("/user/join")
    public String userJoin(User userInfo,Model model){
        model.addAttribute("ui",userInfo);

        return "/WEB-INF/views/user-result.jsp";
    }

    //사용자에게 키(cm)랑 몸무게(kg),이름을 입력받아서
    // 결과페이지에서 bmi를 알려주세요~

    // ex) xxx님의 bmi지수는 xxx입니다.
//    bmi = kg/(m*m)

    @GetMapping("/user/bmi")
    public String userBmi(){
        return "/WEB-INF/views/user-form.jsp";
    }

    @PostMapping("/user/confirm")
    public String userConfirm(UserBmi userBmi,Model model){

        double kg = userBmi.getWeight();
        double m = userBmi.getHeight() / 100;
        double bmi = kg / (m * m);

        bmi = Math.round(bmi * 100)/100.00;

        model.addAttribute("userName",userBmi.getUserName());
        model.addAttribute("height",userBmi.getHeight());
        model.addAttribute("weight",userBmi.getWeight());
        model.addAttribute("bmi",bmi);

        System.out.println(userBmi);
        return "/WEB-INF/views/user-bmi.jsp";
    }

}
