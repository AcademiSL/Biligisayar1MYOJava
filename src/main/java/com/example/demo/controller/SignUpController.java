package com.example.demo.controller;

import com.example.demo.model.SignUpModel;
import com.example.demo.repo.SignUpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SignUpController {
    @Autowired
    private SignUpRepo signUpRepo;

    @GetMapping("/signup")
    public String getPage(Model model) {
        List<SignUpModel> gotValues = signUpRepo.findAll();

        model.addAttribute("name", "Ainura");

//        for (int i = 0; i < gotValues.size(); i++) {
//            System.out.println(gotValues.get(i).getLogin());
//        }


//        for (int i = 0; i < 100; i++) {
//            signUpRepo.save(new SignUpModel("Nurs"+i,i,"nurs.kg"+i, "password"+i));
//        }
        return "signup";
    }

    @PostMapping("/signup")
    public String postPage(String login, int number, String email, String password) {
        SignUpModel signUpModel = new SignUpModel(login, number, email, password);
        signUpRepo.save(signUpModel);
        return "redirect:/main";
    }
}
