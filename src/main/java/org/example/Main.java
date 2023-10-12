package org.example;

import org.example.restaurant.entities.Personnel;
import org.example.restaurant.enums.Roles;
import org.example.restaurant.resources.FoodVendor;
import org.example.restaurant.serviceimpl.AffiliationImpl;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Personnel personnel = new Personnel();
        personnel.setName("George Wilson");
        personnel.setRoles(Roles.MANAGER);

        FoodVendor foodVendor = new FoodVendor();
        FoodVendor foodVendor2 = new FoodVendor();
        foodVendor.setName("Rice & CO LTD");
        foodVendor.setLocation("Lekki, Lagos");
        foodVendor.setIngredients("rice, beans, fish, milk, garri");

        foodVendor2.setName("Beans of Life LTD");
        foodVendor2.setLocation("Ikeja, Lagos");
        foodVendor2.setIngredients("rice, beans, fish, milk, garri");
        FoodVendor.listOfVendors.addAll(Arrays.asList(foodVendor,foodVendor2));


//        AffiliationImpl affiliation = new AffiliationImpl();
//        affiliation.vendorRelations(personnel, foodVendor);
//        System.out.println(affiliation.vendorRelations(personnel, foodVendor2));
    }
}