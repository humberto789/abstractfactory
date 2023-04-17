package com.pds.models;

public class EnterpriseVehicle extends Vehicle{

    public EnterpriseVehicle() {
    }

    public EnterpriseVehicle(String name, Customer customer) {
        super(name, customer);
    }

    @Override
    public String getType() {
        return "Enterprise";
    }
}
