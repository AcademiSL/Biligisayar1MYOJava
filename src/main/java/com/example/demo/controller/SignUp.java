package com.example.demo.controller;
import com.example.demo.model.SignUpmodel;
import com.example.demo.repo.SigUpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUp {

    @Autowired
    SigUpRepo databased1;

    @GetMapping (value = "/login")
    public String mainPageG(){
        return "login";
    }

    @PostMapping(value = "/login")
    public String mainPageP(String login, String password){
        SignUpmodel data2 = new SignUpmodel(login,password);
        databased1.save(data2);
        return "redirect:/main";
    }

}
