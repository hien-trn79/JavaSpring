package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example6 {

    public static void main(String[] args) {
        // Khoi tao thong qua @Bean annotation
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);

        System.out.println("Vehicle name from non-spring context is " + veh.getName());
        veh.printHello();
        // Principle and example implement to registerBean() method
        Vehicle volkswagen = new Vehicle();
        volkswagen.setName("Volkswagen");
        Supplier<Vehicle> volkswagenSupplier = () -> volkswagen;

        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle audi = new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        Random numberRandom = new Random();
        int number = numberRandom.nextInt(10);
        System.out.println("Random number: " + number);

        // registerBean()
        if(number % 2 == 0) {
            context.registerBean("volkswagen", Vehicle.class, volkswagenSupplier);
        } else {
            context.registerBean("audi", Vehicle.class, audiSupplier);
        }

        Vehicle volksVehicle = null;
        Vehicle audiVehicle = null;
        try {
            volksVehicle = context.getBean("volkswagen", Vehicle.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Error creating to volkswagen vehicle");
        }

        try {
            audiVehicle = context.getBean("audi", Vehicle.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Error creating to audi vehicle");
        }

        if(volksVehicle != null) {
            System.out.println("volkswagen name: " + volksVehicle.getName());
        } else {
            System.out.println("audi name: " + audiVehicle.getName());
        }
        // Destroy => @Predestroy
        context.close();
    }
}
