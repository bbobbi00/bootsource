package com.example.book.control;

import org.springframework.stereotype.Controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Log4j2
@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        log.info("home 요청");
        return "/home";
    }

    @GetMapping("/book/list")
    public String getList() {
        log.info("home 요청");
        return "/book/list";
    }
}
