package org.example.restaurant.services;

import org.example.restaurant.entities.Personnel;
import org.example.restaurant.resources.Equipment;
import org.example.restaurant.resources.FoodVendor;

import java.util.List;

public interface ResourceAffiliation {
    // using the List<FoodVendor> format makes it such that the whole list is affected, not just the last values inputted.
    List<FoodVendor> vendorRelations(Personnel personnel, FoodVendor vendor);
    void equipmentRelations(Personnel personnel, Equipment equipment);

}
