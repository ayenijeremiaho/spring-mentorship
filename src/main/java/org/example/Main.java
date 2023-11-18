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