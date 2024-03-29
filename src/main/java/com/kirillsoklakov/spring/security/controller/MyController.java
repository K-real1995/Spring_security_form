package com.kirillsoklakov.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String getInfoForAllEmps(){
        return "view-for-all-employees";

    }

    @GetMapping("/hr_info")
    public String getInfoForHr(){

        return "view-for-hr";
    }

    @GetMapping("/manager_info")
    public String getInfoOnlyForManager(){

        return "view-for-managers";
    }
}
