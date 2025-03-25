package com.github.vladimir.spring.scope;

import com.github.vladimir.spring.scope.bean.HeadChef;
import com.github.vladimir.spring.scope.bean.ObjectProviderExemple;
import com.github.vladimir.spring.scope.bean.OrderProcessor;
import com.github.vladimir.spring.scope.bean.Waiter;
import com.github.vladimir.spring.scope.config.RestauranConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.UUID;

public class RestauranApplication {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(RestauranConfig.class);

        OrderProcessor orderProcessor=context.getBean(OrderProcessor.class);
        orderProcessor.processOrder("Coffee", 9);
    }
}
