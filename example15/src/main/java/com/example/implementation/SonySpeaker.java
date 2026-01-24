package com.example.implementation;

import com.example.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeaker implements Speakers {
    @Override
    public String makeSound() {
        return "Playing music with Sony Speaker";
    }
}
