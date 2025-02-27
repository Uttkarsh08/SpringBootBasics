package com.example.uttkarsh.Basics;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//Also a way to create a bean
@Configuration
public class Config {

    @Bean
    Animal getDog(){
        return new Animal();
    }

}
