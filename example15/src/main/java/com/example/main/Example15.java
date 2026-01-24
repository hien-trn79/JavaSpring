package com.example.main;

import com.example.beans.Person;
import com.example.config.ProjectConfig;
import com.example.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example15 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Truoc khi tao Person context");
        Person person = context.getBean(Person.class);
        System.out.println("Sau khi tao person context");
    }
}
