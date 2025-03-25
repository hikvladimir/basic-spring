package com.github.vladimir.spring.lifecycle.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class CoffeeShop {
    @PostConstruct
    public void openShop() {
        System.out.println("Shop is open");
    }

    public void makeCoffee(){
        System.out.println("Make coffee");
    }

    @PreDestroy
    public void closeShop(){
        System.out.println("Shop is close");
    }
}
