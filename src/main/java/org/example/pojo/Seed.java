package org.example.pojo;

import java.util.List;

public class Seed {

    private boolean edible = false;
    private List<String> nutritionalContent;

    public Seed(boolean edible) {
        this.edible = edible;
    }


    public boolean isEdible() {
        return edible;
    }

    public void setEdible(boolean edible) {
        this.edible = edible;
    }

    public void setNutritionalContent(List<String> nutritionalContent) {
        this.nutritionalContent = nutritionalContent;
    }

    public List<String> getNutritionalContent() {
        return nutritionalContent;
    }

}
