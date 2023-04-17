package com.pds.models;

public class IndividualVehicle extends Vehicle{

    public IndividualVehicle() {
    }

    public IndividualVehicle(String name, Customer customer) {
        super(name, customer);
    }

    @Override
    public String getType() {
        return "Individual";
    }
}
