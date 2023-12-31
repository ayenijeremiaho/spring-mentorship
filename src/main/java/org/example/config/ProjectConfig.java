package org.example.config;

import org.example.pojo.Apple;
import org.example.pojo.Seed;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Configuration
public class ProjectConfig {

    @Bean
    public Apple apple1() {
        var apple = new Apple();
        apple.setName("Apple 1");
        apple.setSeed(new Seed(false));
        return apple;
    }

    @Bean
    @Primary
    public Apple apple2() {
        var apple = new Apple();
        apple.setName("Apple 2");
        apple.setSeed(new Seed(false));
        return apple;
    }
}
