package com.spring.mvc.practice.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class ProjectApplication {

	// 정리 1번 (파일경로와 파일확장자 생략 방법)
	//ViewResolver 설정
	//컨트롤러가 리턴한 파일경로 문자열을 처리하는 객체
	/*@Bean //1번
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");

		return  resolver;
	}
*/
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

}
