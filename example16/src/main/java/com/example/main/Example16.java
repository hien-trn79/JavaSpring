package com.example.main;

import com.example.beans.Person;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example16 {

    public static void main(String[] args) {
       var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Person person2 = context.getBean(Person.class);

        if(person2 == person) {
            System.out.println("Person bean is a singleton scoped bean");
        } else {
            System.out.println("Person bean is a prototype scoped bean");
        }

    }
}
