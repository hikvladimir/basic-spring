package com.github.vladimir.spring.basic;

import com.github.vladimir.spring.basic.config.RestoranConfiguration;
import com.github.vladimir.spring.basic.staff.Barista;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringRestauran {
    public static void main(String[] args) {
        ApplicationContext manager=new AnnotationConfigApplicationContext(RestoranConfiguration.class);
        Barista barista=manager.getBean("barista", Barista.class);
        barista.makeCoffee();
    }
}
