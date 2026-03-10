package com.lisa.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class IndexController {

    @GetMapping("/index/{page}/category/{number}")
    public String viewIndex(@PathVariable String page,
                            @PathVariable Integer number,
                            @RequestParam() String param) {

        System.out.println("Page:"+ page);
        System.out.println("Number:"+ number);
        System.out.println("param: " + param);
        return "index";
    }

}
