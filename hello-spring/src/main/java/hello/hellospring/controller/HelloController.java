package hello.hellospring.controller;

import jdk.jfr.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hi") //get method, localhost:8080/hello --> 이렇게 해줌
    public String hello(Model model) {
        model.addAttribute("data", "spring!"); //hello.html에 data변수이름으로 "hello!"를 넘김
        return "hello"; //resource/templates에 hello를 찾아 렌더링함 (Thymelead 템플릿 엔진 처리)
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name;
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello; //객체를 넘김
    }
    static class Hello { //HelloController.Hello -> 쓸 수 있음 (class를 더 만들 수 있다는 말)
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
