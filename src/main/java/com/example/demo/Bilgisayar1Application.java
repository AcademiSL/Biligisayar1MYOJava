package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Bilgisayar1Application {

	public static void main(String[] args) {
		List<String> greetings = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			greetings.add("adf"+i);
		}

		for (int i = 0; i < greetings.size(); i++) {
			System.out.println(greetings.get(i));
		}

//		SpringApplication.run(Bilgisayar1Application.class, args);
	}

}
