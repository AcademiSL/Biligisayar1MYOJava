package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "students")

public class MainModels {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String password;

    public MainModels(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public MainModels() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

