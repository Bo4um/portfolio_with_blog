package com.bo4um.portfolio_with_blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class TestController {
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}
