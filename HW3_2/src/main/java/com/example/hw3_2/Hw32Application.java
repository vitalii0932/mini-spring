package com.example.hw3_2;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hw32Application {

    public static void main(String[] args) {
        var springApplication = SpringApplication.run(Hw32Application.class, args);
        MiniSpring.print();
    }

}
