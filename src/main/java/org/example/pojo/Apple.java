package org.example.pojo;

//POJO - PLAIN OLD JAVA OBJECT
public class Apple extends Fruit {

    private Seed seed;

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Seed getSeed() {
        return seed;
    }

    public void setSeed(Seed seed) {
        this.seed = seed;
    }
}
