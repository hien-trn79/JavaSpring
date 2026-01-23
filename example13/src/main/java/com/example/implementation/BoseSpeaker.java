package com.example.implementation;

import com.example.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speakers {
    @Override
    public String makeSound() {
        return "Playing music with Bose Speaker";
    }
}
