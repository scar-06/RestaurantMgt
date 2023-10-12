package org.example.restaurant.resources;

import org.example.restaurant.enums.Ingredients;

import java.util.ArrayList;
import java.util.List;

public class FoodVendor {
    private String name;
    public static List<FoodVendor> listOfVendors = new ArrayList<>();
    private String ingredients;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "FoodVendor{" +
                "name=" + name +
                ", ingredients=" + ingredients +
                ", location='" + location + '\'' +
                '}';
    }
}
