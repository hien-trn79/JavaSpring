package com.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void initialized() {
        this.name = "Yamaha";
    }

    public void printHello() {
        System.out.println("Hello");
    }
}
