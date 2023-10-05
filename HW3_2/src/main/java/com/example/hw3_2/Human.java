package com.example.hw3_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Objects;

@Configuration
public class Human {
    private String name;

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bean
    public void humanAddBean()
    {
        try {
            MiniSpring.add(this.getClass());
        } catch (Exception ex) {
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }
}
