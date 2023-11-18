package org.example.config;

import org.example.pojo.Apple;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Configuration
public class ProjectConfig {

    @Bean
    @Primary
    public Apple getApple1() {
        var apple = new Apple();
        apple.setName("Apple 1");
        return apple;
    }

    @Bean
    public Apple getApple2() {
        var apple = new Apple();
        apple.setName("Apple 2");
        return apple;
    }
}
