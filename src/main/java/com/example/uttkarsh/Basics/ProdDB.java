package com.example.uttkarsh.Basics;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary  //this can be used , if we have different configurations, and want any one to execute
@ConditionalOnProperty(name = "deploy.env", havingValue = "production")//this is used to check the environment configuration,
// which has been set in application.properties, to get the desired configuration
public class ProdDB implements DB{

    @Override
    public String getdata() {
        return "Prod Data";
    }
}
