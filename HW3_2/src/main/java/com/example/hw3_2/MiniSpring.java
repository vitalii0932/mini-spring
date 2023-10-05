package com.example.hw3_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import java.util.HashMap;
import java.util.Map;

@ComponentScan
public class MiniSpring {
    private static Map<Class, Object> beanmap = new HashMap<>();

    public MiniSpring() {
    }

    public static void add(Class beanClass) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        var data = Class.forName(beanClass.getName());
        Object put = beanmap.put(beanClass, data.newInstance());
    }

    public static Object getBean(Class beanClass) {
        return beanmap.get(beanClass);
    }

    public static void print() {
        for (var key : beanmap.keySet()) {
            System.out.println(beanmap.get(key));
        }
    }

    @Override
    public String toString() {
        return "MiniSpring{}";
    }
}
