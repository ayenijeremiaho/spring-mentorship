package org.example.repository;

import org.springframework.stereotype.Repository;

@Repository
public class AppleRepository {

    public void saveToDatabase(String name) {
        System.out.println(name + " has been added on the database");
    }

    public void removeFromDatabase(String name) {
        System.out.println(name + " has been removed from the database");
    }
}
