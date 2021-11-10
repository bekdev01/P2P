package uz.pdp.model;

import uz.pdp.model.base.BaseModel;

public class Category extends BaseModel {
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public Category() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
