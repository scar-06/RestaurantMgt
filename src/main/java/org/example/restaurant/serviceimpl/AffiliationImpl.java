package org.example.restaurant.serviceimpl;

import org.example.restaurant.entities.Personnel;
import org.example.restaurant.resources.Equipment;
import org.example.restaurant.resources.FoodVendor;
import org.example.restaurant.services.ResourceAffiliation;

import java.util.List;

public class AffiliationImpl implements ResourceAffiliation {

    @Override
    public List<FoodVendor> vendorRelations(Personnel personnel, FoodVendor vendor) {

        FoodVendor.listOfVendors.add(vendor);
        return FoodVendor.listOfVendors;
    }

    @Override
    public void equipmentRelations(Personnel personnel, Equipment equipment) {

    }

}
