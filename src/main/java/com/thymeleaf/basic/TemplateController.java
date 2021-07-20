package com.thymeleaf.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/template")
public class TemplateController {

    @GetMapping("/fragment")
    public String template(Model model) {
        model.addAttribute("data1", "안녕");
        model.addAttribute("data2", "하이");
        return "template/fragment/fragmentMain";
    }
}
