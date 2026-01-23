package com.example.implementation;

import com.example.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyre implements Tyres {
    @Override
    public String moveVehicle() {
        return "Vehicle moving with BirdgeStone Tyre";
    }
}
