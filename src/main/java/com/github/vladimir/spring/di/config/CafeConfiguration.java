package com.github.vladimir.spring.di.config;

import com.github.vladimir.spring.di.bean.Kitchen;
import com.github.vladimir.spring.di.bean.Waiter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.github.vladimir.spring.di")
public class CafeConfiguration {

   @Bean
    public Waiter waiter(Kitchen kitchen){
        return new Waiter(kitchen);
    }
}
