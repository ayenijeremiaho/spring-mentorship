package org.example;

import org.example.config.ProjectConfig;
import org.example.config.ProjectConfig2;
import org.example.pojo.Apple;
import org.example.repository.AppleRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        /**
         * Syntax fpr creating string
         * datatype variable_name = value
         */


//        String name = "aaa667776#$%^**@@\"\uD83D\uDE0B";

        //Spring is built using the IOC(Inversion of Control) framework
        //Spring used D.I(Dependency Injection) to achieve IOC

        //AnnotationConfig ApplicationContext
        //Stereotype Annotations that spring looks for
        //MVC & MVVC

        /*
         1. @Configuration -> A class used to create spring bean manually,
         the major annotation here is @Bean

         2. @Service -> An annotation used to indicate that the class is for business logic,
         a business logic is an algorithm that has a single responsibility

         3. @Repository -> An annotation used to indicate that the class is for DAO.
         a DAO is a Data Access Object

         4. @Component -> An annotation used to indicate that this is a stereotyped class

         5. @Controller -> An annotation used to indicate that this is a web/user interfacing class
        **/

        var context = new AnnotationConfigApplicationContext("org.example");

//        var projectConfig = context.getBean(ProjectConfig.class);
//
//        Apple apple1  = projectConfig.getApple1();
//        System.out.println(apple1.getName());
//        System.out.println(apple1.getSeed().isEdible());
//
//        Apple apple2  = projectConfig.getApple2();
//        System.out.println(apple2.getName());
//        System.out.println(apple2.getSeed().isEdible());

//        var applePrimary = context.getBean(Apple.class);
//        System.out.println(applePrimary.getName());
//        System.out.println(applePrimary.getSeed().isEdible());

//        var apple3 = context.getBean("apple3", Apple.class);
//        System.out.println(apple3.getName());
//        System.out.println(apple3.getSeed().isEdible());

//        var projectConfig2 = context.getBean(ProjectConfig2.class);
//        var appleSecondary = projectConfig2.getApple3();
//        System.out.println(appleSecondary.getName());
//        System.out.println(appleSecondary.getSeed().isEdible());
    }
}