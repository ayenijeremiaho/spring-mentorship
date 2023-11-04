package org.example;

import org.example.pojo.Apple;
import org.example.service.AppleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /**
         * Syntax fpr creating string
         * datatype variable_name = value
         */


        String name = "aaa667776#$%^**@@\"\uD83D\uDE0B";

        //Spring is built using the IOC(Inversion of Control) framework
        //Spring used D.I(Dependency Injection) to achieve IOC

        //AnnotationConfig ApplicationContext
        var context = new AnnotationConfigApplicationContext("org.example");

        var apple = context.getBean(Apple.class);
//        var apple1 = context.getBean("getApple1", Apple.class);
//        var apple2 = context.getBean("getApple2", Apple.class);

//        System.out.println(apple1.getName());
//        System.out.println(apple2.getName());
        System.out.println(apple.getName());

        var appleService = context.getBean(AppleService.class);

        appleService.add("Apple 1");
        appleService.delete("Apple 1");
    }
}