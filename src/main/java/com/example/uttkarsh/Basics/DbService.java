package com.example.uttkarsh.Basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class DbService {

    public DbService(DB db){  //constructor Injection
        this.db = db;
    }
    //with constructor injection, we can make object ofDB as final(immutable), making it secure so that it cant bw changes
    //which cannot be done with filed injection

//    @Autowired  // Field Injection
    final private DB db;

    String getdata(){
        return db.getdata();
    }

}
