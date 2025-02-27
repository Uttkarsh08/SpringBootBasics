package com.example.uttkarsh.Basics;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component    //used to make a bean
public class Animal {

    void speak(){
        System.out.println("Dog barks");
    }


    @PostConstruct   //called just after object initialization, before being used in the application
    void init(){
        System.out.println("Making Dog");
    }

    @PreDestroy  //called just before the object is destroyed
    void destroy(){
        System.out.println("Destroying Dog");
    }

}
