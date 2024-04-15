package com.example.demo.controller;


import com.example.demo.model.MainModels;
import com.example.demo.repo.MainRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BilgisayarLoginController {

     @Autowired
    MainRepo databased;

    @GetMapping (value = "/login")
    public String mainPageG(){
        return "login";
    }

    @PostMapping(value = "/login")
    public String mainPageP(String login, String password){
        MainModels data1 = new MainModels(login,password);
        databased.save(data1);
        return "redirect:/main";
    }

}
