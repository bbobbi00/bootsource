package com.example.web1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Log4j2
@Controller
public class HomeController {

    // @RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping("/")
    public String home() {
        // c.e.web1.controller.HomeController : home 요청
        log.info("home 요청"); // sout

        // templates 아래 경로부터 시작 확장자 빼고 파일명

        return "index";
    }

    // RedirectAttributes : redirect 시 데이터 전달
    @GetMapping("/ex3")
    public String ex3(RedirectAttributes rttr) {
        log.info("/ex3 요청");

        // 세션을 이용해서 값을 저장
        rttr.addFlashAttribute("bno", 15);
        return "redirect:/sample/basic";
    }

}
