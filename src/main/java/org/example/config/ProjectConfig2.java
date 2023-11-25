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
public class ProjectConfig2 {

    @Bean
    public Apple apple3() {
        var apple = new Apple();
        apple.setName("Apple 3");
        apple.setSeed(new Seed(false));
        return apple;
    }
}
