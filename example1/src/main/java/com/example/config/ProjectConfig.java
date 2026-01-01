package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle() {
        Vehicle veh = new Vehicle();
        veh.setName("Toyota");
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
