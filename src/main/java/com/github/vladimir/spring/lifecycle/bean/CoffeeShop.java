package com.github.vladimir.spring.lifecycle.bean;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Map;

@Component
public class CoffeeShop {

    private  final ObjectProvider<Coffee> coffeeObjectProvider;

    private final Map<String, Ingredient> ingrediens;

    public CoffeeShop(ObjectProvider<Coffee> coffeeObjectProvider, Map<String, Ingredient> ingrediens) {
        this.coffeeObjectProvider = coffeeObjectProvider;
        this.ingrediens = ingrediens;
    }


    @PostConstruct
    public void openShop() {
        System.out.println("Shop is open");
    }

    public void makeCoffee (String type) {
        Coffee coffee = coffeeObjectProvider.getObject(type);
        System.out.println("Making coffee: " + coffee);
    }

    public void makeCoffee(){
        System.out.println("Make coffee");
    }

    @PreDestroy
    public void closeShop(){
        System.out.println("Shop is close");
    }

    public void makeCoffee (String type, String ingredient) {
        Coffee coffee = coffeeObjectProvider.getObject(type);
        System.out.println("Making coffee with ingredient: " + ingrediens.get(ingredient) +"Coffee: "+coffee);
    }
}
