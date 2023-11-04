package org.example.service;

import org.example.repository.AppleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppleService {

    @Autowired
    private AppleRepository appleRepository;

    public void add(String name) {
        appleRepository.saveToDatabase(name);
    }

    public void delete(String name) {
        appleRepository.removeFromDatabase(name);
    }
}
