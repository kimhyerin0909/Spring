package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);

//		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("people", "사람");
//
//		System.out.println(map);

	}

}