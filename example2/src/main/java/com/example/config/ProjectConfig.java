package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class ProjectConfig {

    @Bean("ToyotaVehicle")
    @Primary
    Vehicle vehicle1() {
        Vehicle veh = new Vehicle();
        veh.setName("Toyota");
        return veh;
    }

    @Bean(value = "HondaVehicle")
    Vehicle vehicle2() {
        Vehicle veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean(name = "FerrariVehicle")
    Vehicle vehicle3() {
        Vehicle veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }

    @Bean
    String introduce() {
        return "This is an expensive car brand";
    }

    @Bean
    Integer speed() {
        return 400;
    }
}
