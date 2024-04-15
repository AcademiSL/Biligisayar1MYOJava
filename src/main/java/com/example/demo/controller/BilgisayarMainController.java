package com.example.demo.controller;

import com.example.demo.model.MainModels;
import com.example.demo.repo.MainRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BilgisayarMainController {

    @Autowired
    private MainRepo mainRepo;

    @GetMapping ("/main")
    public String mainPageG()
    {
        return "index";
    }

    @PostMapping("/main")
    public String mainPageP(String login, String password){
      MainModels mainModels = new MainModels(login, password);
        mainRepo.save(mainModels);
      return "index";
    }
}
