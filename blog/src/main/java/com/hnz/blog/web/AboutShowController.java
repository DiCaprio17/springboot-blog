package com.hnz.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author huangnuozhong
 * @create 2020-03-10-20:30
 */
@Controller
public class AboutShowController {
    @GetMapping("/about")
    public String about() {
        return "about";
    }

}
