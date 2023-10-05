package com.example.hw3_2;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Objects;


@Component
public class Engine {
    private int power;

    public Engine() {
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                '}';
    }
}
