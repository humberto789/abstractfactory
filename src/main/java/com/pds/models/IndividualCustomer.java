package com.pds.models;

public class IndividualCustomer extends Customer{

    public IndividualCustomer() {
    }

    public IndividualCustomer(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Individual";
    }
}
