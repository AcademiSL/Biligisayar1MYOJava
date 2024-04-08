package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "signup")
public class SignUpModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String login;
    private int number;
    private String email;
    private String password;

    public SignUpModel(String login, int number, String email, String password) {
        this.login = login;
        this.number = number;
        this.email = email;
        this.password = password;
    }

    public SignUpModel() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
