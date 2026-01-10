package com.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

public class Vehicle {
    private String name;

    public Vehicle() {
        System.out.println("Vehicle class created by Spring");
    }

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

    @Override
    public String toString() {
        return "Vehicle name is - " + this.getName();
    }
}
