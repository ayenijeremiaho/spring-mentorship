package org.example.service;

import org.example.pojo.Apple;
import org.example.repository.AppleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AppleService {

    private final Apple apple;
    private final AppleRepository appleRepository;

    public AppleService(Apple apple, AppleRepository appleRepository) {
        this.apple = apple;
        this.appleRepository = appleRepository;

        System.out.println(apple.getName());
        System.out.println(apple.getSeed().isEdible());
    }

    public void add(String name) {
        appleRepository.saveToDatabase(name);
    }

    public void delete(String name) {
        appleRepository.removeFromDatabase(name);
    }
}
