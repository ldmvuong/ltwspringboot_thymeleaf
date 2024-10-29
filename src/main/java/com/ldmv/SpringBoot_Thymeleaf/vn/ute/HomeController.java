package com.ldmv.SpringBoot_Thymeleaf.vn.ute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/helloworld")
    public String helloWorld() {
        return "helloworld";
    }
}
