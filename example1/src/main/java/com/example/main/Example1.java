package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) {
        // Khoi tao mot object moi thong thuong
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle name from non-spring context is " + vehicle.getName());

        // Khoi tao thong qua @Bean annotation
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        String hello = context.getBean(String.class);
        Integer speed = context.getBean(Integer.class);
        System.out.println("Vehicle name from non-spring context is " + veh.getName());
        System.out.println(hello);
        System.out.println(speed);
    }
}
