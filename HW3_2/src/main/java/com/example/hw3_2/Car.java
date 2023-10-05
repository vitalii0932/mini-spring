package com.example.hw3_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Configuration
@Component
public class Car {
    @Autowired
    private Engine engine;

    public Car() {
    }

    @Bean
    public void carAddBean()
    {
        try{
            MiniSpring.add(this.getClass());
            MiniSpring.add(engine.getClass());
        } catch (Exception ex){
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }
}
