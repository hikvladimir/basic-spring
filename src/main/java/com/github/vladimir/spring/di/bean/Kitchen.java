package com.github.vladimir.spring.di.bean;

import org.springframework.stereotype.Component;

@Component
public class Kitchen {

    public void cook(String order){
        System.out.println("Ketchen start cook: "+ order);
    }
}
