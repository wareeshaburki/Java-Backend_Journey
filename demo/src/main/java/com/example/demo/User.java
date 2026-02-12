package com.example.demo;

public class User {
    private String name,city,role;

    public User(String name, String city, String role){
        this.city = city;
        this.name = name;
        this.role = role;
    }

    public String getName(){
        return name;
    }

    public String getCity(){
        return city;
    }

    public String getRole(){
        return role;
    }
}
