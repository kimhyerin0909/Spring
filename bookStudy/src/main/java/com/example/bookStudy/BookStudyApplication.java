package com.example.bookStudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@Controller, @ResponseBody를 합쳐놓은 어노테이션 -> html 파일이 없어도 웹 브라우저 실행 가능
@SpringBootApplication
public class BookStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStudyApplication.class, args);
	}

	@GetMapping(value = "/")
	public String HelloWorld() {
		return "Hello World";
	}

}