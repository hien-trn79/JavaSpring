package com.example.beans;

import com.example.services.VehicleServices;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;
    private VehicleServices vehicleServices;

    public Vehicle(VehicleServices vehicleServices) {
        this.vehicleServices = vehicleServices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }

    public void setVehicleServices(VehicleServices vehicleServices) {
        this.vehicleServices = vehicleServices;
    }
}
