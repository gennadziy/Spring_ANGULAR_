package gennadziy.controller;

/*
@Author Gennadziy GITHUB/gennadziy
Class name: Contr
Date: 2020-04-04
Time: 20:21
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Contr {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
