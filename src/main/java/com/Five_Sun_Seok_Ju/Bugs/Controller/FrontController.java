package com.Five_Sun_Seok_Ju.Bugs.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FrontController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(){
        return "index.html";
    }
}
