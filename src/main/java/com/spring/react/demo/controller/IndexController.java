package com.spring.react.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @GetMapping("admin")
    public ModelAndView home() {
        ModelAndView mav=new ModelAndView("static/admin/index");
        return mav;
    }

    @GetMapping("user")
    public ModelAndView frontEnd2() {
        ModelAndView mav=new ModelAndView("static/user/index");
        return mav;
    }
}
