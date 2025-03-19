package com.github.vladimir.spring.di;

import com.github.vladimir.spring.di.bean.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CoffeeApplication {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(CoffeeApplication.class);

        Customer customer=context.getBean("customer", Customer.class);
        customer.makeOrder("Salate and Pasta");
    }
}
