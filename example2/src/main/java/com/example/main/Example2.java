package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {

    public static void main(String[] args) {
        // Khoi tao thong qua @Bean annotation
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean("vehicle2", Vehicle.class);

        System.out.println("Vehicle name from non-spring context is " + veh.getName());

    }
}
